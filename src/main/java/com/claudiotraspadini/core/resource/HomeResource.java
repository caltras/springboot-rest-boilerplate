package com.claudiotraspadini.core.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeResource {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public ResponseEntity<String> list() {
    return new ResponseEntity<String>("<h1>Springboot Boilerplate</h1><a href='/users'>Users</a>", HttpStatus.OK);
  }

}
