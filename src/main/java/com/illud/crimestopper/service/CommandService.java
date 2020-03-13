package com.illud.crimestopper.service;

import org.springframework.http.ResponseEntity;

import com.illud.crimestopper.client.crimestopper.model.AuthorityDTO;
import com.illud.crimestopper.client.crimestopper.model.ComplaintDTO;
import com.illud.crimestopper.client.crimestopper.model.MediaDTO;


public interface CommandService {

	ResponseEntity<MediaDTO> createMedia(MediaDTO mediaDTO);

	ResponseEntity<MediaDTO> updateMedia(MediaDTO mediaDTO);

	void deleteMedia(Long id);

	
	ResponseEntity<ComplaintDTO> createComplaint(ComplaintDTO complaintDTO);

	ResponseEntity<ComplaintDTO> updateComplaint(ComplaintDTO complaintDTO);

	void deleteComplaint(Long id);
	
	
	ResponseEntity<AuthorityDTO> createAuthority(AuthorityDTO authorityDTO);

	ResponseEntity<AuthorityDTO> updateAuthority(AuthorityDTO authorityDTO);

	void deleteAuthority(Long id);

}
