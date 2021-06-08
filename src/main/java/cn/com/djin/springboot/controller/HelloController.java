package cn.com.djin.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 邵枫
 * @date 2021/6/8 17:56
 */
@Controller
@RequestMapping("/index")
public class HelloController {

    @RequestMapping("/")
    String home(){
        return "Hello World!";

    }
}
