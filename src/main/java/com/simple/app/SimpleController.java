package com.simple.app;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

  @GetMapping("")
  public ResponseEntity hello() {
    return ResponseEntity.ok("Hello world");
  }
}
