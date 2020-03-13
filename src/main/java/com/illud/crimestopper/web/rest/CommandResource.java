package com.illud.crimestopper.web.rest;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.illud.crimestopper.client.crimestopper.api.ComplaintResourceApi;
import com.illud.crimestopper.client.crimestopper.api.MediaResourceApi;
import com.illud.crimestopper.client.crimestopper.model.AuthorityDTO;
import com.illud.crimestopper.client.crimestopper.model.ComplaintDTO;
import com.illud.crimestopper.client.crimestopper.model.MediaDTO;
import com.illud.crimestopper.service.CommandService;



@RestController
@RequestMapping("/api/command")
public class CommandResource {
	
	@Autowired
	CommandService commandService;
	
	@PostMapping("/medias")
	public ResponseEntity<MediaDTO> createMedia(@RequestBody MediaDTO mediaDTO) throws URISyntaxException
	{
		ResponseEntity<MediaDTO> mediaDto = commandService.createMedia(mediaDTO);
		return mediaDto;
	}
	
	@PutMapping("/medias")
    public ResponseEntity<MediaDTO> updateMedia(@RequestBody MediaDTO mediaDTO)  {
	  return  commandService.updateMedia(mediaDTO);
  }  
	
	@DeleteMapping("/medias/{id}")
	  public void deleteMedia(@PathVariable Long id){
		   commandService.deleteMedia(id);
	  } 
	  
	  @PostMapping("/complaints")
	  public ResponseEntity<ComplaintDTO> createComplaint(@RequestBody ComplaintDTO complaintDTO) throws URISyntaxException
	{
		ResponseEntity<ComplaintDTO> complaintDto = commandService.createComplaint(complaintDTO);
		return complaintDto;
	}
	
	@PutMapping("/complaints")
    public ResponseEntity<ComplaintDTO> updateComplaint(@RequestBody ComplaintDTO complaintDTO)  {
	  return  commandService.updateComplaint(complaintDTO);
  }  
	
	@DeleteMapping("/complaint/{id}")
	  public void deleteComplaint(@PathVariable Long id){
		   commandService.deleteComplaint(id);
	  } 
	
	 @PostMapping("/authorities")
	  public ResponseEntity<AuthorityDTO> createAuthority(@RequestBody AuthorityDTO authorityDTO) throws URISyntaxException
	{
		ResponseEntity<AuthorityDTO> authorityDto = commandService.createAuthority(authorityDTO);
		return authorityDto;
	}
	
	@PutMapping("/authorities")
    public ResponseEntity<AuthorityDTO> updateAuthority(@RequestBody AuthorityDTO authorityDTO)  {
	  return  commandService.updateAuthority(authorityDTO);
  }  
	
	@DeleteMapping("/authorities/{id}")
	  public void deleteAuthority(@PathVariable Long id){
		   commandService.deleteAuthority(id);
	  } 
}
