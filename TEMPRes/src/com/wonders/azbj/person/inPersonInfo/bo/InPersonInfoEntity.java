package  com.wonders.azbj.person.inPersonInfo.bo;

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
 * <p>Title: InPersonInfoEntity��/p>
 * <p>Description: Entity for AZBJ_PERSON_IMPORT</p>
 * @author Auto generated
 * @version 0.5
 */
@Entity
@Table(name = "AZBJ_PERSON_IMPORT")
public class InPersonInfoEntity implements Serializable,IRemovable{

	public static final Logger logger = Logger.getLogger(InPersonInfoEntity.class);
	
	/**
	 * ��ʶ
	 */
	private String id;
	/**
	 * ����ʱ��
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date lts;
	/**
	 * ����Ա������Ϣ����id
	 */
	private String pid;
	/**
	 * ����
	 */
	private String xingming;
	/**
	 * ������Դ
	 */
	private String daorulaiyuan;
	/**
	 * ������
	 */
	private String cengyongming;
	/**
	 * �Ա�
	 */
	private String xingbie;
	/**
	 * ���֤��
	 */
	private String shenfenzheng;
	/**
	 * ��������
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date chushengriqi;
	/**
	 * ����
	 */
	private String minzu;
	/**
	 * �Ļ��̶�
	 */
	private String wenhuachengdu;
	/**
	 * �Ƿ�ũ�弮
	 */
	private String nongcunji;
	/**
	 * ������ַ
	 */
	private String hujidizhi;
	/**
	 * �Ƿ���ǰ�ͷ�
	 */
	private String tiqianshifang;
	/**
	 * �ͷ�ʱ��
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date shifangshijian;
	/**
	 * ����
	 */
	private String zuiming;
	/**
	 * ����
	 */
	private String xingqi;
	/**
	 * ������
	 */
	private String fujiaxing;
	/**
	 * �Ƿ��۷�
	 */
	private String leifan;
	/**
	 * ����ʷ
	 */
	private String xidushi;
	/**
	 * �Ƿ�μ�ְҵ������ѵ
	 */
	private String zhiyejinengpeixun;
	/**
	 * �Ƿ���ְҵ����֤��
	 */
	private String zhiyejinengzhengshu;
	/**
	 * �Ƿ�������
	 */
	private String xinlijiankang;
	/**
	 * ��ͥ��ϵ���
	 */
	private String jiatinglianxiqingkuang;
	/**
	 * �Ƿ�������Ա
	 */
	private String sanwurenyuan;
	/**
	 * Σ��������
	 */
	private String weixianxingpinggu;
	/**
	 * �������
	 */
	private String gaizaobiaoxian;
	/**
	 * ����̬��
	 */
	private String renzuitaidu;
	/**
	 * �����ڼ����������ע����̽���
	 */
	private String teshuqingkuangbeizhu;
	/**
	 * ������ǰ�ͷ�˵��
	 */
	private String tiqianshifangshuoming;
	/**
	 * �˲�״̬
	 */
	private String hechazhuangtai;
	/**
	 * ��ע
	 */
	private String beizhu;
	/**
	 * �Ƿ��л�ִ
	 */
	private String huizhi;
	/**
	 * ���ڼ���
	 */
	private String suozaijiansuo;
	/**
	 * �Ƿ�����Ƭ
	 */
	private String shifouyouzhaopian;
	/**
	 * ¼��ʱ��
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date lurushijian;
	/**
	 * �˲�ʱ��
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date hechashijian;
	/**
	 * ɾ����ʶ
	 */
	private String isRemoved;
	/**
	 * ��ͥ��ַ
	 */
	private String jiatingdizhi;
	/**
	 * �о�����
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date panjueriqi;
	/**
	 * ԭ������
	 */
	private String yuanpanxingqi;
	/**
	 * ����
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date qiri;
	/**
	 * ֹ��
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date zhiri;
	/**
	 * ��������

	 */
	private String bozhengnianxian;
	/**
	 * ֤������
	 */
	private String zhengjianleixing;
	/**
	 * ����״��

	 */
	private String hunyinzhuangkuang;
	/**
	 * ����
	 */
	private String guoji;
	/**
	 * ������
	 */
	private String hujidi;
	/**
	 * ��������
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date rusuoriqi;
	/**
	 * ��������
	 */
	private String rusuoxingzhi;
	/**
	 * ��Ѻ����
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date guanyaqixian;
	/**
	 * ����ʱ��
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date chusuoshijian;
	/**
	 * ����ԭ��
	 */
	private String chusuoyuanyin;
	/**
	 * ��ס��
	 */
	private String xianzhudi;
	/**
	 * ����ȥ��
	 */
	private String chusuoquxiang;
	/**
	 * �������
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date lijianriqi;
	/**
	 * ���ȥ��
	 */
	private String lijianquxiang;
	/**
	 * ����
	 */
	private String fanhao;
	
