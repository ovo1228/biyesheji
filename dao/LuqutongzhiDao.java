package com.dao;

import com.entity.LuqutongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LuqutongzhiVO;
import com.entity.view.LuqutongzhiView;


/**
 * 维修结果
 * 
 * @author 
 * @email 
 * @date 2023-03-24 23:21:49
 */
public interface LuqutongzhiDao extends BaseMapper<LuqutongzhiEntity> {
	
	List<LuqutongzhiVO> selectListVO(@Param("ew") Wrapper<LuqutongzhiEntity> wrapper);
	
	LuqutongzhiVO selectVO(@Param("ew") Wrapper<LuqutongzhiEntity> wrapper);
	
	List<LuqutongzhiView> selectListView(@Param("ew") Wrapper<LuqutongzhiEntity> wrapper);

	List<LuqutongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<LuqutongzhiEntity> wrapper);
	
	LuqutongzhiView selectView(@Param("ew") Wrapper<LuqutongzhiEntity> wrapper);
	

}
