package com.example.sample1app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Sample1appApplication {

  @RequestMapping("/")
  public String home() {
    // public void text(String body){
    //   System.out.println(body);
    // }
    return "いくぜぇー！燃え尽きろ！はぁああ！神龍烈波！";
  }

  public static void main(String[] args) {
    SpringApplication.run(Sample1appApplication.class, args);
  }
}
