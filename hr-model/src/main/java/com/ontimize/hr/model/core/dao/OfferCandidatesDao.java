package com.ontimize.hr.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("OfferCandidatesDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/OfferCandidatesDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class OfferCandidatesDao extends OntimizeJdbcDaoSupport {

	public static final String ATTR_ID = "ID";
	public static final String ATTR_OFFER_ID = "OFFER_ID";
	public static final String ATTR_CANDIDATE_ID = "CANDIDATE_ID";
	public static final String ATTR_OFFER_CANDIDATE_STATUS = "OFFER_CANDIDATE_STATUS";

}