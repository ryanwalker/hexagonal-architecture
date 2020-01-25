package com.architecture.hexagonal.web;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
    path = "api/v1/accounts",
    produces = APPLICATION_JSON_VALUE,
    consumes = APPLICATION_JSON_VALUE)
public class AccountController {

  @RequestMapping(path = "/hello")
  public ResponseEntity<Map<String, String>> hello() {
    Map<String, String> map = new HashMap<>();
    map.put("hello", "world");
    return ResponseEntity.ok(map);
  }

}
