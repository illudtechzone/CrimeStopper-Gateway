package com.illud.crimestopper.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.illud.crimestopper.client.crimestopper.model.ComplaintDTO;
import com.illud.crimestopper.client.crimestopper.model.MediaDTO;

public interface QueryService {

	ResponseEntity<ComplaintDTO> findComplaintById(Long id);
	//ResponseEntity<ComplaintDTO> findComplaintById(Long id);

	ResponseEntity<List<ComplaintDTO>> findAllComplaints();

	ResponseEntity<List<ComplaintDTO>> findComplaintByAuthorityId(Long authorityId);

	ResponseEntity<List<ComplaintDTO>> findComplaintByUserIdpCode(String userIdpCode);

	ResponseEntity<List<MediaDTO>> findAllMediaByComplaintId(Long complaintId);

	
	

}
