package com.etsmtl.codecrusade.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-11-21T15:05:02.152-05:00[America/New_York]")

@Controller
@RequestMapping("${openapi.apiDocumentation.base-path:}")
public class AuthApiController implements AuthApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AuthApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
