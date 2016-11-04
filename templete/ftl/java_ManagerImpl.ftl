package ${domain.packagePath}.${domain.domainName}.service.impl;

import gov.util.jpa.impl.BaseJpaServiceImpl;
import gov.util.jpa.BaseJpaDao;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import ${domain.packagePath}.${domain.domainName}.dao.${domain.entityName?cap_first}Dao;
import ${domain.packagePath}.${domain.domainName}.service.${domain.entityName?cap_first}Service;

@Service
public class ${domain.entityName?cap_first}ServiceImpl extends BaseJpaServiceImpl implements ${domain.entityName?cap_first}Service{
		@Autowired
		private ${domain.entityName?cap_first}Dao ${domain.entityName}Dao; 
		
		public BaseJpaDao getJpaDao() {
			return ${domain.entityName}Dao;
		}
}
