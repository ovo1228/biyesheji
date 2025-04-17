package com.dao;

import com.entity.QiyezhaopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiyezhaopinVO;
import com.entity.view.QiyezhaopinView;


/**
 * 学生报修
 * 
 * @author 
 * @email 
 * @date 2023-03-24 23:21:49
 */
public interface QiyezhaopinDao extends BaseMapper<QiyezhaopinEntity> {
	
	List<QiyezhaopinVO> selectListVO(@Param("ew") Wrapper<QiyezhaopinEntity> wrapper);
	
	QiyezhaopinVO selectVO(@Param("ew") Wrapper<QiyezhaopinEntity> wrapper);
	
	List<QiyezhaopinView> selectListView(@Param("ew") Wrapper<QiyezhaopinEntity> wrapper);

	List<QiyezhaopinView> selectListView(Pagination page,@Param("ew") Wrapper<QiyezhaopinEntity> wrapper);
	
	QiyezhaopinView selectView(@Param("ew") Wrapper<QiyezhaopinEntity> wrapper);
	

}
