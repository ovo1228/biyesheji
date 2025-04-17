package com.dao;

import com.entity.XingyelingyuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XingyelingyuVO;
import com.entity.view.XingyelingyuView;


/**
 * 楼栋名称
 * 
 * @author 
 * @email 
 * @date 2023-03-24 23:21:48
 */
public interface XingyelingyuDao extends BaseMapper<XingyelingyuEntity> {
	
	List<XingyelingyuVO> selectListVO(@Param("ew") Wrapper<XingyelingyuEntity> wrapper);
	
	XingyelingyuVO selectVO(@Param("ew") Wrapper<XingyelingyuEntity> wrapper);
	
	List<XingyelingyuView> selectListView(@Param("ew") Wrapper<XingyelingyuEntity> wrapper);

	List<XingyelingyuView> selectListView(Pagination page,@Param("ew") Wrapper<XingyelingyuEntity> wrapper);
	
	XingyelingyuView selectView(@Param("ew") Wrapper<XingyelingyuEntity> wrapper);
	

}
