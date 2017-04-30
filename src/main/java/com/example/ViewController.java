package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by Emina on 4/2/2017.
 */

@Controller
public class ViewController {

    @RequestMapping("/")
    public String index(Model model){
       model.addAttribute("datetime",new Date()) ;
       model.addAttribute("mode", "development");
        return "index";
    }
}
