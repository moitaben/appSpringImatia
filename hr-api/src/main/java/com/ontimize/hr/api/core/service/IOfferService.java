package com.ontimize.hr.api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IOfferService {

	// OFFER
	public EntityResult offerQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException;

	public EntityResult offerInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

	public EntityResult offerUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException;

	public EntityResult offerDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

	// OFFER STATUS
	public EntityResult offerStatusQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException;

	public EntityResult offerStatusInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

	public EntityResult offerStatusUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException;

	public EntityResult offerStatusDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

	// OFFER CANDIDATES
	public EntityResult offerCandidateQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException;

	public EntityResult offerCandidateInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

	public EntityResult offerCandidateUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException;

	public EntityResult offerCandidateDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

	// OFFER CANDIDATES STATUS
	public EntityResult offerCandidateStatusQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException;

	public EntityResult offerCandidateStatusInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

	public EntityResult offerCandidateStatusUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException;

	public EntityResult offerCandidateStatusDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
}