package com.wonders.azbj.person.resettleBase.service.impl;

import gov.util.jpa.impl.BaseJpaServiceImpl;
import gov.util.jpa.BaseJpaDao;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import com.wonders.azbj.person.resettleBase.dao.ResettleBaseDao;
import com.wonders.azbj.person.resettleBase.service.ResettleBaseService;

@Service
public class ResettleBaseServiceImpl extends BaseJpaServiceImpl implements ResettleBaseService{
		@Autowired
		private ResettleBaseDao resettleBaseDao; 
		
		public BaseJpaDao getJpaDao() {
			return resettleBaseDao;
		}
}
