package cn.com.djin.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot的第一个案例
 */

@RestController //实例化
@EnableAutoConfiguration //手动读取配置
public class Example {

    @RequestMapping("/")
    String home(){
        return "Hello World!";
    }

    /**
     * 项目的启动类
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Example.class,args);
    }
}
