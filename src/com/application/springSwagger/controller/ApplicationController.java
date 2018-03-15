package com.application.springSwagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class ApplicationController {

	@RequestMapping(value = "/request", method = RequestMethod.GET)
    public String custom() {
        return "it is running";
    }
}
