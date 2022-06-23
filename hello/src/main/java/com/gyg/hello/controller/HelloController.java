package com.gyg.hello.controller;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by gyg
 * @date 2022/6/21 13:07
 * @description
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

  @GetMapping
  public String hello(){
    try {
      return "hello "+ Inet4Address.getLocalHost();
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
    return "hello";
  }

}
