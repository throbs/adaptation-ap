package io.swagger.api;

import io.swagger.model.Per;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

//本controller的功能描述

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T17:20:01.502+08:00")

@Api(value = "nm_perfs", description = "the nm_perfs API")
public interface NmPerfsApi {

    @ApiOperation(value = "Get all performance info.", notes = "Get all performance info.", response = Per.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Per.class),
        @ApiResponse(code = 404, message = "Pet not found", response = Per.class),
        @ApiResponse(code = 200, message = "Unknown error", response = Per.class) })
    @RequestMapping(value = "/nm_perfs",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Per> nmPerfsGet(@ApiParam(value = "The nfvi username", required = true) @RequestParam(value = "username", required = true) String username



,@ApiParam(value = "The nfvi password", required = true) @RequestParam(value = "password", required = true) String password



);

}
