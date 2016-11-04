package com.wonders.azbj.work.missing.controller;

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

import com.wonders.azbj.work.missing.bo.MissingEntity;
import com.wonders.azbj.work.missing.service.MissingService;

@Controller
@RequestMapping("/missing")
public class MissingController {

	@Autowired
	private MissingService missingService; 
	
	
	@ResponseBody
	@RequestMapping("/listMissing")
	public Map<String, Object> listmissings(HttpServletRequest request,
			HttpServletResponse response,@RequestParam HashMap<String, Object> conditions,
			int page,int rows,
			Map<String, Object> model) {
		Query query = Query.from(MissingEntity.class).filter(conditions, null, FilterOperator.LIKE);
		Page<MissingEntity>  missingEntities = missingService.findAll(query, Pages.setPageAndSize(page,rows));
		Map<String, Object> jsonMap = EasyUIJsonUtils.convertJpaPageToJson(missingEntities);
		
		return jsonMap;
	}
	
	@RequestMapping("/editMissing")
	public String editmissing(String id,Map<String, Object> model){
		MissingEntity missing = (MissingEntity)missingService.find(MissingEntity.class, id);
		model.put("missing", missing); 
		return "/missing/missingEdit";
	}
	
	@ResponseBody
	@RequestMapping(value="/updateMissing")
	public Map<?, ?> updatemissing(HttpServletRequest request,
			HttpServletResponse response, MissingEntity missing){
		MissingEntity newMissing = (MissingEntity)missingService.find(MissingEntity.class, missing.getId());
		if(newMissing != null)
			BeanUtils.copyProperties(missing, newMissing);
		else
			newMissing = missing;
		missingService.save(newMissing);
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("result", "success");
		return jsonMap;
	}
	
	@ResponseBody
	@RequestMapping("/deleteMissing")
	public String delete(String[] id){
		missingService.delete(MissingEntity.class,Arrays.asList(id));
		return "sucess";
	}

}
