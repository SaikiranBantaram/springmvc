package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springmvc.service.UserService;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private UserService userService;
   public String test(){
       String message ="hello";
       return message;
   }
}
