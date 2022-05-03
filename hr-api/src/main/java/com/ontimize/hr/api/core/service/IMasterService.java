package com.ontimize.hr.api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IMasterService {

	// EDUCATION
	public EntityResult educationQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException;

	public EntityResult educationInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

	public EntityResult educationUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException;

	public EntityResult educationDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

	// EXPERIENCE_LEVEL
	public EntityResult experienceLevelQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException;

	public EntityResult experienceLevelInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

	public EntityResult experienceLevelUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException;

	public EntityResult experienceLevelDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

	// ORIGIN
	public EntityResult originQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException;

	public EntityResult originInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

	public EntityResult originUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException;

	public EntityResult originDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

	// PROFILE
	public EntityResult profileQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException;

	public EntityResult profileInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

	public EntityResult profileUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException;

	public EntityResult profileDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

	// STATUS
	public EntityResult statusQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException;

	public EntityResult statusInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

	public EntityResult statusUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException;

	public EntityResult statusDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

}