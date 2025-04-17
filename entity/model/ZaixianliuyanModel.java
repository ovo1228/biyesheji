package com.entity.model;

import com.entity.ZaixianliuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 在线留言
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-24 23:21:49
 */
public class ZaixianliuyanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 学生名称
	 */
	
	private String qiyemingcheng;
		
	/**
	 * 问题描述
	 */
	
	private String gangweimingcheng;
		
	/**
	 * 留言时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date liuyanshijian;
		
	/**
	 * 留言内容
	 */
	
	private String liuyanneirong;
		
	/**
	 * 回复结果内容
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：学生名称
	 */
	 
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	
	/**
	 * 获取：学生名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
				
	
	/**
	 * 设置：问题描述
	 */
	 
	public void setGangweimingcheng(String gangweimingcheng) {
		this.gangweimingcheng = gangweimingcheng;
	}
	
	/**
	 * 获取：问题描述
	 */
	public String getGangweimingcheng() {
		return gangweimingcheng;
	}
				
	
	/**
	 * 设置：留言时间
	 */
	 
	public void setLiuyanshijian(Date liuyanshijian) {
		this.liuyanshijian = liuyanshijian;
	}
	
	/**
	 * 获取：留言时间
	 */
	public Date getLiuyanshijian() {
		return liuyanshijian;
	}
				
	
	/**
	 * 设置：留言内容
	 */
	 
	public void setLiuyanneirong(String liuyanneirong) {
		this.liuyanneirong = liuyanneirong;
	}
	
	/**
	 * 获取：留言内容
	 */
	public String getLiuyanneirong() {
		return liuyanneirong;
	}
				
	
	/**
	 * 设置：回复结果内容
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：回复结果内容
	 */
	public String getShhf() {
		return shhf;
	}
			
}
