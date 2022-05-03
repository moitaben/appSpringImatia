package com.ontimize.hr.model.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.ontimize.hr.api.core.service.IMasterService;
import com.ontimize.hr.model.core.dao.EducationDao;
import com.ontimize.hr.model.core.dao.ExperienceLevelDao;
import com.ontimize.hr.model.core.dao.OriginDao;
import com.ontimize.hr.model.core.dao.ProfileDao;
import com.ontimize.hr.model.core.dao.StatusDao;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;

@Service("MasterService")
@Lazy
public class MasterService implements IMasterService {

	@Autowired
	private EducationDao educationDao;
	@Autowired
	private ExperienceLevelDao experienceLevelDao;
	@Autowired
	private OriginDao originDao;
	@Autowired
	private ProfileDao profileDao;
	@Autowired
	private StatusDao statusDao;
	@Autowired
	private DefaultOntimizeDaoHelper daoHelper;

	@Override
	public EntityResult educationQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.educationDao, keyMap, attrList);
	}

	@Override
	public EntityResult educationInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.educationDao, attrMap);
	}

	@Override
	public EntityResult educationUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.educationDao, attrMap, keyMap);
	}

	@Override
	public EntityResult educationDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.educationDao, keyMap);
	}

	@Override
	public EntityResult experienceLevelQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.experienceLevelDao, keyMap, attrList);
	}

	@Override
	public EntityResult experienceLevelInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.experienceLevelDao, attrMap);
	}

	@Override
	public EntityResult experienceLevelUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.experienceLevelDao, attrMap, keyMap);
	}

	@Override
	public EntityResult experienceLevelDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.experienceLevelDao, keyMap);
	}

	@Override
	public EntityResult originQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.originDao, keyMap, attrList);
	}

	@Override
	public EntityResult originInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.originDao, attrMap);
	}

	@Override
	public EntityResult originUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.originDao, attrMap, keyMap);
	}

	@Override
	public EntityResult originDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.originDao, keyMap);
	}

	@Override
	public EntityResult profileQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.profileDao, keyMap, attrList);
	}

	@Override
	public EntityResult profileInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.profileDao, attrMap);
	}

	@Override
	public EntityResult profileUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.profileDao, attrMap, keyMap);
	}

	@Override
	public EntityResult profileDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.profileDao, keyMap);
	}

	@Override
	public EntityResult statusQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.statusDao, keyMap, attrList);
	}

	@Override
	public EntityResult statusInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.statusDao, attrMap);
	}

	@Override
	public EntityResult statusUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.statusDao, attrMap, keyMap);
	}

	@Override
	public EntityResult statusDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.statusDao, keyMap);
	}

}