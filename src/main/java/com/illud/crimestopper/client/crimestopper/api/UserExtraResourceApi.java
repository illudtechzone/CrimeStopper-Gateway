/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.illud.crimestopper.client.crimestopper.api;

import com.illud.crimestopper.client.crimestopper.model.UserExtraDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-11T14:29:41.420+05:30[Asia/Calcutta]")

@Api(value = "UserExtraResource", description = "the UserExtraResource API")
public interface UserExtraResourceApi {

    @ApiOperation(value = "createUserExtra", nickname = "createUserExtraUsingPOST", notes = "", response = UserExtraDTO.class, tags={ "user-extra-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserExtraDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/user-extras",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<UserExtraDTO> createUserExtraUsingPOST(@ApiParam(value = "userExtraDTO" ,required=true )  @Valid @RequestBody UserExtraDTO userExtraDTO);


    @ApiOperation(value = "deleteUserExtra", nickname = "deleteUserExtraUsingDELETE", notes = "", tags={ "user-extra-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/user-extras/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUserExtraUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllUserExtras", nickname = "getAllUserExtrasUsingGET", notes = "", response = UserExtraDTO.class, responseContainer = "List", tags={ "user-extra-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserExtraDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/user-extras",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<UserExtraDTO>> getAllUserExtrasUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getUserExtra", nickname = "getUserExtraUsingGET", notes = "", response = UserExtraDTO.class, tags={ "user-extra-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserExtraDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/user-extras/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<UserExtraDTO> getUserExtraUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchUserExtras", nickname = "searchUserExtrasUsingGET", notes = "", response = UserExtraDTO.class, responseContainer = "List", tags={ "user-extra-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserExtraDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/user-extras",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<UserExtraDTO>> searchUserExtrasUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateUserExtra", nickname = "updateUserExtraUsingPUT", notes = "", response = UserExtraDTO.class, tags={ "user-extra-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserExtraDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/user-extras",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<UserExtraDTO> updateUserExtraUsingPUT(@ApiParam(value = "userExtraDTO" ,required=true )  @Valid @RequestBody UserExtraDTO userExtraDTO);

}