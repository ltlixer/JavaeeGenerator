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
 * <p>Title: ResettleBaseEntity��/p>
 * <p>Description: Entity for AZBJ_GZZT_BASEINFO</p>
 * @author Auto generated
 * @version 0.5
 */
@Entity
@Table(name = "AZBJ_GZZT_BASEINFO")
public class ResettleBaseEntity implements Serializable,IRemovable{

	public static final Logger logger = Logger.getLogger(ResettleBaseEntity.class);
	
	/**
	 * ��ʶ
	 */
	private String isRemoved;
	/**
	 * ¼��ʱ��
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date lts;
	/**
	 * ��������(�������ڡ������С���;֮�ҡ���ҵ����)
	 */
	private String typeCode;
	/**
	 * ������������
	 */
	private String typeText;
	/**
	 * ������λ
	 */
	private String suoshudanwei;
	/**
	 * ����
	 */
	private String mingcheng;
	/**
	 * ��ַ
	 */
	private String dizhi;
	/**
	 * ������
	 */
	private String daibiaoren;
	/**
	 * �Ǽ���
	 */
	private String dengjima;
	/**
	 * ���
	 */
	private String leibie;
	/**
	 * ��ϵ��ʽ
	 */
	private String lianxifangshi;
	/**
	 * ɾ����ʶ
	 */
	private String removed;
	/**
	 * ������
	 */
	private String createUserId;
	/**
	 * ����������
	 */
	private String createUserName;
	/**
	 * ��������
	 */
	private String quxianId;
	/**
	 * ������������
	 */
	private String quxianName;
	/**
	 * ��ע
	 */
	private String remark;
	
	/**
	 * ��ʶ
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
	 * ¼��ʱ��
	 * @return lts
	 */
	@Column(name = "LTS")
	public Date getLts(){
		return this.lts;
	}
	/**
	 * ��������(�������ڡ������С���;֮�ҡ���ҵ����)
	 * @return typeCode
	 */
	@Column(name = "TYPE_CODE")
	public String getTypeCode(){
		return this.typeCode;
	}
	/**
	 * ������������
	 * @return typeText
	 */
	@Column(name = "TYPE_TEXT")
	public String getTypeText(){
		return this.typeText;
	}
	/**
	 * ������λ
	 * @return suoshudanwei
	 */
	@Column(name = "SUOSHUDANWEI")
	public String getSuoshudanwei(){
		return this.suoshudanwei;
	}
	/**
	 * ����
	 * @return mingcheng
	 */
	@Column(name = "MINGCHENG")
	public String getMingcheng(){
		return this.mingcheng;
	}
	/**
	 * ��ַ
	 * @return dizhi
	 */
	@Column(name = "DIZHI")
	public String getDizhi(){
		return this.dizhi;
	}
	/**
	 * ������
	 * @return daibiaoren
	 */
	@Column(name = "DAIBIAOREN")
	public String getDaibiaoren(){
		return this.daibiaoren;
	}
	/**
	 * �Ǽ���
	 * @return dengjima
	 */
	@Column(name = "DENGJIMA")
	public String getDengjima(){
		return this.dengjima;
	}
	/**
	 * ���
	 * @return leibie
	 */
	@Column(name = "LEIBIE")
	public String getLeibie(){
		return this.leibie;
	}
	/**
	 * ��ϵ��ʽ
	 * @return lianxifangshi
	 */
	@Column(name = "LIANXIFANGSHI")
	public String getLianxifangshi(){
		return this.lianxifangshi;
	}
	/**
	 * ɾ����ʶ
	 * @return removed
	 */
	@Column(name = "REMOVED")
	public String getRemoved(){
		return this.removed;
	}
	/**
	 * ������
	 * @return createUserId
	 */
	@Column(name = "CREATE_USER_ID")
	public String getCreateUserId(){
		return this.createUserId;
	}
	/**
	 * ����������
	 * @return createUserName
	 */
	@Column(name = "CREATE_USER_NAME")
	public String getCreateUserName(){
		return this.createUserName;
	}
	/**
	 * ��������
	 * @return quxianId
	 */
	@Column(name = "QUXIAN_ID")
	public String getQuxianId(){
		return this.quxianId;
	}
	/**
	 * ������������
	 * @return quxianName
	 */
	@Column(name = "QUXIAN_NAME")
	public String getQuxianName(){
		return this.quxianName;
	}
	/**
	 * ��ע
	 * @return remark
	 */
	@Column(name = "REMARK")
	public String getRemark(){
		return this.remark;
	}
	/**
	 * ��ʶ
	 * @param isRemoved ��ʶ
	 */
	public void setIsRemoved(String isRemoved){
		this.isRemoved = isRemoved;
	}
	/**
	 * ¼��ʱ��
	 * @param lts ¼��ʱ��
	 */
	public void setLts(Date lts){
		this.lts = lts;
	}
	/**
	 * ��������(�������ڡ������С���;֮�ҡ���ҵ����)
	 * @param typeCode ��������(�������ڡ������С���;֮�ҡ���ҵ����)
	 */
	public void setTypeCode(String typeCode){
		this.typeCode = typeCode;
	}
	/**
	 * ������������
	 * @param typeText ������������
	 */
	public void setTypeText(String typeText){
		this.typeText = typeText;
	}
	/**
	 * ������λ
	 * @param suoshudanwei ������λ
	 */
	public void setSuoshudanwei(String suoshudanwei){
		this.suoshudanwei = suoshudanwei;
	}
	/**
	 * ����
	 * @param mingcheng ����
	 */
	public void setMingcheng(String mingcheng){
		this.mingcheng = mingcheng;
	}
	/**
	 * ��ַ
	 * @param dizhi ��ַ
	 */
	public void setDizhi(String dizhi){
		this.dizhi = dizhi;
	}
	/**
	 * ������
	 * @param daibiaoren ������
	 */
	public void setDaibiaoren(String daibiaoren){
		this.daibiaoren = daibiaoren;
	}
	/**
	 * �Ǽ���
	 * @param dengjima �Ǽ���
	 */
	public void setDengjima(String dengjima){
		this.dengjima = dengjima;
	}
	/**
	 * ���
	 * @param leibie ���
	 */
	public void setLeibie(String leibie){
		this.leibie = leibie;
	}
	/**
	 * ��ϵ��ʽ
	 * @param lianxifangshi ��ϵ��ʽ
	 */
	public void setLianxifangshi(String lianxifangshi){
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * ɾ����ʶ
	 * @param removed ɾ����ʶ
	 */
	public void setRemoved(String removed){
		this.removed = removed;
	}
	/**
	 * ������
	 * @param createUserId ������
	 */
	public void setCreateUserId(String createUserId){
		this.createUserId = createUserId;
	}
	/**
	 * ����������
	 * @param createUserName ����������
	 */
	public void setCreateUserName(String createUserName){
		this.createUserName = createUserName;
	}
	/**
	 * ��������
	 * @param quxianId ��������
	 */
	public void setQuxianId(String quxianId){
		this.quxianId = quxianId;
	}
	/**
	 * ������������
	 * @param quxianName ������������
	 */
	public void setQuxianName(String quxianName){
		this.quxianName = quxianName;
	}
	/**
	 * ��ע
	 * @param remark ��ע
	 */
	public void setRemark(String remark){
		this.remark = remark;
	}
}
