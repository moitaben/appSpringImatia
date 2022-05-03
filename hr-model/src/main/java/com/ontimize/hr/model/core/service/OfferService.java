package com.ontimize.hr.model.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.ontimize.hr.api.core.service.IOfferService;
import com.ontimize.hr.model.core.dao.OfferCandidateStatusDao;
import com.ontimize.hr.model.core.dao.OfferCandidatesDao;
import com.ontimize.hr.model.core.dao.OfferDao;
import com.ontimize.hr.model.core.dao.OfferStatusDao;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;

@Service("OfferService")
@Lazy
public class OfferService implements IOfferService {

	@Autowired
	private OfferDao offerDao;
	@Autowired
	private OfferStatusDao offerStatusDao;
	@Autowired
	private OfferCandidatesDao offerCandidatesDao;
	@Autowired
	private OfferCandidateStatusDao offerCandidateStatusDao;
	@Autowired
	private DefaultOntimizeDaoHelper daoHelper;

	@Override
	public EntityResult offerQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.offerDao, keyMap, attrList);
	}

	@Override
	public EntityResult offerInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.offerDao, attrMap);
	}

	@Override
	public EntityResult offerUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.offerDao, attrMap, keyMap);
	}

	@Override
	public EntityResult offerDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.offerDao, keyMap);
	}

	@Override
	public EntityResult offerStatusQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.offerStatusDao, keyMap, attrList);
	}

	@Override
	public EntityResult offerStatusInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.offerStatusDao, attrMap);
	}

	@Override
	public EntityResult offerStatusUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.offerStatusDao, attrMap, keyMap);
	}

	@Override
	public EntityResult offerStatusDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.offerStatusDao, keyMap);
	}

	@Override
	public EntityResult offerCandidateQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.offerCandidatesDao, keyMap, attrList);
	}

	@Override
	public EntityResult offerCandidateInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.offerCandidatesDao, attrMap);
	}

	@Override
	public EntityResult offerCandidateUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.offerCandidatesDao, attrMap, keyMap);
	}

	@Override
	public EntityResult offerCandidateDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.offerCandidatesDao, keyMap);
	}

	@Override
	public EntityResult offerCandidateStatusQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.offerCandidateStatusDao, keyMap, attrList);
	}

	@Override
	public EntityResult offerCandidateStatusInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.offerCandidateStatusDao, attrMap);
	}

	@Override
	public EntityResult offerCandidateStatusUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.offerCandidateStatusDao, attrMap, keyMap);
	}

	@Override
	public EntityResult offerCandidateStatusDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.offerCandidateStatusDao, keyMap);
	}
}