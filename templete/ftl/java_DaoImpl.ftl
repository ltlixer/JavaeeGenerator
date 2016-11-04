package ${domain.packagePath}.${domain.domainName}.dao.impl;

import gov.util.jpa.impl.BaseJpaDaoImpl;
import ${domain.packagePath}.${domain.domainName}.dao.${domain.entityName?cap_first}Dao;

import org.springframework.stereotype.Repository;

@Repository
public class ${domain.entityName?cap_first}DaoImpl extends BaseJpaDaoImpl implements ${domain.entityName?cap_first}Dao{
	
}