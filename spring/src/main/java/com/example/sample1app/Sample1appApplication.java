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
    return "Hello World";
  }

  // @RequestMapping("/men")
  // public String men() {
  //   UserEntity user = userRepository.findUserById(0);
  //   return String.format("ID=%d", user.getId());
  // }

  public static void main(String[] args) {
    SpringApplication.run(Sample1appApplication.class, args);
  }
}