	/**
	 * ��ʶ
	 * @return id
	 */
	@Id
	@Column(name = "ID" ,unique = true ,nullable = false)
	@GeneratedValue(generator = "idGenerator")
	@GenericGenerator(name = "idGenerator" ,strategy = "uuid")
	public String getId(){
		return this.id;
	}
	/**
	 * ����ʱ��
	 * @return lts
	 */
	@Column(name = "LTS")
	public Date getLts(){
		return this.lts;
	}
	/**
	 * ����Ա������Ϣ����id
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
	 * ������Դ
	 * @return daorulaiyuan
	 */
	@Column(name = "DAORULAIYUAN")
	public String getDaorulaiyuan(){
		return this.daorulaiyuan;
	}
	/**
	 * ������
	 * @return cengyongming
	 */
	@Column(name = "CENGYONGMING")
	public String getCengyongming(){
		return this.cengyongming;
	}
	/**
	 * �Ա�
	 * @return xingbie
	 */
	@Column(name = "XINGBIE")
	public String getXingbie(){
		return this.xingbie;
	}
	/**
	 * ���֤��
	 * @return shenfenzheng
	 */
	@Column(name = "SHENFENZHENG")
	public String getShenfenzheng(){
		return this.shenfenzheng;
	}
	/**
	 * ��������
	 * @return chushengriqi
	 */
	@Column(name = "CHUSHENGRIQI")
	public Date getChushengriqi(){
		return this.chushengriqi;
	}
	/**
	 * ����
	 * @return minzu
	 */
	@Column(name = "MINZU")
	public String getMinzu(){
		return this.minzu;
	}
	/**
	 * �Ļ��̶�
	 * @return wenhuachengdu
	 */
	@Column(name = "WENHUACHENGDU")
	public String getWenhuachengdu(){
		return this.wenhuachengdu;
	}
	/**
	 * �Ƿ�ũ�弮
	 * @return nongcunji
	 */
	@Column(name = "NONGCUNJI")
	public String getNongcunji(){
		return this.nongcunji;
	}
	/**
	 * ������ַ
	 * @return hujidizhi
	 */
	@Column(name = "HUJIDIZHI")
	public String getHujidizhi(){
		return this.hujidizhi;
	}
	/**
	 * �Ƿ���ǰ�ͷ�
	 * @return tiqianshifang
	 */
	@Column(name = "TIQIANSHIFANG")
	public String getTiqianshifang(){
		return this.tiqianshifang;
	}
	/**
	 * �ͷ�ʱ��
	 * @return shifangshijian
	 */
	@Column(name = "SHIFANGSHIJIAN")
	public Date getShifangshijian(){
		return this.shifangshijian;
	}
	/**
	 * ����
	 * @return zuiming
	 */
	@Column(name = "ZUIMING")
	public String getZuiming(){
		return this.zuiming;
	}
	/**
	 * ����
	 * @return xingqi
	 */
	@Column(name = "XINGQI")
	public String getXingqi(){
		return this.xingqi;
	}
	/**
	 * ������
	 * @return fujiaxing
	 */
	@Column(name = "FUJIAXING")
	public String getFujiaxing(){
		return this.fujiaxing;
	}
	/**
	 * �Ƿ��۷�
	 * @return leifan
	 */
	@Column(name = "LEIFAN")
	public String getLeifan(){
		return this.leifan;
	}
	/**
	 * ����ʷ
	 * @return xidushi
	 */
	@Column(name = "XIDUSHI")
	public String getXidushi(){
		return this.xidushi;
	}
	/**
	 * �Ƿ�μ�ְҵ������ѵ
	 * @return zhiyejinengpeixun
	 */
	@Column(name = "ZHIYEJINENGPEIXUN")
	public String getZhiyejinengpeixun(){
		return this.zhiyejinengpeixun;
	}
	/**
	 * �Ƿ���ְҵ����֤��
	 * @return zhiyejinengzhengshu
	 */
	@Column(name = "ZHIYEJINENGZHENGSHU")
	public String getZhiyejinengzhengshu(){
		return this.zhiyejinengzhengshu;
	}
	/**
	 * �Ƿ�������
	 * @return xinlijiankang
	 */
	@Column(name = "XINLIJIANKANG")
	public String getXinlijiankang(){
		return this.xinlijiankang;
	}
	/**
	 * ��ͥ��ϵ���
	 * @return jiatinglianxiqingkuang
	 */
	@Column(name = "JIATINGLIANXIQINGKUANG")
	public String getJiatinglianxiqingkuang(){
		return this.jiatinglianxiqingkuang;
	}
	/**
	 * �Ƿ�������Ա
	 * @return sanwurenyuan
	 */
	@Column(name = "SANWURENYUAN")
	public String getSanwurenyuan(){
		return this.sanwurenyuan;
	}
	/**
	 * Σ��������
	 * @return weixianxingpinggu
	 */
	@Column(name = "WEIXIANXINGPINGGU")
	public String getWeixianxingpinggu(){
		return this.weixianxingpinggu;
	}
	/**
	 * �������
	 * @return gaizaobiaoxian
	 */
	@Column(name = "GAIZAOBIAOXIAN")
	public String getGaizaobiaoxian(){
		return this.gaizaobiaoxian;
	}
	/**
	 * ����̬��
	 * @return renzuitaidu
	 */
	@Column(name = "RENZUITAIDU")
	public String getRenzuitaidu(){
		return this.renzuitaidu;
	}
	/**
	 * �����ڼ����������ע����̽���
	 * @return teshuqingkuangbeizhu
	 */
	@Column(name = "TESHUQINGKUANGBEIZHU")
	public String getTeshuqingkuangbeizhu(){
		return this.teshuqingkuangbeizhu;
	}
	/**
	 * ������ǰ�ͷ�˵��
	 * @return tiqianshifangshuoming
	 */
	@Column(name = "TIQIANSHIFANGSHUOMING")
	public String getTiqianshifangshuoming(){
		return this.tiqianshifangshuoming;
	}
	/**
	 * �˲�״̬
	 * @return hechazhuangtai
	 */
	@Column(name = "HECHAZHUANGTAI")
	public String getHechazhuangtai(){
		return this.hechazhuangtai;
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
	 * �Ƿ��л�ִ
	 * @return huizhi
	 */
	@Column(name = "HUIZHI")
	public String getHuizhi(){
		return this.huizhi;
	}
	/**
	 * ���ڼ���
	 * @return suozaijiansuo
	 */
	@Column(name = "SUOZAIJIANSUO")
	public String getSuozaijiansuo(){
		return this.suozaijiansuo;
	}
	/**
	 * �Ƿ�����Ƭ
	 * @return shifouyouzhaopian
	 */
	@Column(name = "SHIFOUYOUZHAOPIAN")
	public String getShifouyouzhaopian(){
		return this.shifouyouzhaopian;
	}
	/**
	 * ¼��ʱ��
	 * @return lurushijian
	 */
	@Column(name = "LURUSHIJIAN")
	public Date getLurushijian(){
		return this.lurushijian;
	}
	/**
	 * �˲�ʱ��
	 * @return hechashijian
	 */
	@Column(name = "HECHASHIJIAN")
	public Date getHechashijian(){
		return this.hechashijian;
	}
	/**
	 * ɾ����ʶ
	 * @return isRemoved
	 */
	@Column(name = "REMOVED")
	public String getIsRemoved(){
		return this.isRemoved;
	}
	/**
	 * ��ͥ��ַ
	 * @return jiatingdizhi
	 */
	@Column(name = "JIATINGDIZHI")
	public String getJiatingdizhi(){
		return this.jiatingdizhi;
	}
	/**
	 * �о�����
	 * @return panjueriqi
	 */
	@Column(name = "PANJUERIQI")
	public Date getPanjueriqi(){
		return this.panjueriqi;
	}
	/**
	 * ԭ������
	 * @return yuanpanxingqi
	 */
	@Column(name = "YUANPANXINGQI")
	public String getYuanpanxingqi(){
		return this.yuanpanxingqi;
	}
	/**
	 * ����
	 * @return qiri
	 */
	@Column(name = "QIRI")
	public Date getQiri(){
		return this.qiri;
	}
	/**
	 * ֹ��
	 * @return zhiri
	 */
	@Column(name = "ZHIRI")
	public Date getZhiri(){
		return this.zhiri;
	}
	/**
	 * ��������

	 * @return bozhengnianxian
	 */
	@Column(name = "BOZHENGNIANXIAN")
	public String getBozhengnianxian(){
		return this.bozhengnianxian;
	}
	/**
	 * ֤������
	 * @return zhengjianleixing
	 */
	@Column(name = "ZHENGJIANLEIXING")
	public String getZhengjianleixing(){
		return this.zhengjianleixing;
	}
	/**
	 * ����״��

	 * @return hunyinzhuangkuang
	 */
	@Column(name = "HUNYINZHUANGKUANG")
	public String getHunyinzhuangkuang(){
		return this.hunyinzhuangkuang;
	}
	/**
	 * ����
	 * @return guoji
	 */
	@Column(name = "GUOJI")
	public String getGuoji(){
		return this.guoji;
	}
	/**
	 * ������
	 * @return hujidi
	 */
	@Column(name = "HUJIDI")
	public String getHujidi(){
		return this.hujidi;
	}
	/**
	 * ��������
	 * @return rusuoriqi
	 */
	@Column(name = "RUSUORIQI")
	public Date getRusuoriqi(){
		return this.rusuoriqi;
	}
	/**
	 * ��������
	 * @return rusuoxingzhi
	 */
	@Column(name = "RUSUOXINGZHI")
	public String getRusuoxingzhi(){
		return this.rusuoxingzhi;
	}
	/**
	 * ��Ѻ����
	 * @return guanyaqixian
	 */
	@Column(name = "GUANYAQIXIAN")
	public Date getGuanyaqixian(){
		return this.guanyaqixian;
	}
	/**
	 * ����ʱ��
	 * @return chusuoshijian
	 */
	@Column(name = "CHUSUOSHIJIAN")
	public Date getChusuoshijian(){
		return this.chusuoshijian;
	}
	/**
	 * ����ԭ��
	 * @return chusuoyuanyin
	 */
	@Column(name = "CHUSUOYUANYIN")
	public String getChusuoyuanyin(){
		return this.chusuoyuanyin;
	}
	/**
	 * ��ס��
	 * @return xianzhudi
	 */
	@Column(name = "XIANZHUDI")
	public String getXianzhudi(){
		return this.xianzhudi;
	}
	/**
	 * ����ȥ��
	 * @return chusuoquxiang
	 */
	@Column(name = "CHUSUOQUXIANG")
	public String getChusuoquxiang(){
		return this.chusuoquxiang;
	}
	/**
	 * �������
	 * @return lijianriqi
	 */
	@Column(name = "LIJIANRIQI")
	public Date getLijianriqi(){
		return this.lijianriqi;
	}
	/**
	 * ���ȥ��
	 * @return lijianquxiang
	 */
	@Column(name = "LIJIANQUXIANG")
	public String getLijianquxiang(){
		return this.lijianquxiang;
	}
	/**
	 * ����
	 * @return fanhao
	 */
	@Column(name = "FANHAO")
	public String getFanhao(){
		return this.fanhao;
	}
	/**
	 * ��ʶ
	 * @param id ��ʶ
	 */
	public void setId(String id){
		this.id = id;
	}
	/**
	 * ����ʱ��
	 * @param lts ����ʱ��
	 */
	public void setLts(Date lts){
		this.lts = lts;
	}
	/**
	 * ����Ա������Ϣ����id
	 * @param pid ����Ա������Ϣ����id
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
	 * ������Դ
	 * @param daorulaiyuan ������Դ
	 */
	public void setDaorulaiyuan(String daorulaiyuan){
		this.daorulaiyuan = daorulaiyuan;
	}
	/**
	 * ������
	 * @param cengyongming ������
	 */
	public void setCengyongming(String cengyongming){
		this.cengyongming = cengyongming;
	}
	/**
	 * �Ա�
	 * @param xingbie �Ա�
	 */
	public void setXingbie(String xingbie){
		this.xingbie = xingbie;
	}
	/**
	 * ���֤��
	 * @param shenfenzheng ���֤��
	 */
	public void setShenfenzheng(String shenfenzheng){
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * ��������
	 * @param chushengriqi ��������
	 */
	public void setChushengriqi(Date chushengriqi){
		this.chushengriqi = chushengriqi;
	}
	/**
	 * ����
	 * @param minzu ����
	 */
	public void setMinzu(String minzu){
		this.minzu = minzu;
	}
	/**
	 * �Ļ��̶�
	 * @param wenhuachengdu �Ļ��̶�
	 */
	public void setWenhuachengdu(String wenhuachengdu){
		this.wenhuachengdu = wenhuachengdu;
	}
	/**
	 * �Ƿ�ũ�弮
	 * @param nongcunji �Ƿ�ũ�弮
	 */
	public void setNongcunji(String nongcunji){
		this.nongcunji = nongcunji;
	}
	/**
	 * ������ַ
	 * @param hujidizhi ������ַ
	 */
	public void setHujidizhi(String hujidizhi){
		this.hujidizhi = hujidizhi;
	}
	/**
	 * �Ƿ���ǰ�ͷ�
	 * @param tiqianshifang �Ƿ���ǰ�ͷ�
	 */
	public void setTiqianshifang(String tiqianshifang){
		this.tiqianshifang = tiqianshifang;
	}
	/**
	 * �ͷ�ʱ��
	 * @param shifangshijian �ͷ�ʱ��
	 */
	public void setShifangshijian(Date shifangshijian){
		this.shifangshijian = shifangshijian;
	}
	/**
	 * ����
	 * @param zuiming ����
	 */
	public void setZuiming(String zuiming){
		this.zuiming = zuiming;
	}
	/**
	 * ����
	 * @param xingqi ����
	 */
	public void setXingqi(String xingqi){
		this.xingqi = xingqi;
	}
	/**
	 * ������
	 * @param fujiaxing ������
	 */
	public void setFujiaxing(String fujiaxing){
		this.fujiaxing = fujiaxing;
	}
	/**
	 * �Ƿ��۷�
	 * @param leifan �Ƿ��۷�
	 */
	public void setLeifan(String leifan){
		this.leifan = leifan;
	}
	/**
	 * ����ʷ
	 * @param xidushi ����ʷ
	 */
	public void setXidushi(String xidushi){
		this.xidushi = xidushi;
	}
	/**
	 * �Ƿ�μ�ְҵ������ѵ
	 * @param zhiyejinengpeixun �Ƿ�μ�ְҵ������ѵ
	 */
	public void setZhiyejinengpeixun(String zhiyejinengpeixun){
		this.zhiyejinengpeixun = zhiyejinengpeixun;
	}
	/**
	 * �Ƿ���ְҵ����֤��
	 * @param zhiyejinengzhengshu �Ƿ���ְҵ����֤��
	 */
	public void setZhiyejinengzhengshu(String zhiyejinengzhengshu){
		this.zhiyejinengzhengshu = zhiyejinengzhengshu;
	}
	/**
	 * �Ƿ�������
	 * @param xinlijiankang �Ƿ�������
	 */
	public void setXinlijiankang(String xinlijiankang){
		this.xinlijiankang = xinlijiankang;
	}
	/**
	 * ��ͥ��ϵ���
	 * @param jiatinglianxiqingkuang ��ͥ��ϵ���
	 */
	public void setJiatinglianxiqingkuang(String jiatinglianxiqingkuang){
		this.jiatinglianxiqingkuang = jiatinglianxiqingkuang;
	}
	/**
	 * �Ƿ�������Ա
	 * @param sanwurenyuan �Ƿ�������Ա
	 */
	public void setSanwurenyuan(String sanwurenyuan){
		this.sanwurenyuan = sanwurenyuan;
	}
	/**
	 * Σ��������
	 * @param weixianxingpinggu Σ��������
	 */
	public void setWeixianxingpinggu(String weixianxingpinggu){
		this.weixianxingpinggu = weixianxingpinggu;
	}
	/**
	 * �������
	 * @param gaizaobiaoxian �������
	 */
	public void setGaizaobiaoxian(String gaizaobiaoxian){
		this.gaizaobiaoxian = gaizaobiaoxian;
	}
	/**
	 * ����̬��
	 * @param renzuitaidu ����̬��
	 */
	public void setRenzuitaidu(String renzuitaidu){
		this.renzuitaidu = renzuitaidu;
	}
	/**
	 * �����ڼ����������ע����̽���
	 * @param teshuqingkuangbeizhu �����ڼ����������ע����̽���
	 */
	public void setTeshuqingkuangbeizhu(String teshuqingkuangbeizhu){
		this.teshuqingkuangbeizhu = teshuqingkuangbeizhu;
	}
	/**
	 * ������ǰ�ͷ�˵��
	 * @param tiqianshifangshuoming ������ǰ�ͷ�˵��
	 */
	public void setTiqianshifangshuoming(String tiqianshifangshuoming){
		this.tiqianshifangshuoming = tiqianshifangshuoming;
	}
	/**
	 * �˲�״̬
	 * @param hechazhuangtai �˲�״̬
	 */
	public void setHechazhuangtai(String hechazhuangtai){
		this.hechazhuangtai = hechazhuangtai;
	}
	/**
	 * ��ע
	 * @param beizhu ��ע
	 */
	public void setBeizhu(String beizhu){
		this.beizhu = beizhu;
	}
	/**
	 * �Ƿ��л�ִ
	 * @param huizhi �Ƿ��л�ִ
	 */
	public void setHuizhi(String huizhi){
		this.huizhi = huizhi;
	}
	/**
	 * ���ڼ���
	 * @param suozaijiansuo ���ڼ���
	 */
	public void setSuozaijiansuo(String suozaijiansuo){
		this.suozaijiansuo = suozaijiansuo;
	}
	/**
	 * �Ƿ�����Ƭ
	 * @param shifouyouzhaopian �Ƿ�����Ƭ
	 */
	public void setShifouyouzhaopian(String shifouyouzhaopian){
		this.shifouyouzhaopian = shifouyouzhaopian;
	}
	/**
	 * ¼��ʱ��
	 * @param lurushijian ¼��ʱ��
	 */
	public void setLurushijian(Date lurushijian){
		this.lurushijian = lurushijian;
	}
	/**
	 * �˲�ʱ��
	 * @param hechashijian �˲�ʱ��
	 */
	public void setHechashijian(Date hechashijian){
		this.hechashijian = hechashijian;
	}
	/**
	 * ɾ����ʶ
	 * @param isRemoved ɾ����ʶ
	 */
	public void setIsRemoved(String isRemoved){
		this.isRemoved = isRemoved;
	}
	/**
	 * ��ͥ��ַ
	 * @param jiatingdizhi ��ͥ��ַ
	 */
	public void setJiatingdizhi(String jiatingdizhi){
		this.jiatingdizhi = jiatingdizhi;
	}
	/**
	 * �о�����
	 * @param panjueriqi �о�����
	 */
	public void setPanjueriqi(Date panjueriqi){
		this.panjueriqi = panjueriqi;
	}
	/**
	 * ԭ������
	 * @param yuanpanxingqi ԭ������
	 */
	public void setYuanpanxingqi(String yuanpanxingqi){
		this.yuanpanxingqi = yuanpanxingqi;
	}
	/**
	 * ����
	 * @param qiri ����
	 */
	public void setQiri(Date qiri){
		this.qiri = qiri;
	}
	/**
	 * ֹ��
	 * @param zhiri ֹ��
	 */
	public void setZhiri(Date zhiri){
		this.zhiri = zhiri;
	}
	/**
	 * ��������

	 * @param bozhengnianxian ��������

	 */
	public void setBozhengnianxian(String bozhengnianxian){
		this.bozhengnianxian = bozhengnianxian;
	}
	/**
	 * ֤������
	 * @param zhengjianleixing ֤������
	 */
	public void setZhengjianleixing(String zhengjianleixing){
		this.zhengjianleixing = zhengjianleixing;
	}
	/**
	 * ����״��

	 * @param hunyinzhuangkuang ����״��

	 */
	public void setHunyinzhuangkuang(String hunyinzhuangkuang){
		this.hunyinzhuangkuang = hunyinzhuangkuang;
	}
	/**
	 * ����
	 * @param guoji ����
	 */
	public void setGuoji(String guoji){
		this.guoji = guoji;
	}
	/**
	 * ������
	 * @param hujidi ������
	 */
	public void setHujidi(String hujidi){
		this.hujidi = hujidi;
	}
	/**
	 * ��������
	 * @param rusuoriqi ��������
	 */
	public void setRusuoriqi(Date rusuoriqi){
		this.rusuoriqi = rusuoriqi;
	}
	/**
	 * ��������
	 * @param rusuoxingzhi ��������
	 */
	public void setRusuoxingzhi(String rusuoxingzhi){
		this.rusuoxingzhi = rusuoxingzhi;
	}
	/**
	 * ��Ѻ����
	 * @param guanyaqixian ��Ѻ����
	 */
	public void setGuanyaqixian(Date guanyaqixian){
		this.guanyaqixian = guanyaqixian;
	}
	/**
	 * ����ʱ��
	 * @param chusuoshijian ����ʱ��
	 */
	public void setChusuoshijian(Date chusuoshijian){
		this.chusuoshijian = chusuoshijian;
	}
	/**
	 * ����ԭ��
	 * @param chusuoyuanyin ����ԭ��
	 */
	public void setChusuoyuanyin(String chusuoyuanyin){
		this.chusuoyuanyin = chusuoyuanyin;
	}
	/**
	 * ��ס��
	 * @param xianzhudi ��ס��
	 */
	public void setXianzhudi(String xianzhudi){
		this.xianzhudi = xianzhudi;
	}
	/**
	 * ����ȥ��
	 * @param chusuoquxiang ����ȥ��
	 */
	public void setChusuoquxiang(String chusuoquxiang){
		this.chusuoquxiang = chusuoquxiang;
	}
	/**
	 * �������
	 * @param lijianriqi �������
	 */
	public void setLijianriqi(Date lijianriqi){
		this.lijianriqi = lijianriqi;
	}
	/**
	 * ���ȥ��
	 * @param lijianquxiang ���ȥ��
	 */
	public void setLijianquxiang(String lijianquxiang){
		this.lijianquxiang = lijianquxiang;
	}
	/**
	 * ����
	 * @param fanhao ����
	 */
	public void setFanhao(String fanhao){
		this.fanhao = fanhao;
	}
}
