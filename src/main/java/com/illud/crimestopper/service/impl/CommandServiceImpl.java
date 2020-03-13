package com.illud.crimestopper.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.illud.crimestopper.client.crimestopper.api.AuthorityResourceApi;
import com.illud.crimestopper.client.crimestopper.api.ComplaintResourceApi;
import com.illud.crimestopper.client.crimestopper.api.MediaResourceApi;
import com.illud.crimestopper.client.crimestopper.model.AuthorityDTO;
import com.illud.crimestopper.client.crimestopper.model.ComplaintDTO;
import com.illud.crimestopper.client.crimestopper.model.MediaDTO;
import com.illud.crimestopper.service.CommandService;

@Service
public class CommandServiceImpl implements CommandService {
	
	@Autowired
	MediaResourceApi mediaResourceApi;
	
	@Autowired
	ComplaintResourceApi complaintResourceApi;
	
	@Autowired
	AuthorityResourceApi authorityResourceApi;
	
	public ResponseEntity<MediaDTO> createMedia(MediaDTO mediaDTO)
	{
		ResponseEntity<MediaDTO> mediaDto = mediaResourceApi.createMediaUsingPOST(mediaDTO); 
	    
		  return  mediaDto;
	}

	 public ResponseEntity<MediaDTO> updateMedia(MediaDTO mediaDTO)  {
		 
		  return mediaResourceApi.updateMediaUsingPUT(mediaDTO);
	  }    
	  
	 public void deleteMedia(Long id){
		 
		 mediaResourceApi.deleteMediaUsingDELETE(id);
	  }
	  
	  
	  public ResponseEntity<ComplaintDTO> createComplaint(ComplaintDTO complaintDTO)
	{
		ResponseEntity<ComplaintDTO> complaintDto = complaintResourceApi.createComplaintUsingPOST(complaintDTO); 
	    
		  return  complaintDto;
	}

	 public ResponseEntity<ComplaintDTO> updateComplaint(ComplaintDTO complaintDTO)  {
		 
		  return complaintResourceApi.updateComplaintUsingPUT(complaintDTO);
	  }    
	  
	 public void deleteComplaint(Long id){
		 
		 complaintResourceApi.deleteComplaintUsingDELETE(id);
	  }
	  
	  
	  
	    public ResponseEntity<AuthorityDTO> createAuthority(AuthorityDTO authorityDTO)
	{
		ResponseEntity<AuthorityDTO> authorityDto = authorityResourceApi.createAuthorityUsingPOST(authorityDTO); 
	    
		  return  authorityDto;
	}

	 public ResponseEntity<AuthorityDTO> updateAuthority(AuthorityDTO authorityDTO)  {
		 
		  return authorityResourceApi.updateAuthorityUsingPUT(authorityDTO);
	  }    
	  
	 public void deleteAuthority(Long id){
		 
		 authorityResourceApi.deleteAuthorityUsingDELETE(id);
	  }
}
