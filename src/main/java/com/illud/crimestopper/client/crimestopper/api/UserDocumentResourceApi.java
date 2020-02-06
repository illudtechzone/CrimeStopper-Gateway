/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.illud.crimestopper.client.crimestopper.api;

import com.illud.crimestopper.client.crimestopper.model.UserDocumentDTO;
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

@Api(value = "UserDocumentResource", description = "the UserDocumentResource API")
public interface UserDocumentResourceApi {

    @ApiOperation(value = "createUserDocument", nickname = "createUserDocumentUsingPOST", notes = "", response = UserDocumentDTO.class, tags={ "user-document-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserDocumentDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/user-documents",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<UserDocumentDTO> createUserDocumentUsingPOST(@ApiParam(value = "userDocumentDTO" ,required=true )  @Valid @RequestBody UserDocumentDTO userDocumentDTO);


    @ApiOperation(value = "deleteUserDocument", nickname = "deleteUserDocumentUsingDELETE", notes = "", tags={ "user-document-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/user-documents/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUserDocumentUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllUserDocuments", nickname = "getAllUserDocumentsUsingGET", notes = "", response = UserDocumentDTO.class, responseContainer = "List", tags={ "user-document-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserDocumentDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/user-documents",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<UserDocumentDTO>> getAllUserDocumentsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getUserDocument", nickname = "getUserDocumentUsingGET", notes = "", response = UserDocumentDTO.class, tags={ "user-document-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserDocumentDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/user-documents/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<UserDocumentDTO> getUserDocumentUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchUserDocuments", nickname = "searchUserDocumentsUsingGET", notes = "", response = UserDocumentDTO.class, responseContainer = "List", tags={ "user-document-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserDocumentDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/user-documents",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<UserDocumentDTO>> searchUserDocumentsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateUserDocument", nickname = "updateUserDocumentUsingPUT", notes = "", response = UserDocumentDTO.class, tags={ "user-document-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserDocumentDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/user-documents",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<UserDocumentDTO> updateUserDocumentUsingPUT(@ApiParam(value = "userDocumentDTO" ,required=true )  @Valid @RequestBody UserDocumentDTO userDocumentDTO);

}