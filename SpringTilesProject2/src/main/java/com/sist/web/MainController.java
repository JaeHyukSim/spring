package com.sist.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
  @RequestMapping("main.do")
  public String main_page()
  {
	  
	  return "main";
  }
}
