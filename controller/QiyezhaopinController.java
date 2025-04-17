package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.QiyezhaopinEntity;
import com.entity.view.QiyezhaopinView;

import com.service.QiyezhaopinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 学生报修
 * 后端接口
 * @author 
 * @email 
 * @date 2023-03-24 23:21:49
 */
@RestController
@RequestMapping("/qiyezhaopin")
public class QiyezhaopinController {
    @Autowired
    private QiyezhaopinService qiyezhaopinService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QiyezhaopinEntity qiyezhaopin,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("qiye")) {
			qiyezhaopin.setQiyemingcheng((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<QiyezhaopinEntity> ew = new EntityWrapper<QiyezhaopinEntity>();

		PageUtils page = qiyezhaopinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiyezhaopin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QiyezhaopinEntity qiyezhaopin, 
		HttpServletRequest request){
        EntityWrapper<QiyezhaopinEntity> ew = new EntityWrapper<QiyezhaopinEntity>();

		PageUtils page = qiyezhaopinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiyezhaopin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QiyezhaopinEntity qiyezhaopin){
       	EntityWrapper<QiyezhaopinEntity> ew = new EntityWrapper<QiyezhaopinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( qiyezhaopin, "qiyezhaopin")); 
        return R.ok().put("data", qiyezhaopinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QiyezhaopinEntity qiyezhaopin){
        EntityWrapper< QiyezhaopinEntity> ew = new EntityWrapper< QiyezhaopinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( qiyezhaopin, "qiyezhaopin")); 
		QiyezhaopinView qiyezhaopinView =  qiyezhaopinService.selectView(ew);
		return R.ok("查询学生报修成功").put("data", qiyezhaopinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QiyezhaopinEntity qiyezhaopin = qiyezhaopinService.selectById(id);
        return R.ok().put("data", qiyezhaopin);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QiyezhaopinEntity qiyezhaopin = qiyezhaopinService.selectById(id);
        return R.ok().put("data", qiyezhaopin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QiyezhaopinEntity qiyezhaopin, HttpServletRequest request){
    	qiyezhaopin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qiyezhaopin);
        qiyezhaopinService.insert(qiyezhaopin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QiyezhaopinEntity qiyezhaopin, HttpServletRequest request){
    	qiyezhaopin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qiyezhaopin);
        qiyezhaopinService.insert(qiyezhaopin);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody QiyezhaopinEntity qiyezhaopin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(qiyezhaopin);
        qiyezhaopinService.updateById(qiyezhaopin);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        qiyezhaopinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<QiyezhaopinEntity> wrapper = new EntityWrapper<QiyezhaopinEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("qiye")) {
			wrapper.eq("qiyemingcheng", (String)request.getSession().getAttribute("username"));
		}

		int count = qiyezhaopinService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
