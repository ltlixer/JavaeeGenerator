package com.wonders.azbj.work.missing.service.impl;

import gov.util.jpa.impl.BaseJpaServiceImpl;
import gov.util.jpa.BaseJpaDao;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import com.wonders.azbj.work.missing.dao.MissingDao;
import com.wonders.azbj.work.missing.service.MissingService;

@Service
public class MissingServiceImpl extends BaseJpaServiceImpl implements MissingService{
		@Autowired
		private MissingDao missingDao; 
		
		public BaseJpaDao getJpaDao() {
			return missingDao;
		}
}
