package com.wonders.azbj.person.resettleBase.controller;

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

import com.wonders.azbj.person.resettleBase.bo.ResettleBaseEntity;
import com.wonders.azbj.person.resettleBase.service.ResettleBaseService;

@Controller
@RequestMapping("/resettleBase")
public class ResettleBaseController {

	@Autowired
	private ResettleBaseService resettleBaseService; 
	
	
	@ResponseBody
	@RequestMapping("/listResettleBase")
	public Map<String, Object> listresettleBases(HttpServletRequest request,
			HttpServletResponse response,@RequestParam HashMap<String, Object> conditions,
			int page,int rows,
			Map<String, Object> model) {
		Query query = Query.from(ResettleBaseEntity.class).filter(conditions, null, FilterOperator.LIKE);
		Page<ResettleBaseEntity>  resettleBaseEntities = resettleBaseService.findAll(query, Pages.setPageAndSize(page,rows));
		Map<String, Object> jsonMap = EasyUIJsonUtils.convertJpaPageToJson(resettleBaseEntities);
		
		return jsonMap;
	}
	
	@RequestMapping("/editResettleBase")
	public String editresettleBase(String id,Map<String, Object> model){
		ResettleBaseEntity resettleBase = (ResettleBaseEntity)resettleBaseService.find(ResettleBaseEntity.class, id);
		model.put("resettleBase", resettleBase); 
		return "/resettleBase/resettleBaseEdit";
	}
	
	@ResponseBody
	@RequestMapping(value="/updateResettleBase")
	public Map<?, ?> updateresettleBase(HttpServletRequest request,
			HttpServletResponse response, ResettleBaseEntity resettleBase){
		ResettleBaseEntity newResettleBase = (ResettleBaseEntity)resettleBaseService.find(ResettleBaseEntity.class, resettleBase.getId());
		if(newResettleBase != null)
			BeanUtils.copyProperties(resettleBase, newResettleBase);
		else
			newResettleBase = resettleBase;
		resettleBaseService.save(newResettleBase);
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("result", "success");
		return jsonMap;
	}
	
	@ResponseBody
	@RequestMapping("/deleteResettleBase")
	public String delete(String[] id){
		resettleBaseService.delete(ResettleBaseEntity.class,Arrays.asList(id));
		return "sucess";
	}

}
