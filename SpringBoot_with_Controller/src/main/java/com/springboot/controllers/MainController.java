package com.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
@RequestMapping(method = RequestMethod.GET)
public class MainController {

   @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "JPA + Hibernate + MySQL + Swagger with Spring Boot App started!";
    }

}
