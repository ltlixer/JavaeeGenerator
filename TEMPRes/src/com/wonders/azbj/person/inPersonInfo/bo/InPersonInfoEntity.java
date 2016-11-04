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
 * <p>Title: InPersonInfoEntity类/p>
 * <p>Description: Entity for AZBJ_PERSON_IMPORT</p>
 * @author Auto generated
 * @version 0.5
 */
@Entity
@Table(name = "AZBJ_PERSON_IMPORT")
public class InPersonInfoEntity implements Serializable,IRemovable{

	public static final Logger logger = Logger.getLogger(InPersonInfoEntity.class);
	
	/**
	 * 标识
	 */
	private String id;
	/**
	 * 导入时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date lts;
	/**
	 * 与人员基本信息关联id
	 */
	private String pid;
	/**
	 * 姓名
	 */
	private String xingming;
	/**
	 * 导入来源
	 */
	private String daorulaiyuan;
	/**
	 * 曾用名
	 */
	private String cengyongming;
	/**
	 * 性别
	 */
	private String xingbie;
	/**
	 * 身份证号
	 */
	private String shenfenzheng;
	/**
	 * 出生日期
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date chushengriqi;
	/**
	 * 民族
	 */
	private String minzu;
	/**
	 * 文化程度
	 */
	private String wenhuachengdu;
	/**
	 * 是否农村籍
	 */
	private String nongcunji;
	/**
	 * 户籍地址
	 */
	private String hujidizhi;
	/**
	 * 是否提前释放
	 */
	private String tiqianshifang;
	/**
	 * 释放时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date shifangshijian;
	/**
	 * 罪名
	 */
	private String zuiming;
	/**
	 * 刑期
	 */
	private String xingqi;
	/**
	 * 附加刑
	 */
	private String fujiaxing;
	/**
	 * 是否累犯
	 */
	private String leifan;
	/**
	 * 吸毒史
	 */
	private String xidushi;
	/**
	 * 是否参加职业技能培训
	 */
	private String zhiyejinengpeixun;
	/**
	 * 是否获得职业技能证书
	 */
	private String zhiyejinengzhengshu;
	/**
	 * 是否心理健康
	 */
	private String xinlijiankang;
	/**
	 * 家庭联系情况
	 */
	private String jiatinglianxiqingkuang;
	/**
	 * 是否三无人员
	 */
	private String sanwurenyuan;
	/**
	 * 危险性评估
	 */
	private String weixianxingpinggu;
	/**
	 * 改造表现
	 */
	private String gaizaobiaoxian;
	/**
	 * 认罪态度
	 */
	private String renzuitaidu;
	/**
	 * 服刑期间特殊情况备注及帮教建议
	 */
	private String teshuqingkuangbeizhu;
	/**
	 * 减刑提前释放说明
	 */
	private String tiqianshifangshuoming;
	/**
	 * 核查状态
	 */
	private String hechazhuangtai;
	/**
	 * 备注
	 */
	private String beizhu;
	/**
	 * 是否有回执
	 */
	private String huizhi;
	/**
	 * 所在监所
	 */
	private String suozaijiansuo;
	/**
	 * 是否有照片
	 */
	private String shifouyouzhaopian;
	/**
	 * 录入时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date lurushijian;
	/**
	 * 核查时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date hechashijian;
	/**
	 * 删除标识
	 */
	private String isRemoved;
	/**
	 * 家庭地址
	 */
	private String jiatingdizhi;
	/**
	 * 判决日期
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date panjueriqi;
	/**
	 * 原判刑期
	 */
	private String yuanpanxingqi;
	/**
	 * 起日
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date qiri;
	/**
	 * 止日
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date zhiri;
	/**
	 * 剥政年限

	 */
	private String bozhengnianxian;
	/**
	 * 证件类型
	 */
	private String zhengjianleixing;
	/**
	 * 婚姻状况

	 */
	private String hunyinzhuangkuang;
	/**
	 * 国籍
	 */
	private String guoji;
	/**
	 * 户籍地
	 */
	private String hujidi;
	/**
	 * 入所日期
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date rusuoriqi;
	/**
	 * 入所性质
	 */
	private String rusuoxingzhi;
	/**
	 * 关押期限
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date guanyaqixian;
	/**
	 * 出所时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date chusuoshijian;
	/**
	 * 出所原因
	 */
	private String chusuoyuanyin;
	/**
	 * 现住地
	 */
	private String xianzhudi;
	/**
	 * 出所去向
	 */
	private String chusuoquxiang;
	/**
	 * 离监日期
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date lijianriqi;
	/**
	 * 离监去向
	 */
	private String lijianquxiang;
	/**
	 * 番号
	 */
	private String fanhao;
	
