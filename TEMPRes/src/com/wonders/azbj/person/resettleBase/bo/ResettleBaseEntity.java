package  com.wonders.azbj.person.resettleBase.bo;

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
 * <p>Title: ResettleBaseEntity类/p>
 * <p>Description: Entity for AZBJ_GZZT_BASEINFO</p>
 * @author Auto generated
 * @version 0.5
 */
@Entity
@Table(name = "AZBJ_GZZT_BASEINFO")
public class ResettleBaseEntity implements Serializable,IRemovable{

	public static final Logger logger = Logger.getLogger(ResettleBaseEntity.class);
	
	/**
	 * 标识
	 */
	private String isRemoved;
	/**
	 * 录入时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date lts;
	/**
	 * 载体类型(公共户口、工作中、中途之家、就业基地)
	 */
	private String typeCode;
	/**
	 * 载体类型中文
	 */
	private String typeText;
	/**
	 * 所属单位
	 */
	private String suoshudanwei;
	/**
	 * 名称
	 */
	private String mingcheng;
	/**
	 * 地址
	 */
	private String dizhi;
	/**
	 * 代表人
	 */
	private String daibiaoren;
	/**
	 * 登记码
	 */
	private String dengjima;
	/**
	 * 类别
	 */
	private String leibie;
	/**
	 * 联系方式
	 */
	private String lianxifangshi;
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
	 * 所属区县
	 */
	private String quxianId;
	/**
	 * 所属区县名称
	 */
	private String quxianName;
	/**
	 * 备注
	 */
	private String remark;
	
	/**
	 * 标识
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
	 * 载体类型(公共户口、工作中、中途之家、就业基地)
	 * @return typeCode
	 */
	@Column(name = "TYPE_CODE")
	public String getTypeCode(){
		return this.typeCode;
	}
	/**
	 * 载体类型中文
	 * @return typeText
	 */
	@Column(name = "TYPE_TEXT")
	public String getTypeText(){
		return this.typeText;
	}
	/**
	 * 所属单位
	 * @return suoshudanwei
	 */
	@Column(name = "SUOSHUDANWEI")
	public String getSuoshudanwei(){
		return this.suoshudanwei;
	}
	/**
	 * 名称
	 * @return mingcheng
	 */
	@Column(name = "MINGCHENG")
	public String getMingcheng(){
		return this.mingcheng;
	}
	/**
	 * 地址
	 * @return dizhi
	 */
	@Column(name = "DIZHI")
	public String getDizhi(){
		return this.dizhi;
	}
	/**
	 * 代表人
	 * @return daibiaoren
	 */
	@Column(name = "DAIBIAOREN")
	public String getDaibiaoren(){
		return this.daibiaoren;
	}
	/**
	 * 登记码
	 * @return dengjima
	 */
	@Column(name = "DENGJIMA")
	public String getDengjima(){
		return this.dengjima;
	}
	/**
	 * 类别
	 * @return leibie
	 */
	@Column(name = "LEIBIE")
	public String getLeibie(){
		return this.leibie;
	}
	/**
	 * 联系方式
	 * @return lianxifangshi
	 */
	@Column(name = "LIANXIFANGSHI")
	public String getLianxifangshi(){
		return this.lianxifangshi;
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
	 * 所属区县
	 * @return quxianId
	 */
	@Column(name = "QUXIAN_ID")
	public String getQuxianId(){
		return this.quxianId;
	}
	/**
	 * 所属区县名称
	 * @return quxianName
	 */
	@Column(name = "QUXIAN_NAME")
	public String getQuxianName(){
		return this.quxianName;
	}
	/**
	 * 备注
	 * @return remark
	 */
	@Column(name = "REMARK")
	public String getRemark(){
		return this.remark;
	}
	/**
	 * 标识
	 * @param isRemoved 标识
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
	 * 载体类型(公共户口、工作中、中途之家、就业基地)
	 * @param typeCode 载体类型(公共户口、工作中、中途之家、就业基地)
	 */
	public void setTypeCode(String typeCode){
		this.typeCode = typeCode;
	}
	/**
	 * 载体类型中文
	 * @param typeText 载体类型中文
	 */
	public void setTypeText(String typeText){
		this.typeText = typeText;
	}
	/**
	 * 所属单位
	 * @param suoshudanwei 所属单位
	 */
	public void setSuoshudanwei(String suoshudanwei){
		this.suoshudanwei = suoshudanwei;
	}
	/**
	 * 名称
	 * @param mingcheng 名称
	 */
	public void setMingcheng(String mingcheng){
		this.mingcheng = mingcheng;
	}
	/**
	 * 地址
	 * @param dizhi 地址
	 */
	public void setDizhi(String dizhi){
		this.dizhi = dizhi;
	}
	/**
	 * 代表人
	 * @param daibiaoren 代表人
	 */
	public void setDaibiaoren(String daibiaoren){
		this.daibiaoren = daibiaoren;
	}
	/**
	 * 登记码
	 * @param dengjima 登记码
	 */
	public void setDengjima(String dengjima){
		this.dengjima = dengjima;
	}
	/**
	 * 类别
	 * @param leibie 类别
	 */
	public void setLeibie(String leibie){
		this.leibie = leibie;
	}
	/**
	 * 联系方式
	 * @param lianxifangshi 联系方式
	 */
	public void setLianxifangshi(String lianxifangshi){
		this.lianxifangshi = lianxifangshi;
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
	/**
	 * 所属区县
	 * @param quxianId 所属区县
	 */
	public void setQuxianId(String quxianId){
		this.quxianId = quxianId;
	}
	/**
	 * 所属区县名称
	 * @param quxianName 所属区县名称
	 */
	public void setQuxianName(String quxianName){
		this.quxianName = quxianName;
	}
	/**
	 * 备注
	 * @param remark 备注
	 */
	public void setRemark(String remark){
		this.remark = remark;
	}
}
