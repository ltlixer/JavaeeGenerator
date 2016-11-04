package  ${domain.packagePath}.${domain.domainName}.bo;

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
<#if domain.isRemove == 'true'>
import gov.util.jpa.entity.IRemovable;
</#if>
<#if domain.isCreate == 'true'>
import gov.util.jpa.entity.ICreateEntity;
</#if>
<#if domain.isUpdate == 'true'>
import gov.util.jpa.entity.IUpdateEntity;
</#if>

import org.hibernate.annotations.GenericGenerator;
import java.io.Serializable;
import org.apache.log4j.Logger;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * <p>Title: ${domain.entityName?cap_first}EntityÀà/p>
 * <p>Description: Entity for ${domain.tableName}</p>
 * @author Auto generated
 * @version 0.5
 */
@Entity
@Table(name = "${domain.tableName}")
public class ${domain.entityName?cap_first}Entity implements Serializable<#if domain.isRemove == 'true'>,IRemovable</#if><#if domain.isCreate == 'true'>,ICreateEntity</#if><#if domain.isUpdate == 'true'>,IUpdateEntity</#if>{

	public static final Logger logger = Logger.getLogger(${domain.entityName?cap_first}Entity.class);
	
	<#list fields as po>
	<#if po.dbName?? && po.dbName!=''>
	/**
	 * ${po.comments}
	 */
	<#if po.type == 'Date'>
	@DateTimeFormat(pattern="yyyy-MM-dd")
	</#if> 	
	private ${po.type} ${po.name};
	</#if>
	</#list>
	
	<#list fields as po> 
	<#if po.dbName?? && po.dbName!=''>
	/**
	 * ${po.comments}
	 * @return ${po.name}
	 */
	<#if domain.fkFieldName?? && domain.fkFieldName == po.name >
	<#if po.dbName == '_MainFk'>
	@OneToOne(optional = true, cascade = CascadeType.ALL, mappedBy = "${domain.entityName}",fetch=FetchType.EAGER)
	<#else>
	@OneToOne(optional = false, cascade = CascadeType.REFRESH,fetch=FetchType.LAZY)
 	@JoinColumn(name = "${po.dbName}", unique = true)
	</#if>
	<#else>
	<#if domain.pkName?? && domain.pkName == po.dbName >
	@Id
	@Column(name = "${po.dbName}" ,unique = true ,nullable = false)
	@GeneratedValue(generator = "idGenerator")
	@GenericGenerator(name = "idGenerator" ,strategy = "${domain.pkStrategy}")
	<#else>
	@Column(name = "${po.dbName}")
	</#if>
	</#if>
	public ${po.type} get${po.name?cap_first}(){
		return this.${po.name};
	}
	</#if>
	</#list>
	<#list fields as po> 
	<#if po.dbName?? && po.dbName!=''>
	/**
	 * ${po.comments}
	 * @param ${po.name} ${po.comments}
	 */
	public void set${po.name?cap_first}(${po.type} ${po.name}){
		this.${po.name} = ${po.name};
	}
	</#if>
	</#list>
}
