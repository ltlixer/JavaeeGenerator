package ${domain.packagePath}.${domain.domainName}.controller;

import gov.util.bean.BeanUtils;
import gov.util.jpa.Orders;
import gov.util.jpa.Pages;
import gov.util.jpa.Query;
import gov.util.jpa.json.EasyUIJsonUtils;
import gov.util.jpa.operator.FilterOperator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ${domain.packagePath}.${domain.domainName}.bo.${domain.entityName?cap_first}Entity;
import ${domain.packagePath}.${domain.domainName}.service.${domain.entityName?cap_first}Service;

@Controller
@RequestMapping("/${domain.domainName}")
public class ${domain.entityName?cap_first}Controller {

	@Autowired
	private ${domain.entityName?cap_first}Service ${domain.entityName}Service; 
	
	
	@ResponseBody
	@RequestMapping("/list${domain.entityName?cap_first}")
	public Map<String, Object> list${domain.entityName}s(HttpServletRequest request,
			HttpServletResponse response,@RequestParam HashMap<String, Object> conditions,
			int page,int rows,
			Map<String, Object> model) {
		Query query = Query.from(${domain.entityName?cap_first}Entity.class).filter(conditions, null, FilterOperator.LIKE);
		Page<${domain.entityName?cap_first}Entity>  ${domain.entityName}Entities = ${domain.entityName}Service.findAll(query, Pages.setPageAndSize(page,rows));
		<#if domain.fkFieldName?? && domain.fkFieldName != '' >
		for(${domain.entityName?cap_first}Entity e : ${domain.entityName}Entities)
			e.get${domain.fkFieldName?cap_first}().set${domain.entityName?cap_first}(null);
		</#if>
		Map<String, Object> jsonMap = EasyUIJsonUtils.convertJpaPageToJson(${domain.entityName}Entities);
		
		return jsonMap;
	}
	
	@RequestMapping("/edit${domain.entityName?cap_first}")
	public String edit${domain.entityName}(String id,Map<String, Object> model){
		${domain.entityName?cap_first}Entity ${domain.entityName} = (${domain.entityName?cap_first}Entity)${domain.entityName}Service.find(${domain.entityName?cap_first}Entity.class, id);
		model.put("${domain.entityName}", ${domain.entityName}); 
		return "/${domain.domainName}/${domain.domainName}Edit";
	}
	
	@ResponseBody
	@RequestMapping(value="/update${domain.entityName?cap_first}")
	public Map<?, ?> update${domain.entityName}(HttpServletRequest request,
			HttpServletResponse response, ${domain.entityName?cap_first}Entity ${domain.entityName}){
		${domain.entityName?cap_first}Entity new${domain.entityName?cap_first} = (${domain.entityName?cap_first}Entity)${domain.entityName}Service.find(${domain.entityName?cap_first}Entity.class, ${domain.entityName}.getId());
		if(new${domain.entityName?cap_first} != null)
			BeanUtils.copyProperties(${domain.entityName}, new${domain.entityName?cap_first});
		else
			new${domain.entityName?cap_first} = ${domain.entityName};
		<#if domain.fkFieldName?? && domain.fkFieldName != '' >
		new${domain.entityName?cap_first}.get${domain.fkFieldName?cap_first}().set${domain.entityName?cap_first}(new${domain.entityName?cap_first});
		</#if>
		<#if domain.isCreate == "true">
		//TODO 在这要给实体newTest设置相应的创建人的ID的姓名（创建日期不用插入了）分别是setCreatedById()和setCreatedByName()方法
		
		</#if>
		<#if domain.isUpdate == "true">
		//TODO 在这要给实体newTest设置相应的修改人的ID的姓名（修改日期日期不用操作了）分别是setLastModifiedById()和setLastModifiedByName()方法
		
		</#if>
		${domain.entityName}Service.save(new${domain.entityName?cap_first});
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("result", "success");
		return jsonMap;
	}
	
	@ResponseBody
	@RequestMapping("/delete${domain.entityName?cap_first}")
	public String delete(String[] id){
		${domain.entityName}Service.delete(${domain.entityName?cap_first}Entity.class,Arrays.asList(id));
		return "sucess";
	}

}
