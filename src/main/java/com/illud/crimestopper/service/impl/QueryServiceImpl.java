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
import com.illud.crimestopper.client.crimestopper.model.Complaint;
import com.illud.crimestopper.client.crimestopper.model.ComplaintDTO;
import com.illud.crimestopper.service.QueryService;
import static org.elasticsearch.index.query.QueryBuilders.*;

import io.searchbox.client.JestClient;


@Service
@Transactional
public class QueryServiceImpl implements QueryService {
	private final Logger log = LoggerFactory.getLogger(QueryServiceImpl.class);
	@Autowired
	private ComplaintResourceApi complaintResourceApi;
	private final JestClient jestClient;
	private final JestElasticsearchTemplate esTemplate;
	public QueryServiceImpl(JestClient jestClient, JestElasticsearchTemplate esTemplate) {
		this.jestClient = jestClient;
		this.esTemplate = esTemplate;
	}


	@Override
	public ResponseEntity<ComplaintDTO> findComplaintById(Long id) {
		StringQuery sq = new StringQuery(termQuery("id", id).toString());
		return complaintResourceApi.convertComplaintToDtoUsingPOST(esTemplate.queryForObject(sq, Complaint.class));
		
	}

	
	
}
