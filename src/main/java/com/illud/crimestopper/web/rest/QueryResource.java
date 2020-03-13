package com.illud.crimestopper.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.illud.crimestopper.client.crimestopper.model.ComplaintDTO;
import com.illud.crimestopper.client.crimestopper.model.MediaDTO;
import com.illud.crimestopper.service.QueryService;



@RestController
@RequestMapping("/api/query")
public class QueryResource {

	private final Logger log = LoggerFactory.getLogger(QueryResource.class);
	@Autowired
	QueryService queryService;
	
	
	/*@GetMapping("/findByComplaintId/{id}")
	public ResponseEntity<ComplaintDTO> findComplaintById(@PathVariable Long id) {		
		return queryService.findComplaintById(id);

	}*/
	
	@GetMapping("/findByComplaintId/{id}")
	public ResponseEntity<ComplaintDTO> findComplaintById(@PathVariable Long id)
	{
		return queryService.findComplaintById(id);
	}
	
	@GetMapping("/findAllComplaints")
	public ResponseEntity<List<ComplaintDTO>> findAllComplaints()
	{
		ResponseEntity<List<ComplaintDTO>> complaints = queryService.findAllComplaints();
		return complaints;
	}
	
	@GetMapping("/findComplaintByAuthorityId/{authorityId}")
	public ResponseEntity<List<ComplaintDTO>> findComplaintByAuthorityId(@PathVariable Long authorityId)
	{
		ResponseEntity<List<ComplaintDTO>> complaints = queryService.findComplaintByAuthorityId(authorityId);
		return complaints;
	}
	
	@GetMapping("/findComplaintByUserIdpCode/{userIdpCode}")
	public ResponseEntity<List<ComplaintDTO>> findComplaintByUserIdpCode(@PathVariable String userIdpCode)
	{
		ResponseEntity<List<ComplaintDTO>> complaints = queryService.findComplaintByUserIdpCode(userIdpCode);
		return complaints;
	}
	
	@GetMapping("/findAllMediaByComplaintId/{complaintId}")
	public ResponseEntity<List<MediaDTO>> findAllMediaByComplaintId(@PathVariable Long complaintId)
	{
		ResponseEntity<List<MediaDTO>> medias = queryService.findAllMediaByComplaintId(complaintId);
		return medias;
	}
}
