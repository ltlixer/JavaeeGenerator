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
 * <p>Title: MissingEntity��/p>
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
	 * ¼��ʱ��
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date lts;
	/**
	 * �����ʶ
	 */
	private String pid;
	/**
	 * ����
	 */
	private String xingming;
	/**
	 * ����
	 */
	private String quxianCode;
	/**
	 * QUXIAN_TEXT
	 */
	private String quxianText;
	/**
	 * ����
	 */
	private String jiezhenCode;
	/**
	 * JIEZHEN_TEXT
	 */
	private String jiezhenText;
	/**
	 * ��ֹ����
	 */
	private String jibieCode;
	/**
	 * JIBIE_TEXT
	 */
	private String jibieText;
	/**
	 * ����
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date nianyue;
	/**
	 * ���䲻��ԭ��
	 */
	private String yuanyin;
	/**
	 * ���䲻����ʱ
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date qishi;
	/**
	 * �ܷ���ϵ
	 */
	private String nengfoulianxiCode;
	/**
	 * NENGFOULIANXI_TEXT
	 */
	private String nengfoulianxiText;
	/**
	 * ����ס��
	 */
	private String cengjuzhudi;
	/**
	 * ��Ϣ��Դ
	 */
	private String xinxilaiyuanCode;
	/**
	 * XINXILAIYUAN_TEXT
	 */
	private String xinxilaiyuanText;
	/**
	 * ��Ϣ��Դ����
	 */
	private String xinxilaiyuanQita;
	/**
	 * �Ѳ�ȡ���ҷ�ʽ
	 */
	private String chazhaofangshiCode;
	/**
	 * CHAZHAOFANGSHI_TEXT
	 */
	private String chazhaofangshiText;
	/**
	 * �Ѳ�ȡ���ҷ�ʽ����
	 */
	private String chazhaofangshiQita;
	/**
	 * ͨ��ʱ��
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date tonghuashijian;
	/**
	 * �ӵ���
	 */
	private String jiedianren;
	/**
	 * ͨ������
	 */
	private String tonghuaneirong;
	/**
	 * ͨ����¼��
	 */
	private String tonghuajiluren;
	/**
	 * ���ʱ��
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date chafangshijian;
	/**
	 * �½׶β��ҷ���
	 */
	private String xiajieduanchazhaofangan;
	/**
	 * ��ע
	 */
	private String beizhu;
	/**
	 * ��õص�
	 */
	private String chafangdidian;
	/**
	 * ��ý��
	 */
	private String chafangjieguo;
	/**
	 * ��ü�¼��
	 */
	private String chafangjiluren;
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
	 * ¼��ʱ��
	 * @return lts
	 */
	@Column(name = "LTS")
	public Date getLts(){
		return this.lts;
	}
	/**
	 * �����ʶ
	 * @return pid
	 */
	@Column(name = "PID")
	public String getPid(){
		return this.pid;
	}
	/**
	 * ����
	 * @return xingming
	 */
	@Column(name = "XINGMING")
	public String getXingming(){
		return this.xingming;
	}
	/**
	 * ����
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
	 * ����
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
	 * ��ֹ����
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
	 * ����
	 * @return nianyue
	 */
	@Column(name = "NIANYUE")
	public Date getNianyue(){
		return this.nianyue;
	}
	/**
	 * ���䲻��ԭ��
	 * @return yuanyin
	 */
	@Column(name = "YUANYIN")
	public String getYuanyin(){
		return this.yuanyin;
	}
	/**
	 * ���䲻����ʱ
	 * @return qishi
	 */
	@Column(name = "QISHI")
	public Date getQishi(){
		return this.qishi;
	}
	/**
	 * �ܷ���ϵ
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
	 * ����ס��
	 * @return cengjuzhudi
	 */
	@Column(name = "CENGJUZHUDI")
	public String getCengjuzhudi(){
		return this.cengjuzhudi;
	}
	/**
	 * ��Ϣ��Դ
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
	 * ��Ϣ��Դ����
	 * @return xinxilaiyuanQita
	 */
	@Column(name = "XINXILAIYUAN_QITA")
	public String getXinxilaiyuanQita(){
		return this.xinxilaiyuanQita;
	}
	/**
	 * �Ѳ�ȡ���ҷ�ʽ
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
	 * �Ѳ�ȡ���ҷ�ʽ����
	 * @return chazhaofangshiQita
	 */
	@Column(name = "CHAZHAOFANGSHI_QITA")
	public String getChazhaofangshiQita(){
		return this.chazhaofangshiQita;
	}
	/**
	 * ͨ��ʱ��
	 * @return tonghuashijian
	 */
	@Column(name = "TONGHUASHIJIAN")
	public Date getTonghuashijian(){
		return this.tonghuashijian;
	}
	/**
	 * �ӵ���
	 * @return jiedianren
	 */
	@Column(name = "JIEDIANREN")
	public String getJiedianren(){
		return this.jiedianren;
	}
	/**
	 * ͨ������
	 * @return tonghuaneirong
	 */
	@Column(name = "TONGHUANEIRONG")
	public String getTonghuaneirong(){
		return this.tonghuaneirong;
	}
	/**
	 * ͨ����¼��
	 * @return tonghuajiluren
	 */
	@Column(name = "TONGHUAJILUREN")
	public String getTonghuajiluren(){
		return this.tonghuajiluren;
	}
	/**
	 * ���ʱ��
	 * @return chafangshijian
	 */
	@Column(name = "CHAFANGSHIJIAN")
	public Date getChafangshijian(){
		return this.chafangshijian;
	}
	/**
	 * �½׶β��ҷ���
	 * @return xiajieduanchazhaofangan
	 */
	@Column(name = "XIAJIEDUANCHAZHAOFANGAN")
	public String getXiajieduanchazhaofangan(){
		return this.xiajieduanchazhaofangan;
	}
	/**
	 * ��ע
	 * @return beizhu
	 */
	@Column(name = "BEIZHU")
	public String getBeizhu(){
		return this.beizhu;
	}
	/**
	 * ��õص�
	 * @return chafangdidian
	 */
	@Column(name = "CHAFANGDIDIAN")
	public String getChafangdidian(){
		return this.chafangdidian;
	}
	/**
	 * ��ý��
	 * @return chafangjieguo
	 */
	@Column(name = "CHAFANGJIEGUO")
	public String getChafangjieguo(){
		return this.chafangjieguo;
	}
	/**
	 * ��ü�¼��
	 * @return chafangjiluren
	 */
	@Column(name = "CHAFANGJILUREN")
	public String getChafangjiluren(){
		return this.chafangjiluren;
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
	 * ID
	 * @param isRemoved ID
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
	 * �����ʶ
	 * @param pid �����ʶ
	 */
	public void setPid(String pid){
		this.pid = pid;
	}
	/**
	 * ����
	 * @param xingming ����
	 */
	public void setXingming(String xingming){
		this.xingming = xingming;
	}
	/**
	 * ����
	 * @param quxianCode ����
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
	 * ����
	 * @param jiezhenCode ����
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
	 * ��ֹ����
	 * @param jibieCode ��ֹ����
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
	 * ����
	 * @param nianyue ����
	 */
	public void setNianyue(Date nianyue){
		this.nianyue = nianyue;
	}
	/**
	 * ���䲻��ԭ��
	 * @param yuanyin ���䲻��ԭ��
	 */
	public void setYuanyin(String yuanyin){
		this.yuanyin = yuanyin;
	}
	/**
	 * ���䲻����ʱ
	 * @param qishi ���䲻����ʱ
	 */
	public void setQishi(Date qishi){
		this.qishi = qishi;
	}
	/**
	 * �ܷ���ϵ
	 * @param nengfoulianxiCode �ܷ���ϵ
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
	 * ����ס��
	 * @param cengjuzhudi ����ס��
	 */
	public void setCengjuzhudi(String cengjuzhudi){
		this.cengjuzhudi = cengjuzhudi;
	}
	/**
	 * ��Ϣ��Դ
	 * @param xinxilaiyuanCode ��Ϣ��Դ
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
	 * ��Ϣ��Դ����
	 * @param xinxilaiyuanQita ��Ϣ��Դ����
	 */
	public void setXinxilaiyuanQita(String xinxilaiyuanQita){
		this.xinxilaiyuanQita = xinxilaiyuanQita;
	}
	/**
	 * �Ѳ�ȡ���ҷ�ʽ
	 * @param chazhaofangshiCode �Ѳ�ȡ���ҷ�ʽ
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
	 * �Ѳ�ȡ���ҷ�ʽ����
	 * @param chazhaofangshiQita �Ѳ�ȡ���ҷ�ʽ����
	 */
	public void setChazhaofangshiQita(String chazhaofangshiQita){
		this.chazhaofangshiQita = chazhaofangshiQita;
	}
	/**
	 * ͨ��ʱ��
	 * @param tonghuashijian ͨ��ʱ��
	 */
	public void setTonghuashijian(Date tonghuashijian){
		this.tonghuashijian = tonghuashijian;
	}
	/**
	 * �ӵ���
	 * @param jiedianren �ӵ���
	 */
	public void setJiedianren(String jiedianren){
		this.jiedianren = jiedianren;
	}
	/**
	 * ͨ������
	 * @param tonghuaneirong ͨ������
	 */
	public void setTonghuaneirong(String tonghuaneirong){
		this.tonghuaneirong = tonghuaneirong;
	}
	/**
	 * ͨ����¼��
	 * @param tonghuajiluren ͨ����¼��
	 */
	public void setTonghuajiluren(String tonghuajiluren){
		this.tonghuajiluren = tonghuajiluren;
	}
	/**
	 * ���ʱ��
	 * @param chafangshijian ���ʱ��
	 */
	public void setChafangshijian(Date chafangshijian){
		this.chafangshijian = chafangshijian;
	}
	/**
	 * �½׶β��ҷ���
	 * @param xiajieduanchazhaofangan �½׶β��ҷ���
	 */
	public void setXiajieduanchazhaofangan(String xiajieduanchazhaofangan){
		this.xiajieduanchazhaofangan = xiajieduanchazhaofangan;
	}
	/**
	 * ��ע
	 * @param beizhu ��ע
	 */
	public void setBeizhu(String beizhu){
		this.beizhu = beizhu;
	}
	/**
	 * ��õص�
	 * @param chafangdidian ��õص�
	 */
	public void setChafangdidian(String chafangdidian){
		this.chafangdidian = chafangdidian;
	}
	/**
	 * ��ý��
	 * @param chafangjieguo ��ý��
	 */
	public void setChafangjieguo(String chafangjieguo){
		this.chafangjieguo = chafangjieguo;
	}
	/**
	 * ��ü�¼��
	 * @param chafangjiluren ��ü�¼��
	 */
	public void setChafangjiluren(String chafangjiluren){
		this.chafangjiluren = chafangjiluren;
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
}
