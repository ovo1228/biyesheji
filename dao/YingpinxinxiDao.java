package com.dao;

import com.entity.YingpinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingpinxinxiVO;
import com.entity.view.YingpinxinxiView;


/**
 * 维修调度
 * 
 * @author 
 * @email 
 * @date 2023-03-24 23:21:49
 */
public interface YingpinxinxiDao extends BaseMapper<YingpinxinxiEntity> {
	
	List<YingpinxinxiVO> selectListVO(@Param("ew") Wrapper<YingpinxinxiEntity> wrapper);
	
	YingpinxinxiVO selectVO(@Param("ew") Wrapper<YingpinxinxiEntity> wrapper);
	
	List<YingpinxinxiView> selectListView(@Param("ew") Wrapper<YingpinxinxiEntity> wrapper);

	List<YingpinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YingpinxinxiEntity> wrapper);
	
	YingpinxinxiView selectView(@Param("ew") Wrapper<YingpinxinxiEntity> wrapper);
	

}
