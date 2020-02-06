package com.illud.crimestopper.web.rest;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.illud.crimestopper.client.crimestopper.api.ComplaintResourceApi;
import com.illud.crimestopper.client.crimestopper.api.MediaResourceApi;
import com.illud.crimestopper.client.crimestopper.model.ComplaintDTO;
import com.illud.crimestopper.client.crimestopper.model.MediaDTO;



@RestController
@RequestMapping("/api/command")
public class CommandResource {
	
	@Autowired
	ComplaintResourceApi complaintResourceApi;
	@Autowired
	MediaResourceApi mediaResourceApi;
	 /**
     * {@code POST  /complaints} : Create a new complaint.
     *
     * @param complaintDTO the complaintDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new complaintDTO, or with status {@code 400 (Bad Request)} if the complaint has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/complaints")
    public ResponseEntity<ComplaintDTO> createComplaint(@RequestBody ComplaintDTO complaintDTO) throws URISyntaxException
    {
		return this.complaintResourceApi.createComplaintUsingPOST(complaintDTO);
    	
    }
    @PostMapping("/medias")
    public ResponseEntity<MediaDTO> createMedia(@RequestBody MediaDTO mediaDTO) throws URISyntaxException
    {
		return this.mediaResourceApi.createMediaUsingPOST(mediaDTO);
    	
    }
}
