package com.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

  @GetMapping("/greeting")
  public String greetingButton() {
    return "greeting";
  }

  @RequestMapping(value = "/result")
  public String greetingMethod() {
    return "result";
  }

}