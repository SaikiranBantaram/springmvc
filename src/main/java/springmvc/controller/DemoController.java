package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springmvc.service.DemoService;
import springmvc.service.UserService;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;
    @GetMapping
   public String test(){
       String message ="hello";
       System.out.println("demo controller");
       System.out.println("service data");
       return message;
   }
}
