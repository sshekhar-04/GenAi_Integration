package com.ai.testing.controller;


import org.springframework.ai.chat.client.ChatClient;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/genai")
@CrossOrigin("*")
public class genAi {


    private final ChatClient chatClient;

    // The constructor must match the injection
    public genAi(ChatClient chatClient) {
        this.chatClient = chatClient;
    }



    @GetMapping("/{message}")
    public ResponseEntity<String> genai(@PathVariable String message){

        String response =chatClient.prompt().user(message).call().content();

        return ResponseEntity.ok(response);
    }
}
