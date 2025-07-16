package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class service {

    @Autowired
    private WebClient.Builder webclientbuilder;


    public String getUsersfromapi(){
        String apiUrl= "https://jsonplaceholder.typicode.com/users";

        Mono<String> response = webclientbuilder.build()
                .get()
                .uri(apiUrl)
                .retrieve()
                .bodyToMono(String.class);

        return response.block();
    }
}