	/**
	 * 标识
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
	 * 导入时间
	 * @return lts
	 */
	@Column(name = "LTS")
	public Date getLts(){
		return this.lts;
	}
	/**
	 * 与人员基本信息关联id
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
	 * 导入来源
	 * @return daorulaiyuan
	 */
	@Column(name = "DAORULAIYUAN")
	public String getDaorulaiyuan(){
		return this.daorulaiyuan;
	}
	/**
	 * 曾用名
	 * @return cengyongming
	 */
	@Column(name = "CENGYONGMING")
	public String getCengyongming(){
		return this.cengyongming;
	}
	/**
	 * 性别
	 * @return xingbie
	 */
	@Column(name = "XINGBIE")
	public String getXingbie(){
		return this.xingbie;
	}
	/**
	 * 身份证号
	 * @return shenfenzheng
	 */
	@Column(name = "SHENFENZHENG")
	public String getShenfenzheng(){
		return this.shenfenzheng;
	}
	/**
	 * 出生日期
	 * @return chushengriqi
	 */
	@Column(name = "CHUSHENGRIQI")
	public Date getChushengriqi(){
		return this.chushengriqi;
	}
	/**
	 * 民族
	 * @return minzu
	 */
	@Column(name = "MINZU")
	public String getMinzu(){
		return this.minzu;
	}
	/**
	 * 文化程度
	 * @return wenhuachengdu
	 */
	@Column(name = "WENHUACHENGDU")
	public String getWenhuachengdu(){
		return this.wenhuachengdu;
	}
	/**
	 * 是否农村籍
	 * @return nongcunji
	 */
	@Column(name = "NONGCUNJI")
	public String getNongcunji(){
		return this.nongcunji;
	}
	/**
	 * 户籍地址
	 * @return hujidizhi
	 */
	@Column(name = "HUJIDIZHI")
	public String getHujidizhi(){
		return this.hujidizhi;
	}
	/**
	 * 是否提前释放
	 * @return tiqianshifang
	 */
	@Column(name = "TIQIANSHIFANG")
	public String getTiqianshifang(){
		return this.tiqianshifang;
	}
	/**
	 * 释放时间
	 * @return shifangshijian
	 */
	@Column(name = "SHIFANGSHIJIAN")
	public Date getShifangshijian(){
		return this.shifangshijian;
	}
	/**
	 * 罪名
	 * @return zuiming
	 */
	@Column(name = "ZUIMING")
	public String getZuiming(){
		return this.zuiming;
	}
	/**
	 * 刑期
	 * @return xingqi
	 */
	@Column(name = "XINGQI")
	public String getXingqi(){
		return this.xingqi;
	}
	/**
	 * 附加刑
	 * @return fujiaxing
	 */
	@Column(name = "FUJIAXING")
	public String getFujiaxing(){
		return this.fujiaxing;
	}
	/**
	 * 是否累犯
	 * @return leifan
	 */
	@Column(name = "LEIFAN")
	public String getLeifan(){
		return this.leifan;
	}
	/**
	 * 吸毒史
	 * @return xidushi
	 */
	@Column(name = "XIDUSHI")
	public String getXidushi(){
		return this.xidushi;
	}
	/**
	 * 是否参加职业技能培训
	 * @return zhiyejinengpeixun
	 */
	@Column(name = "ZHIYEJINENGPEIXUN")
	public String getZhiyejinengpeixun(){
		return this.zhiyejinengpeixun;
	}
	/**
	 * 是否获得职业技能证书
	 * @return zhiyejinengzhengshu
	 */
	@Column(name = "ZHIYEJINENGZHENGSHU")
	public String getZhiyejinengzhengshu(){
		return this.zhiyejinengzhengshu;
	}
	/**
	 * 是否心理健康
	 * @return xinlijiankang
	 */
	@Column(name = "XINLIJIANKANG")
	public String getXinlijiankang(){
		return this.xinlijiankang;
	}
	/**
	 * 家庭联系情况
	 * @return jiatinglianxiqingkuang
	 */
	@Column(name = "JIATINGLIANXIQINGKUANG")
	public String getJiatinglianxiqingkuang(){
		return this.jiatinglianxiqingkuang;
	}
	/**
	 * 是否三无人员
	 * @return sanwurenyuan
	 */
	@Column(name = "SANWURENYUAN")
	public String getSanwurenyuan(){
		return this.sanwurenyuan;
	}
	/**
	 * 危险性评估
	 * @return weixianxingpinggu
	 */
	@Column(name = "WEIXIANXINGPINGGU")
	public String getWeixianxingpinggu(){
		return this.weixianxingpinggu;
	}
	/**
	 * 改造表现
	 * @return gaizaobiaoxian
	 */
	@Column(name = "GAIZAOBIAOXIAN")
	public String getGaizaobiaoxian(){
		return this.gaizaobiaoxian;
	}
	/**
	 * 认罪态度
	 * @return renzuitaidu
	 */
	@Column(name = "RENZUITAIDU")
	public String getRenzuitaidu(){
		return this.renzuitaidu;
	}
	/**
	 * 服刑期间特殊情况备注及帮教建议
	 * @return teshuqingkuangbeizhu
	 */
	@Column(name = "TESHUQINGKUANGBEIZHU")
	public String getTeshuqingkuangbeizhu(){
		return this.teshuqingkuangbeizhu;
	}
	/**
	 * 减刑提前释放说明
	 * @return tiqianshifangshuoming
	 */
	@Column(name = "TIQIANSHIFANGSHUOMING")
	public String getTiqianshifangshuoming(){
		return this.tiqianshifangshuoming;
	}
	/**
	 * 核查状态
	 * @return hechazhuangtai
	 */
	@Column(name = "HECHAZHUANGTAI")
	public String getHechazhuangtai(){
		return this.hechazhuangtai;
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
	 * 是否有回执
	 * @return huizhi
	 */
	@Column(name = "HUIZHI")
	public String getHuizhi(){
		return this.huizhi;
	}
	/**
	 * 所在监所
	 * @return suozaijiansuo
	 */
	@Column(name = "SUOZAIJIANSUO")
	public String getSuozaijiansuo(){
		return this.suozaijiansuo;
	}
	/**
	 * 是否有照片
	 * @return shifouyouzhaopian
	 */
	@Column(name = "SHIFOUYOUZHAOPIAN")
	public String getShifouyouzhaopian(){
		return this.shifouyouzhaopian;
	}
	/**
	 * 录入时间
	 * @return lurushijian
	 */
	@Column(name = "LURUSHIJIAN")
	public Date getLurushijian(){
		return this.lurushijian;
	}
	/**
	 * 核查时间
	 * @return hechashijian
	 */
	@Column(name = "HECHASHIJIAN")
	public Date getHechashijian(){
		return this.hechashijian;
	}
	/**
	 * 删除标识
	 * @return isRemoved
	 */
	@Column(name = "REMOVED")
	public String getIsRemoved(){
		return this.isRemoved;
	}
	/**
	 * 家庭地址
	 * @return jiatingdizhi
	 */
	@Column(name = "JIATINGDIZHI")
	public String getJiatingdizhi(){
		return this.jiatingdizhi;
	}
	/**
	 * 判决日期
	 * @return panjueriqi
	 */
	@Column(name = "PANJUERIQI")
	public Date getPanjueriqi(){
		return this.panjueriqi;
	}
	/**
	 * 原判刑期
	 * @return yuanpanxingqi
	 */
	@Column(name = "YUANPANXINGQI")
	public String getYuanpanxingqi(){
		return this.yuanpanxingqi;
	}
	/**
	 * 起日
	 * @return qiri
	 */
	@Column(name = "QIRI")
	public Date getQiri(){
		return this.qiri;
	}
	/**
	 * 止日
	 * @return zhiri
	 */
	@Column(name = "ZHIRI")
	public Date getZhiri(){
		return this.zhiri;
	}
	/**
	 * 剥政年限

	 * @return bozhengnianxian
	 */
	@Column(name = "BOZHENGNIANXIAN")
	public String getBozhengnianxian(){
		return this.bozhengnianxian;
	}
	/**
	 * 证件类型
	 * @return zhengjianleixing
	 */
	@Column(name = "ZHENGJIANLEIXING")
	public String getZhengjianleixing(){
		return this.zhengjianleixing;
	}
	/**
	 * 婚姻状况

	 * @return hunyinzhuangkuang
	 */
	@Column(name = "HUNYINZHUANGKUANG")
	public String getHunyinzhuangkuang(){
		return this.hunyinzhuangkuang;
	}
	/**
	 * 国籍
	 * @return guoji
	 */
	@Column(name = "GUOJI")
	public String getGuoji(){
		return this.guoji;
	}
	/**
	 * 户籍地
	 * @return hujidi
	 */
	@Column(name = "HUJIDI")
	public String getHujidi(){
		return this.hujidi;
	}
	/**
	 * 入所日期
	 * @return rusuoriqi
	 */
	@Column(name = "RUSUORIQI")
	public Date getRusuoriqi(){
		return this.rusuoriqi;
	}
	/**
	 * 入所性质
	 * @return rusuoxingzhi
	 */
	@Column(name = "RUSUOXINGZHI")
	public String getRusuoxingzhi(){
		return this.rusuoxingzhi;
	}
	/**
	 * 关押期限
	 * @return guanyaqixian
	 */
	@Column(name = "GUANYAQIXIAN")
	public Date getGuanyaqixian(){
		return this.guanyaqixian;
	}
	/**
	 * 出所时间
	 * @return chusuoshijian
	 */
	@Column(name = "CHUSUOSHIJIAN")
	public Date getChusuoshijian(){
		return this.chusuoshijian;
	}
	/**
	 * 出所原因
	 * @return chusuoyuanyin
	 */
	@Column(name = "CHUSUOYUANYIN")
	public String getChusuoyuanyin(){
		return this.chusuoyuanyin;
	}
	/**
	 * 现住地
	 * @return xianzhudi
	 */
	@Column(name = "XIANZHUDI")
	public String getXianzhudi(){
		return this.xianzhudi;
	}
	/**
	 * 出所去向
	 * @return chusuoquxiang
	 */
	@Column(name = "CHUSUOQUXIANG")
	public String getChusuoquxiang(){
		return this.chusuoquxiang;
	}
	/**
	 * 离监日期
	 * @return lijianriqi
	 */
	@Column(name = "LIJIANRIQI")
	public Date getLijianriqi(){
		return this.lijianriqi;
	}
	/**
	 * 离监去向
	 * @return lijianquxiang
	 */
	@Column(name = "LIJIANQUXIANG")
	public String getLijianquxiang(){
		return this.lijianquxiang;
	}
	/**
	 * 番号
	 * @return fanhao
	 */
	@Column(name = "FANHAO")
	public String getFanhao(){
		return this.fanhao;
	}
	/**
	 * 标识
	 * @param id 标识
	 */
	public void setId(String id){
		this.id = id;
	}
	/**
	 * 导入时间
	 * @param lts 导入时间
	 */
	public void setLts(Date lts){
		this.lts = lts;
	}
	/**
	 * 与人员基本信息关联id
	 * @param pid 与人员基本信息关联id
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
	 * 导入来源
	 * @param daorulaiyuan 导入来源
	 */
	public void setDaorulaiyuan(String daorulaiyuan){
		this.daorulaiyuan = daorulaiyuan;
	}
	/**
	 * 曾用名
	 * @param cengyongming 曾用名
	 */
	public void setCengyongming(String cengyongming){
		this.cengyongming = cengyongming;
	}
	/**
	 * 性别
	 * @param xingbie 性别
	 */
	public void setXingbie(String xingbie){
		this.xingbie = xingbie;
	}
	/**
	 * 身份证号
	 * @param shenfenzheng 身份证号
	 */
	public void setShenfenzheng(String shenfenzheng){
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * 出生日期
	 * @param chushengriqi 出生日期
	 */
	public void setChushengriqi(Date chushengriqi){
		this.chushengriqi = chushengriqi;
	}
	/**
	 * 民族
	 * @param minzu 民族
	 */
	public void setMinzu(String minzu){
		this.minzu = minzu;
	}
	/**
	 * 文化程度
	 * @param wenhuachengdu 文化程度
	 */
	public void setWenhuachengdu(String wenhuachengdu){
		this.wenhuachengdu = wenhuachengdu;
	}
	/**
	 * 是否农村籍
	 * @param nongcunji 是否农村籍
	 */
	public void setNongcunji(String nongcunji){
		this.nongcunji = nongcunji;
	}
	/**
	 * 户籍地址
	 * @param hujidizhi 户籍地址
	 */
	public void setHujidizhi(String hujidizhi){
		this.hujidizhi = hujidizhi;
	}
	/**
	 * 是否提前释放
	 * @param tiqianshifang 是否提前释放
	 */
	public void setTiqianshifang(String tiqianshifang){
		this.tiqianshifang = tiqianshifang;
	}
	/**
	 * 释放时间
	 * @param shifangshijian 释放时间
	 */
	public void setShifangshijian(Date shifangshijian){
		this.shifangshijian = shifangshijian;
	}
	/**
	 * 罪名
	 * @param zuiming 罪名
	 */
	public void setZuiming(String zuiming){
		this.zuiming = zuiming;
	}
	/**
	 * 刑期
	 * @param xingqi 刑期
	 */
	public void setXingqi(String xingqi){
		this.xingqi = xingqi;
	}
	/**
	 * 附加刑
	 * @param fujiaxing 附加刑
	 */
	public void setFujiaxing(String fujiaxing){
		this.fujiaxing = fujiaxing;
	}
	/**
	 * 是否累犯
	 * @param leifan 是否累犯
	 */
	public void setLeifan(String leifan){
		this.leifan = leifan;
	}
	/**
	 * 吸毒史
	 * @param xidushi 吸毒史
	 */
	public void setXidushi(String xidushi){
		this.xidushi = xidushi;
	}
	/**
	 * 是否参加职业技能培训
	 * @param zhiyejinengpeixun 是否参加职业技能培训
	 */
	public void setZhiyejinengpeixun(String zhiyejinengpeixun){
		this.zhiyejinengpeixun = zhiyejinengpeixun;
	}
	/**
	 * 是否获得职业技能证书
	 * @param zhiyejinengzhengshu 是否获得职业技能证书
	 */
	public void setZhiyejinengzhengshu(String zhiyejinengzhengshu){
		this.zhiyejinengzhengshu = zhiyejinengzhengshu;
	}
	/**
	 * 是否心理健康
	 * @param xinlijiankang 是否心理健康
	 */
	public void setXinlijiankang(String xinlijiankang){
		this.xinlijiankang = xinlijiankang;
	}
	/**
	 * 家庭联系情况
	 * @param jiatinglianxiqingkuang 家庭联系情况
	 */
	public void setJiatinglianxiqingkuang(String jiatinglianxiqingkuang){
		this.jiatinglianxiqingkuang = jiatinglianxiqingkuang;
	}
	/**
	 * 是否三无人员
	 * @param sanwurenyuan 是否三无人员
	 */
	public void setSanwurenyuan(String sanwurenyuan){
		this.sanwurenyuan = sanwurenyuan;
	}
	/**
	 * 危险性评估
	 * @param weixianxingpinggu 危险性评估
	 */
	public void setWeixianxingpinggu(String weixianxingpinggu){
		this.weixianxingpinggu = weixianxingpinggu;
	}
	/**
	 * 改造表现
	 * @param gaizaobiaoxian 改造表现
	 */
	public void setGaizaobiaoxian(String gaizaobiaoxian){
		this.gaizaobiaoxian = gaizaobiaoxian;
	}
	/**
	 * 认罪态度
	 * @param renzuitaidu 认罪态度
	 */
	public void setRenzuitaidu(String renzuitaidu){
		this.renzuitaidu = renzuitaidu;
	}
	/**
	 * 服刑期间特殊情况备注及帮教建议
	 * @param teshuqingkuangbeizhu 服刑期间特殊情况备注及帮教建议
	 */
	public void setTeshuqingkuangbeizhu(String teshuqingkuangbeizhu){
		this.teshuqingkuangbeizhu = teshuqingkuangbeizhu;
	}
	/**
	 * 减刑提前释放说明
	 * @param tiqianshifangshuoming 减刑提前释放说明
	 */
	public void setTiqianshifangshuoming(String tiqianshifangshuoming){
		this.tiqianshifangshuoming = tiqianshifangshuoming;
	}
	/**
	 * 核查状态
	 * @param hechazhuangtai 核查状态
	 */
	public void setHechazhuangtai(String hechazhuangtai){
		this.hechazhuangtai = hechazhuangtai;
	}
	/**
	 * 备注
	 * @param beizhu 备注
	 */
	public void setBeizhu(String beizhu){
		this.beizhu = beizhu;
	}
	/**
	 * 是否有回执
	 * @param huizhi 是否有回执
	 */
	public void setHuizhi(String huizhi){
		this.huizhi = huizhi;
	}
	/**
	 * 所在监所
	 * @param suozaijiansuo 所在监所
	 */
	public void setSuozaijiansuo(String suozaijiansuo){
		this.suozaijiansuo = suozaijiansuo;
	}
	/**
	 * 是否有照片
	 * @param shifouyouzhaopian 是否有照片
	 */
	public void setShifouyouzhaopian(String shifouyouzhaopian){
		this.shifouyouzhaopian = shifouyouzhaopian;
	}
	/**
	 * 录入时间
	 * @param lurushijian 录入时间
	 */
	public void setLurushijian(Date lurushijian){
		this.lurushijian = lurushijian;
	}
	/**
	 * 核查时间
	 * @param hechashijian 核查时间
	 */
	public void setHechashijian(Date hechashijian){
		this.hechashijian = hechashijian;
	}
	/**
	 * 删除标识
	 * @param isRemoved 删除标识
	 */
	public void setIsRemoved(String isRemoved){
		this.isRemoved = isRemoved;
	}
	/**
	 * 家庭地址
	 * @param jiatingdizhi 家庭地址
	 */
	public void setJiatingdizhi(String jiatingdizhi){
		this.jiatingdizhi = jiatingdizhi;
	}
	/**
	 * 判决日期
	 * @param panjueriqi 判决日期
	 */
	public void setPanjueriqi(Date panjueriqi){
		this.panjueriqi = panjueriqi;
	}
	/**
	 * 原判刑期
	 * @param yuanpanxingqi 原判刑期
	 */
	public void setYuanpanxingqi(String yuanpanxingqi){
		this.yuanpanxingqi = yuanpanxingqi;
	}
	/**
	 * 起日
	 * @param qiri 起日
	 */
	public void setQiri(Date qiri){
		this.qiri = qiri;
	}
	/**
	 * 止日
	 * @param zhiri 止日
	 */
	public void setZhiri(Date zhiri){
		this.zhiri = zhiri;
	}
	/**
	 * 剥政年限

	 * @param bozhengnianxian 剥政年限

	 */
	public void setBozhengnianxian(String bozhengnianxian){
		this.bozhengnianxian = bozhengnianxian;
	}
	/**
	 * 证件类型
	 * @param zhengjianleixing 证件类型
	 */
	public void setZhengjianleixing(String zhengjianleixing){
		this.zhengjianleixing = zhengjianleixing;
	}
	/**
	 * 婚姻状况

	 * @param hunyinzhuangkuang 婚姻状况

	 */
	public void setHunyinzhuangkuang(String hunyinzhuangkuang){
		this.hunyinzhuangkuang = hunyinzhuangkuang;
	}
	/**
	 * 国籍
	 * @param guoji 国籍
	 */
	public void setGuoji(String guoji){
		this.guoji = guoji;
	}
	/**
	 * 户籍地
	 * @param hujidi 户籍地
	 */
	public void setHujidi(String hujidi){
		this.hujidi = hujidi;
	}
	/**
	 * 入所日期
	 * @param rusuoriqi 入所日期
	 */
	public void setRusuoriqi(Date rusuoriqi){
		this.rusuoriqi = rusuoriqi;
	}
	/**
	 * 入所性质
	 * @param rusuoxingzhi 入所性质
	 */
	public void setRusuoxingzhi(String rusuoxingzhi){
		this.rusuoxingzhi = rusuoxingzhi;
	}
	/**
	 * 关押期限
	 * @param guanyaqixian 关押期限
	 */
	public void setGuanyaqixian(Date guanyaqixian){
		this.guanyaqixian = guanyaqixian;
	}
	/**
	 * 出所时间
	 * @param chusuoshijian 出所时间
	 */
	public void setChusuoshijian(Date chusuoshijian){
		this.chusuoshijian = chusuoshijian;
	}
	/**
	 * 出所原因
	 * @param chusuoyuanyin 出所原因
	 */
	public void setChusuoyuanyin(String chusuoyuanyin){
		this.chusuoyuanyin = chusuoyuanyin;
	}
	/**
	 * 现住地
	 * @param xianzhudi 现住地
	 */
	public void setXianzhudi(String xianzhudi){
		this.xianzhudi = xianzhudi;
	}
	/**
	 * 出所去向
	 * @param chusuoquxiang 出所去向
	 */
	public void setChusuoquxiang(String chusuoquxiang){
		this.chusuoquxiang = chusuoquxiang;
	}
	/**
	 * 离监日期
	 * @param lijianriqi 离监日期
	 */
	public void setLijianriqi(Date lijianriqi){
		this.lijianriqi = lijianriqi;
	}
	/**
	 * 离监去向
	 * @param lijianquxiang 离监去向
	 */
	public void setLijianquxiang(String lijianquxiang){
		this.lijianquxiang = lijianquxiang;
	}
	/**
	 * 番号
	 * @param fanhao 番号
	 */
	public void setFanhao(String fanhao){
		this.fanhao = fanhao;
	}
}
