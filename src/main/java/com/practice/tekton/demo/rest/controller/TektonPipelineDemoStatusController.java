package com.practice.tekton.demo.rest.controller;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tekton")
public class TektonPipelineDemoStatusController {

  private static final Logger logger = LoggerFactory.getLogger(TektonPipelineDemoStatusController.class);

  @Autowired private Environment env;

  @GetMapping("/status/check")
  public ResponseEntity<?> getstatus(HttpServletRequest request) {
    String responseString = "TektonPipelineDemo  Working on port " + this.env.getProperty("local.server.port");
    return new ResponseEntity<String>(responseString, HttpStatus.OK);
  }
}
