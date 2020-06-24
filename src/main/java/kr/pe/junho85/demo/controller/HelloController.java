package kr.pe.junho85.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/test")
public class HelloController {
    @GetMapping("/hello")
    public Mono<String> hello(String name) {
        return Mono.just("안녕하세요. " + name + "님!");
    }

}
