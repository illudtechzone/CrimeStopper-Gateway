package com.illud.crimestopper.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.illud.crimestopper.client.crimestopper.model.ComplaintDTO;
import com.illud.crimestopper.service.QueryService;



@RestController
@RequestMapping("/api/query")
public class QueryResource {

	private final Logger log = LoggerFactory.getLogger(QueryResource.class);
	@Autowired
	QueryService queryService;
	
	
	@GetMapping("/findByComplaintId/{id}")
	public ResponseEntity<ComplaintDTO> findComplaintById(@PathVariable Long id) {		
		return queryService.findComplaintById(id);

	}
	
}
