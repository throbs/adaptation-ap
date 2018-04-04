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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T17:20:01.502+08:00")

@Api(value = "nm_perf", description = "the nm_perf API")
public interface NmPerfApi {

	//@ApiOperation(value = “接口说明”, httpMethod = “接口请求方式”, response = “接口返回参数类型”, notes = “接口发布说明”)；其他参数可参考源码

    @ApiOperation(value = "Get 1 day nm_perf data", notes = "Get 1 day nm_perf data", response = Per.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Per.class),
        @ApiResponse(code = 404, message = "Pet not found", response = Per.class),
        @ApiResponse(code = 200, message = "Unknown error", response = Per.class) })
    @RequestMapping(value = "/nm_perf/1day",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Per> nmPerf1dayGet(@ApiParam(value = "The nfvi username", required = true) @RequestParam(value = "username", required = true) String username


//@ApiParam(required = “是否必须参数”, name = “参数名称”, value = “参数具体描述”）


,@ApiParam(value = "The nfvi password", required = true) @RequestParam(value = "password", required = true) String password



);


    @ApiOperation(value = "Get 2 hour nm_perf data", notes = "Get 2 hour nm_perf data", response = Per.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Per.class),
        @ApiResponse(code = 404, message = "Pet not found", response = Per.class),
        @ApiResponse(code = 200, message = "Unknown error", response = Per.class) })
    @RequestMapping(value = "/nm_perf/2hour",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Per> nmPerf2hourGet(@ApiParam(value = "The nfvi username", required = true) @RequestParam(value = "username", required = true) String username



,@ApiParam(value = "The nfvi password", required = true) @RequestParam(value = "password", required = true) String password



);


    @ApiOperation(value = "Get 30 minutes nm_perf data", notes = "Get 30 minutes nm_perf data", response = Per.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Per.class),
        @ApiResponse(code = 404, message = "Pet not found", response = Per.class),
        @ApiResponse(code = 200, message = "Unknown error", response = Per.class) })
    @RequestMapping(value = "/nm_perf/30min",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Per> nmPerf30minGet(@ApiParam(value = "The nfvi username", required = true) @RequestParam(value = "username", required = true) String username



,@ApiParam(value = "The nfvi password", required = true) @RequestParam(value = "password", required = true) String password



);


    @ApiOperation(value = "Get 5 minutes nm_perf data", notes = "Get 5 minutes nm_perf data", response = Per.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Per.class),
        @ApiResponse(code = 404, message = "Pet not foun", response = Per.class),
        @ApiResponse(code = 200, message = "Unknown error", response = Per.class) })
    @RequestMapping(value = "/nm_perf/5min",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Per> nmPerf5minGet(@ApiParam(value = "The nfvi username", required = true) @RequestParam(value = "username", required = true) String username



,@ApiParam(value = "The nfvi password", required = true) @RequestParam(value = "password", required = true) String password



);

}
