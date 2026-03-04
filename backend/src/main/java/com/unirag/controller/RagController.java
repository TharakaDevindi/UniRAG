package com.unirag.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.unirag.service.RagService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class RagController {

 private final RagService ragService;

 @PostMapping("/ask")
 public String ask(@RequestBody String question) {
  return ragService.ask(question);
 }
}
