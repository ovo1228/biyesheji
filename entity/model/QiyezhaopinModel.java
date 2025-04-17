package com.entity.model;

import com.entity.QiyezhaopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学生报修
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-24 23:21:49
 */
public class QiyezhaopinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 紧急程度
	 */
	
	private String gangweifenlei;
		
	/**
	 * 楼栋名称
	 */
	
	private String xingyelingyu;
		
	/**
	 * 照片
	 */
	
	private String tupian;
		
	/**
	 * 楼层
	 */
	
	private String shangbandidian;
		
	/**
	 * 时间
	 */
	
	private String shangbanshijian;
		
	/**
	 * 宿舍类型
	 */
	
	private String xinzidaiyu;
		
	/**
	 * 床位号
	 */
	
	private String zhaopinrenshu;
		
	/**
	 * 学生名称
	 */
	
	private String qiyemingcheng;
		
	/**
	 * 宿舍号
	 */
	
	private String qiyedizhi;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 问题描述
	 */
	
	private String qiyejieshao;
		
	/**
	 * 维修要求
	 */
	
	private String renzhiyaoqiu;
				
	
	/**
	 * 设置：紧急程度
	 */
	 
	public void setGangweifenlei(String gangweifenlei) {
		this.gangweifenlei = gangweifenlei;
	}
	
	/**
	 * 获取：紧急程度
	 */
	public String getGangweifenlei() {
		return gangweifenlei;
	}
				
	
	/**
	 * 设置：楼栋名称
	 */
	 
	public void setXingyelingyu(String xingyelingyu) {
		this.xingyelingyu = xingyelingyu;
	}
	
	/**
	 * 获取：楼栋名称
	 */
	public String getXingyelingyu() {
		return xingyelingyu;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：楼层
	 */
	 
	public void setShangbandidian(String shangbandidian) {
		this.shangbandidian = shangbandidian;
	}
	
	/**
	 * 获取：楼层
	 */
	public String getShangbandidian() {
		return shangbandidian;
	}
				
	
	/**
	 * 设置：时间
	 */
	 
	public void setShangbanshijian(String shangbanshijian) {
		this.shangbanshijian = shangbanshijian;
	}
	
	/**
	 * 获取：时间
	 */
	public String getShangbanshijian() {
		return shangbanshijian;
	}
				
	
	/**
	 * 设置：宿舍类型
	 */
	 
	public void setXinzidaiyu(String xinzidaiyu) {
		this.xinzidaiyu = xinzidaiyu;
	}
	
	/**
	 * 获取：宿舍类型
	 */
	public String getXinzidaiyu() {
		return xinzidaiyu;
	}
				
	
	/**
	 * 设置：床位号
	 */
	 
	public void setZhaopinrenshu(String zhaopinrenshu) {
		this.zhaopinrenshu = zhaopinrenshu;
	}
	
	/**
	 * 获取：床位号
	 */
	public String getZhaopinrenshu() {
		return zhaopinrenshu;
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
	 * 设置：宿舍号
	 */
	 
	public void setQiyedizhi(String qiyedizhi) {
		this.qiyedizhi = qiyedizhi;
	}
	
	/**
	 * 获取：宿舍号
	 */
	public String getQiyedizhi() {
		return qiyedizhi;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：问题描述
	 */
	 
	public void setQiyejieshao(String qiyejieshao) {
		this.qiyejieshao = qiyejieshao;
	}
	
	/**
	 * 获取：问题描述
	 */
	public String getQiyejieshao() {
		return qiyejieshao;
	}
				
	
	/**
	 * 设置：维修要求
	 */
	 
	public void setRenzhiyaoqiu(String renzhiyaoqiu) {
		this.renzhiyaoqiu = renzhiyaoqiu;
	}
	
	/**
	 * 获取：维修要求
	 */
	public String getRenzhiyaoqiu() {
		return renzhiyaoqiu;
	}
			
}
