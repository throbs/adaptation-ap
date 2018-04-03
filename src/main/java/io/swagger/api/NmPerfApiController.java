package io.swagger.api;

import io.swagger.model.Per;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T17:20:01.502+08:00")

@Controller
public class NmPerfApiController implements NmPerfApi {

    public ResponseEntity<Per> nmPerf1dayGet(@ApiParam(value = "The nfvi username", required = true) @RequestParam(value = "username", required = true) String username



,
        @ApiParam(value = "The nfvi password", required = true) @RequestParam(value = "password", required = true) String password



) {
        // do some magic!
        return new ResponseEntity<Per>(HttpStatus.OK);
    }

    public ResponseEntity<Per> nmPerf2hourGet(@ApiParam(value = "The nfvi username", required = true) @RequestParam(value = "username", required = true) String username



,
        @ApiParam(value = "The nfvi password", required = true) @RequestParam(value = "password", required = true) String password



) {
        // do some magic!
        return new ResponseEntity<Per>(HttpStatus.OK);
    }

    public ResponseEntity<Per> nmPerf30minGet(@ApiParam(value = "The nfvi username", required = true) @RequestParam(value = "username", required = true) String username



,
        @ApiParam(value = "The nfvi password", required = true) @RequestParam(value = "password", required = true) String password



) {
        // do some magic!
        return new ResponseEntity<Per>(HttpStatus.OK);
    }

    public ResponseEntity<Per> nmPerf5minGet(@ApiParam(value = "The nfvi username", required = true) @RequestParam(value = "username", required = true) String username



,
        @ApiParam(value = "The nfvi password", required = true) @RequestParam(value = "password", required = true) String password



) {
        // do some magic!
        return new ResponseEntity<Per>(HttpStatus.OK);
    }

}
