package com.wonders.azbj.person.inPersonInfo.controller;

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

import com.wonders.azbj.person.inPersonInfo.bo.InPersonInfoEntity;
import com.wonders.azbj.person.inPersonInfo.service.InPersonInfoService;

@Controller
@RequestMapping("/inPersonInfo")
public class InPersonInfoController {

	@Autowired
	private InPersonInfoService inPersonInfoService; 
	
	
	@ResponseBody
	@RequestMapping("/listInPersonInfo")
	public Map<String, Object> listinPersonInfos(HttpServletRequest request,
			HttpServletResponse response,@RequestParam HashMap<String, Object> conditions,
			int page,int rows,
			Map<String, Object> model) {
		Query query = Query.from(InPersonInfoEntity.class).filter(conditions, null, FilterOperator.LIKE);
		Page<InPersonInfoEntity>  inPersonInfoEntities = inPersonInfoService.findAll(query, Pages.setPageAndSize(page,rows));
		Map<String, Object> jsonMap = EasyUIJsonUtils.convertJpaPageToJson(inPersonInfoEntities);
		
		return jsonMap;
	}
	
	@RequestMapping("/editInPersonInfo")
	public String editinPersonInfo(String id,Map<String, Object> model){
		InPersonInfoEntity inPersonInfo = (InPersonInfoEntity)inPersonInfoService.find(InPersonInfoEntity.class, id);
		model.put("inPersonInfo", inPersonInfo); 
		return "/inPersonInfo/inPersonInfoEdit";
	}
	
	@ResponseBody
	@RequestMapping(value="/updateInPersonInfo")
	public Map<?, ?> updateinPersonInfo(HttpServletRequest request,
			HttpServletResponse response, InPersonInfoEntity inPersonInfo){
		InPersonInfoEntity newInPersonInfo = (InPersonInfoEntity)inPersonInfoService.find(InPersonInfoEntity.class, inPersonInfo.getId());
		if(newInPersonInfo != null)
			BeanUtils.copyProperties(inPersonInfo, newInPersonInfo);
		else
			newInPersonInfo = inPersonInfo;
		inPersonInfoService.save(newInPersonInfo);
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("result", "success");
		return jsonMap;
	}
	
	@ResponseBody
	@RequestMapping("/deleteInPersonInfo")
	public String delete(String[] id){
		inPersonInfoService.delete(InPersonInfoEntity.class,Arrays.asList(id));
		return "sucess";
	}

}
