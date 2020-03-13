package com.illud.crimestopper.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.query.StringQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.vanroy.springdata.jest.JestElasticsearchTemplate;
import com.illud.crimestopper.client.crimestopper.api.ComplaintResourceApi;
import com.illud.crimestopper.client.crimestopper.api.MediaResourceApi;
import com.illud.crimestopper.client.crimestopper.model.Complaint;
import com.illud.crimestopper.client.crimestopper.model.ComplaintDTO;
import com.illud.crimestopper.client.crimestopper.model.MediaDTO;
import com.illud.crimestopper.service.QueryService;
import static org.elasticsearch.index.query.QueryBuilders.*;

import java.util.List;

import io.searchbox.client.JestClient;


@Service
@Transactional
public class QueryServiceImpl implements QueryService {
	private final Logger log = LoggerFactory.getLogger(QueryServiceImpl.class);
	@Autowired
	private ComplaintResourceApi complaintResourceApi;
	
	@Autowired
	 MediaResourceApi mediaResourceApi;
	

	private final JestClient jestClient;
	private final JestElasticsearchTemplate esTemplate;
	public QueryServiceImpl(JestClient jestClient, JestElasticsearchTemplate esTemplate) {
		this.jestClient = jestClient;
		this.esTemplate = esTemplate;
	}

	/*@Override
	public ResponseEntity<ComplaintDTO> findComplaintById(Long id) {
		StringQuery sq = new StringQuery(termQuery("id", id).toString());
		return complaintResourceApi.convertComplaintToDtoUsingPOST(esTemplate.queryForObject(sq, Complaint.class));
		
	}*/

	public ResponseEntity<ComplaintDTO> findComplaintById(Long id)
	{
		return complaintResourceApi.getComplaintUsingGET(id);
	}
	
	public ResponseEntity<List<ComplaintDTO>> findAllComplaints()
	{
		 
		
		return complaintResourceApi.getAllComplaintsUsingGET();
	}
	
	public ResponseEntity<List<ComplaintDTO>> findComplaintByAuthorityId(Long authorityId)
	{
		return complaintResourceApi.findComplaintByAuthorityIdUsingGET(authorityId);
	}
	
	public ResponseEntity<List<ComplaintDTO>> findComplaintByUserIdpCode(String userIdpCode)
	{
		return complaintResourceApi.findComplaintByUserIdpCodeUsingGET(userIdpCode);

	}
	
	public ResponseEntity<List<MediaDTO>> findAllMediaByComplaintId(Long complaintId)
	{
		return mediaResourceApi.findAllMediaByComplaintIdUsingGET(complaintId);

	}
}
