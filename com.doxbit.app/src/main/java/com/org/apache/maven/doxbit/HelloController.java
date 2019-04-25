package com.org.apache.maven.doxbit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * author: Crunchify.com
 *
 */

@Controller
public class HelloController {

    @RequestMapping("/welcome")
    public ModelAndView helloWorld() {

        String message = "<br><div style='text-align:center;'>"
                + "<h3>********** Hello Controller, Spring MVC Tutorial</h3>This message is coming from Controller **********</div><br><br>";
        return new ModelAndView("welcome", "message", message);
    }
}


//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class HelloController {
//
//    @GetMapping("/hello")
//    public String hello(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "hello";
//    }
//
//}