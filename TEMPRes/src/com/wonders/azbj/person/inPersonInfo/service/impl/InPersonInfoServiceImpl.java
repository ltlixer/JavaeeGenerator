package com.wonders.azbj.person.inPersonInfo.service.impl;

import gov.util.jpa.impl.BaseJpaServiceImpl;
import gov.util.jpa.BaseJpaDao;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import com.wonders.azbj.person.inPersonInfo.dao.InPersonInfoDao;
import com.wonders.azbj.person.inPersonInfo.service.InPersonInfoService;

@Service
public class InPersonInfoServiceImpl extends BaseJpaServiceImpl implements InPersonInfoService{
		@Autowired
		private InPersonInfoDao inPersonInfoDao; 
		
		public BaseJpaDao getJpaDao() {
			return inPersonInfoDao;
		}
}
