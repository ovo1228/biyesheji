package com.entity.model;

import com.entity.YingpinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 维修调度
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-24 23:21:49
 */
public class YingpinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 楼栋名称
	 */
	
	private String xingyelingyu;
		
	/**
	 * 紧急程度
	 */
	
	private String gangweifenlei;
		
	/**
	 * 照片
	 */
	
	private String touxiang;
		
	/**
	 * 宿舍类型
	 */
	
	private String xinzidaiyu;
		
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
	 * 账号
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机号
	 */
	
	private String shoujihao;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 学历
	 */
	
	private String xueli;
		
	/**
	 * 居住地址
	 */
	
	private String biyexueyuan;
		
	/**
	 * 当天是否完成
	 */
	
	private String fucongdiaopei;
		
	/**
	 * 维修时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yingpinshijian;
		
	/**
	 * 个人优势
	 */
	
	private String gerenyoushi;
		
	/**
	 * 维修过程
	 */
	
	private String gongzuojingyan;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核结果
	 */
	
	private String shhf;
				
	
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
	 * 设置：照片
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：照片
	 */
	public String getTouxiang() {
		return touxiang;
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
	 * 设置：账号
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：账号
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
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
	 * 设置：手机号
	 */
	 
	public void setShoujihao(String shoujihao) {
		this.shoujihao = shoujihao;
	}
	
	/**
	 * 获取：手机号
	 */
	public String getShoujihao() {
		return shoujihao;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：学历
	 */
	 
	public void setXueli(String xueli) {
		this.xueli = xueli;
	}
	
	/**
	 * 获取：学历
	 */
	public String getXueli() {
		return xueli;
	}
				
	
	/**
	 * 设置：居住地址
	 */
	 
	public void setBiyexueyuan(String biyexueyuan) {
		this.biyexueyuan = biyexueyuan;
	}
	
	/**
	 * 获取：居住地址
	 */
	public String getBiyexueyuan() {
		return biyexueyuan;
	}
				
	
	/**
	 * 设置：当天是否完成
	 */
	 
	public void setFucongdiaopei(String fucongdiaopei) {
		this.fucongdiaopei = fucongdiaopei;
	}
	
	/**
	 * 获取：当天是否完成
	 */
	public String getFucongdiaopei() {
		return fucongdiaopei;
	}
				
	
	/**
	 * 设置：维修时间
	 */
	 
	public void setYingpinshijian(Date yingpinshijian) {
		this.yingpinshijian = yingpinshijian;
	}
	
	/**
	 * 获取：维修时间
	 */
	public Date getYingpinshijian() {
		return yingpinshijian;
	}
				
	
	/**
	 * 设置：个人优势
	 */
	 
	public void setGerenyoushi(String gerenyoushi) {
		this.gerenyoushi = gerenyoushi;
	}
	
	/**
	 * 获取：个人优势
	 */
	public String getGerenyoushi() {
		return gerenyoushi;
	}
				
	
	/**
	 * 设置：维修过程
	 */
	 
	public void setGongzuojingyan(String gongzuojingyan) {
		this.gongzuojingyan = gongzuojingyan;
	}
	
	/**
	 * 获取：维修过程
	 */
	public String getGongzuojingyan() {
		return gongzuojingyan;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核结果
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核结果
	 */
	public String getShhf() {
		return shhf;
	}
			
}
