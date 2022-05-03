package com.ontimize.hr.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("OfferCandidateStatusDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/OfferCandidateStatusDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class OfferCandidateStatusDao extends OntimizeJdbcDaoSupport {

	public static final String ATTR_ID = "ID";
	public static final String ATTR_DESCRIPTION = "DESCRIPTION";

}