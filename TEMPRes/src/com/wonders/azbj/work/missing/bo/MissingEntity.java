package  com.wonders.azbj.work.missing.bo;

import java.util.Date;

import java.sql.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.OneToOne;
import gov.util.jpa.entity.IRemovable;

import org.hibernate.annotations.GenericGenerator;
import java.io.Serializable;
import org.apache.log4j.Logger;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * <p>Title: MissingEntity类/p>
 * <p>Description: Entity for AZBJ_XLBMCZ</p>
 * @author Auto generated
 * @version 0.5
 */
@Entity
@Table(name = "AZBJ_XLBMCZ")
public class MissingEntity implements Serializable,IRemovable{

	public static final Logger logger = Logger.getLogger(MissingEntity.class);
	
	/**
	 * ID
	 */
	private String isRemoved;
	/**
	 * 录入时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date lts;
	/**
	 * 对象标识
	 */
	private String pid;
	/**
	 * 姓名
	 */
	private String xingming;
	/**
	 * 区县
	 */
	private String quxianCode;
	/**
	 * QUXIAN_TEXT
	 */
	private String quxianText;
	/**
	 * 街镇
	 */
	private String jiezhenCode;
	/**
	 * JIEZHEN_TEXT
	 */
	private String jiezhenText;
	/**
	 * 终止类型
	 */
	private String jibieCode;
	/**
	 * JIBIE_TEXT
	 */
	private String jibieText;
	/**
	 * 年月
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date nianyue;
	/**
	 * 下落不明原因
	 */
	private String yuanyin;
	/**
	 * 下落不明起时
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date qishi;
	/**
	 * 能否联系
	 */
	private String nengfoulianxiCode;
	/**
	 * NENGFOULIANXI_TEXT
	 */
	private String nengfoulianxiText;
	/**
	 * 曾居住地
	 */
	private String cengjuzhudi;
	/**
	 * 信息来源
	 */
	private String xinxilaiyuanCode;
	/**
	 * XINXILAIYUAN_TEXT
	 */
	private String xinxilaiyuanText;
	/**
	 * 信息来源其他
	 */
	private String xinxilaiyuanQita;
	/**
	 * 已采取查找方式
	 */
	private String chazhaofangshiCode;
	/**
	 * CHAZHAOFANGSHI_TEXT
	 */
	private String chazhaofangshiText;
	/**
	 * 已采取查找方式其他
	 */
	private String chazhaofangshiQita;
	/**
	 * 通话时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date tonghuashijian;
	/**
	 * 接电人
	 */
	private String jiedianren;
	/**
	 * 通话内容
	 */
	private String tonghuaneirong;
	/**
	 * 通话记录人
	 */
	private String tonghuajiluren;
	/**
	 * 查访时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date chafangshijian;
	/**
	 * 下阶段查找方案
	 */
	private String xiajieduanchazhaofangan;
	/**
	 * 备注
	 */
	private String beizhu;
	/**
	 * 查访地点
	 */
	private String chafangdidian;
	/**
	 * 查访结果
	 */
	private String chafangjieguo;
	/**
	 * 查访记录人
	 */
	private String chafangjiluren;
	/**
	 * 删除标识
	 */
	private String removed;
	/**
	 * 创建人
	 */
	private String createUserId;
	/**
	 * 创建人姓名
	 */
	private String createUserName;
	
