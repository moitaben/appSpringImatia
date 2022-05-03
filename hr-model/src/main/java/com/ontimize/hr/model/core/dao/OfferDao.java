package com.ontimize.hr.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("OfferDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/OfferDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class OfferDao extends OntimizeJdbcDaoSupport {

	public static final String ATTR_ID = "ID";
	public static final String ATTR_ACRONYM = "ACRONYM";
	public static final String ATTR_DESCRIPTION = "DESCRIPTION";
	public static final String ATTR_APPLICANT = "APPLICANT";
	public static final String ATTR_OFFER_STATUS = "OFFER_STATUS";
	public static final String ATTR_CREATION_DATE = "CREATION_DATE";
	public static final String ATTR_START_DATE = "START_DATE";
	public static final String ATTR_END_DATE = "END_DATE";

}