/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.illud.crimestopper.client.crimestopper.api;

import com.illud.crimestopper.client.crimestopper.model.LinkedComplaintDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-16T10:41:21.873813800+05:30[Asia/Colombo]")

@Api(value = "LinkedComplaintResource", description = "the LinkedComplaintResource API")
public interface LinkedComplaintResourceApi {

    @ApiOperation(value = "createLinkedComplaint", nickname = "createLinkedComplaintUsingPOST", notes = "", response = LinkedComplaintDTO.class, tags={ "linked-complaint-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LinkedComplaintDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/linked-complaints",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<LinkedComplaintDTO> createLinkedComplaintUsingPOST(@ApiParam(value = "linkedComplaintDTO" ,required=true )  @Valid @RequestBody LinkedComplaintDTO linkedComplaintDTO);


    @ApiOperation(value = "deleteLinkedComplaint", nickname = "deleteLinkedComplaintUsingDELETE", notes = "", tags={ "linked-complaint-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/linked-complaints/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteLinkedComplaintUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllLinkedComplaints", nickname = "getAllLinkedComplaintsUsingGET", notes = "", response = LinkedComplaintDTO.class, responseContainer = "List", tags={ "linked-complaint-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LinkedComplaintDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/linked-complaints",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<LinkedComplaintDTO>> getAllLinkedComplaintsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getLinkedComplaint", nickname = "getLinkedComplaintUsingGET", notes = "", response = LinkedComplaintDTO.class, tags={ "linked-complaint-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LinkedComplaintDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/linked-complaints/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<LinkedComplaintDTO> getLinkedComplaintUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchLinkedComplaints", nickname = "searchLinkedComplaintsUsingGET", notes = "", response = LinkedComplaintDTO.class, responseContainer = "List", tags={ "linked-complaint-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LinkedComplaintDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/linked-complaints",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<LinkedComplaintDTO>> searchLinkedComplaintsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateLinkedComplaint", nickname = "updateLinkedComplaintUsingPUT", notes = "", response = LinkedComplaintDTO.class, tags={ "linked-complaint-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LinkedComplaintDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/linked-complaints",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<LinkedComplaintDTO> updateLinkedComplaintUsingPUT(@ApiParam(value = "linkedComplaintDTO" ,required=true )  @Valid @RequestBody LinkedComplaintDTO linkedComplaintDTO);

}