	/**
	 * ID
	 * @return isRemoved
	 */
	@Id
	@Column(name = "ID" ,unique = true ,nullable = false)
	@GeneratedValue(generator = "idGenerator")
	@GenericGenerator(name = "idGenerator" ,strategy = "uuid")
	public String getIsRemoved(){
		return this.isRemoved;
	}
	/**
	 * 录入时间
	 * @return lts
	 */
	@Column(name = "LTS")
	public Date getLts(){
		return this.lts;
	}
	/**
	 * 对象标识
	 * @return pid
	 */
	@Column(name = "PID")
	public String getPid(){
		return this.pid;
	}
	/**
	 * 姓名
	 * @return xingming
	 */
	@Column(name = "XINGMING")
	public String getXingming(){
		return this.xingming;
	}
	/**
	 * 区县
	 * @return quxianCode
	 */
	@Column(name = "QUXIAN_CODE")
	public String getQuxianCode(){
		return this.quxianCode;
	}
	/**
	 * QUXIAN_TEXT
	 * @return quxianText
	 */
	@Column(name = "QUXIAN_TEXT")
	public String getQuxianText(){
		return this.quxianText;
	}
	/**
	 * 街镇
	 * @return jiezhenCode
	 */
	@Column(name = "JIEZHEN_CODE")
	public String getJiezhenCode(){
		return this.jiezhenCode;
	}
	/**
	 * JIEZHEN_TEXT
	 * @return jiezhenText
	 */
	@Column(name = "JIEZHEN_TEXT")
	public String getJiezhenText(){
		return this.jiezhenText;
	}
	/**
	 * 终止类型
	 * @return jibieCode
	 */
	@Column(name = "JIBIE_CODE")
	public String getJibieCode(){
		return this.jibieCode;
	}
	/**
	 * JIBIE_TEXT
	 * @return jibieText
	 */
	@Column(name = "JIBIE_TEXT")
	public String getJibieText(){
		return this.jibieText;
	}
	/**
	 * 年月
	 * @return nianyue
	 */
	@Column(name = "NIANYUE")
	public Date getNianyue(){
		return this.nianyue;
	}
	/**
	 * 下落不明原因
	 * @return yuanyin
	 */
	@Column(name = "YUANYIN")
	public String getYuanyin(){
		return this.yuanyin;
	}
	/**
	 * 下落不明起时
	 * @return qishi
	 */
	@Column(name = "QISHI")
	public Date getQishi(){
		return this.qishi;
	}
	/**
	 * 能否联系
	 * @return nengfoulianxiCode
	 */
	@Column(name = "NENGFOULIANXI_CODE")
	public String getNengfoulianxiCode(){
		return this.nengfoulianxiCode;
	}
	/**
	 * NENGFOULIANXI_TEXT
	 * @return nengfoulianxiText
	 */
	@Column(name = "NENGFOULIANXI_TEXT")
	public String getNengfoulianxiText(){
		return this.nengfoulianxiText;
	}
	/**
	 * 曾居住地
	 * @return cengjuzhudi
	 */
	@Column(name = "CENGJUZHUDI")
	public String getCengjuzhudi(){
		return this.cengjuzhudi;
	}
	/**
	 * 信息来源
	 * @return xinxilaiyuanCode
	 */
	@Column(name = "XINXILAIYUAN_CODE")
	public String getXinxilaiyuanCode(){
		return this.xinxilaiyuanCode;
	}
	/**
	 * XINXILAIYUAN_TEXT
	 * @return xinxilaiyuanText
	 */
	@Column(name = "XINXILAIYUAN_TEXT")
	public String getXinxilaiyuanText(){
		return this.xinxilaiyuanText;
	}
	/**
	 * 信息来源其他
	 * @return xinxilaiyuanQita
	 */
	@Column(name = "XINXILAIYUAN_QITA")
	public String getXinxilaiyuanQita(){
		return this.xinxilaiyuanQita;
	}
	/**
	 * 已采取查找方式
	 * @return chazhaofangshiCode
	 */
	@Column(name = "CHAZHAOFANGSHI_CODE")
	public String getChazhaofangshiCode(){
		return this.chazhaofangshiCode;
	}
	/**
	 * CHAZHAOFANGSHI_TEXT
	 * @return chazhaofangshiText
	 */
	@Column(name = "CHAZHAOFANGSHI_TEXT")
	public String getChazhaofangshiText(){
		return this.chazhaofangshiText;
	}
	/**
	 * 已采取查找方式其他
	 * @return chazhaofangshiQita
	 */
	@Column(name = "CHAZHAOFANGSHI_QITA")
	public String getChazhaofangshiQita(){
		return this.chazhaofangshiQita;
	}
	/**
	 * 通话时间
	 * @return tonghuashijian
	 */
	@Column(name = "TONGHUASHIJIAN")
	public Date getTonghuashijian(){
		return this.tonghuashijian;
	}
	/**
	 * 接电人
	 * @return jiedianren
	 */
	@Column(name = "JIEDIANREN")
	public String getJiedianren(){
		return this.jiedianren;
	}
	/**
	 * 通话内容
	 * @return tonghuaneirong
	 */
	@Column(name = "TONGHUANEIRONG")
	public String getTonghuaneirong(){
		return this.tonghuaneirong;
	}
	/**
	 * 通话记录人
	 * @return tonghuajiluren
	 */
	@Column(name = "TONGHUAJILUREN")
	public String getTonghuajiluren(){
		return this.tonghuajiluren;
	}
	/**
	 * 查访时间
	 * @return chafangshijian
	 */
	@Column(name = "CHAFANGSHIJIAN")
	public Date getChafangshijian(){
		return this.chafangshijian;
	}
	/**
	 * 下阶段查找方案
	 * @return xiajieduanchazhaofangan
	 */
	@Column(name = "XIAJIEDUANCHAZHAOFANGAN")
	public String getXiajieduanchazhaofangan(){
		return this.xiajieduanchazhaofangan;
	}
	/**
	 * 备注
	 * @return beizhu
	 */
	@Column(name = "BEIZHU")
	public String getBeizhu(){
		return this.beizhu;
	}
	/**
	 * 查访地点
	 * @return chafangdidian
	 */
	@Column(name = "CHAFANGDIDIAN")
	public String getChafangdidian(){
		return this.chafangdidian;
	}
	/**
	 * 查访结果
	 * @return chafangjieguo
	 */
	@Column(name = "CHAFANGJIEGUO")
	public String getChafangjieguo(){
		return this.chafangjieguo;
	}
	/**
	 * 查访记录人
	 * @return chafangjiluren
	 */
	@Column(name = "CHAFANGJILUREN")
	public String getChafangjiluren(){
		return this.chafangjiluren;
	}
	/**
	 * 删除标识
	 * @return removed
	 */
	@Column(name = "REMOVED")
	public String getRemoved(){
		return this.removed;
	}
	/**
	 * 创建人
	 * @return createUserId
	 */
	@Column(name = "CREATE_USER_ID")
	public String getCreateUserId(){
		return this.createUserId;
	}
	/**
	 * 创建人姓名
	 * @return createUserName
	 */
	@Column(name = "CREATE_USER_NAME")
	public String getCreateUserName(){
		return this.createUserName;
	}
	/**
	 * ID
	 * @param isRemoved ID
	 */
	public void setIsRemoved(String isRemoved){
		this.isRemoved = isRemoved;
	}
	/**
	 * 录入时间
	 * @param lts 录入时间
	 */
	public void setLts(Date lts){
		this.lts = lts;
	}
	/**
	 * 对象标识
	 * @param pid 对象标识
	 */
	public void setPid(String pid){
		this.pid = pid;
	}
	/**
	 * 姓名
	 * @param xingming 姓名
	 */
	public void setXingming(String xingming){
		this.xingming = xingming;
	}
	/**
	 * 区县
	 * @param quxianCode 区县
	 */
	public void setQuxianCode(String quxianCode){
		this.quxianCode = quxianCode;
	}
	/**
	 * QUXIAN_TEXT
	 * @param quxianText QUXIAN_TEXT
	 */
	public void setQuxianText(String quxianText){
		this.quxianText = quxianText;
	}
	/**
	 * 街镇
	 * @param jiezhenCode 街镇
	 */
	public void setJiezhenCode(String jiezhenCode){
		this.jiezhenCode = jiezhenCode;
	}
	/**
	 * JIEZHEN_TEXT
	 * @param jiezhenText JIEZHEN_TEXT
	 */
	public void setJiezhenText(String jiezhenText){
		this.jiezhenText = jiezhenText;
	}
	/**
	 * 终止类型
	 * @param jibieCode 终止类型
	 */
	public void setJibieCode(String jibieCode){
		this.jibieCode = jibieCode;
	}
	/**
	 * JIBIE_TEXT
	 * @param jibieText JIBIE_TEXT
	 */
	public void setJibieText(String jibieText){
		this.jibieText = jibieText;
	}
	/**
	 * 年月
	 * @param nianyue 年月
	 */
	public void setNianyue(Date nianyue){
		this.nianyue = nianyue;
	}
	/**
	 * 下落不明原因
	 * @param yuanyin 下落不明原因
	 */
	public void setYuanyin(String yuanyin){
		this.yuanyin = yuanyin;
	}
	/**
	 * 下落不明起时
	 * @param qishi 下落不明起时
	 */
	public void setQishi(Date qishi){
		this.qishi = qishi;
	}
	/**
	 * 能否联系
	 * @param nengfoulianxiCode 能否联系
	 */
	public void setNengfoulianxiCode(String nengfoulianxiCode){
		this.nengfoulianxiCode = nengfoulianxiCode;
	}
	/**
	 * NENGFOULIANXI_TEXT
	 * @param nengfoulianxiText NENGFOULIANXI_TEXT
	 */
	public void setNengfoulianxiText(String nengfoulianxiText){
		this.nengfoulianxiText = nengfoulianxiText;
	}
	/**
	 * 曾居住地
	 * @param cengjuzhudi 曾居住地
	 */
	public void setCengjuzhudi(String cengjuzhudi){
		this.cengjuzhudi = cengjuzhudi;
	}
	/**
	 * 信息来源
	 * @param xinxilaiyuanCode 信息来源
	 */
	public void setXinxilaiyuanCode(String xinxilaiyuanCode){
		this.xinxilaiyuanCode = xinxilaiyuanCode;
	}
	/**
	 * XINXILAIYUAN_TEXT
	 * @param xinxilaiyuanText XINXILAIYUAN_TEXT
	 */
	public void setXinxilaiyuanText(String xinxilaiyuanText){
		this.xinxilaiyuanText = xinxilaiyuanText;
	}
	/**
	 * 信息来源其他
	 * @param xinxilaiyuanQita 信息来源其他
	 */
	public void setXinxilaiyuanQita(String xinxilaiyuanQita){
		this.xinxilaiyuanQita = xinxilaiyuanQita;
	}
	/**
	 * 已采取查找方式
	 * @param chazhaofangshiCode 已采取查找方式
	 */
	public void setChazhaofangshiCode(String chazhaofangshiCode){
		this.chazhaofangshiCode = chazhaofangshiCode;
	}
	/**
	 * CHAZHAOFANGSHI_TEXT
	 * @param chazhaofangshiText CHAZHAOFANGSHI_TEXT
	 */
	public void setChazhaofangshiText(String chazhaofangshiText){
		this.chazhaofangshiText = chazhaofangshiText;
	}
	/**
	 * 已采取查找方式其他
	 * @param chazhaofangshiQita 已采取查找方式其他
	 */
	public void setChazhaofangshiQita(String chazhaofangshiQita){
		this.chazhaofangshiQita = chazhaofangshiQita;
	}
	/**
	 * 通话时间
	 * @param tonghuashijian 通话时间
	 */
	public void setTonghuashijian(Date tonghuashijian){
		this.tonghuashijian = tonghuashijian;
	}
	/**
	 * 接电人
	 * @param jiedianren 接电人
	 */
	public void setJiedianren(String jiedianren){
		this.jiedianren = jiedianren;
	}
	/**
	 * 通话内容
	 * @param tonghuaneirong 通话内容
	 */
	public void setTonghuaneirong(String tonghuaneirong){
		this.tonghuaneirong = tonghuaneirong;
	}
	/**
	 * 通话记录人
	 * @param tonghuajiluren 通话记录人
	 */
	public void setTonghuajiluren(String tonghuajiluren){
		this.tonghuajiluren = tonghuajiluren;
	}
	/**
	 * 查访时间
	 * @param chafangshijian 查访时间
	 */
	public void setChafangshijian(Date chafangshijian){
		this.chafangshijian = chafangshijian;
	}
	/**
	 * 下阶段查找方案
	 * @param xiajieduanchazhaofangan 下阶段查找方案
	 */
	public void setXiajieduanchazhaofangan(String xiajieduanchazhaofangan){
		this.xiajieduanchazhaofangan = xiajieduanchazhaofangan;
	}
	/**
	 * 备注
	 * @param beizhu 备注
	 */
	public void setBeizhu(String beizhu){
		this.beizhu = beizhu;
	}
	/**
	 * 查访地点
	 * @param chafangdidian 查访地点
	 */
	public void setChafangdidian(String chafangdidian){
		this.chafangdidian = chafangdidian;
	}
	/**
	 * 查访结果
	 * @param chafangjieguo 查访结果
	 */
	public void setChafangjieguo(String chafangjieguo){
		this.chafangjieguo = chafangjieguo;
	}
	/**
	 * 查访记录人
	 * @param chafangjiluren 查访记录人
	 */
	public void setChafangjiluren(String chafangjiluren){
		this.chafangjiluren = chafangjiluren;
	}
	/**
	 * 删除标识
	 * @param removed 删除标识
	 */
	public void setRemoved(String removed){
		this.removed = removed;
	}
	/**
	 * 创建人
	 * @param createUserId 创建人
	 */
	public void setCreateUserId(String createUserId){
		this.createUserId = createUserId;
	}
	/**
	 * 创建人姓名
	 * @param createUserName 创建人姓名
	 */
	public void setCreateUserName(String createUserName){
		this.createUserName = createUserName;
	}
}
