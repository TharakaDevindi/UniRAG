package com.unirag.service;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.ChatClient;
import org.springframework.stereotype.Service;
import com.unirag.repository.LectureChunkRepository;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RagService {

 private final EmbeddingService embeddingService;
 private final LectureChunkRepository repository;
 private final ChatClient chatClient;

 public String ask(String question) {

  var vector = embeddingService.embed(question);
  var chunks = repository.findTopMatches(vector);

  String context = chunks.stream()
   .map(c -> c.getContent())
   .collect(Collectors.joining("\n"));

  String prompt = "Answer ONLY using the context below. If not found say Not in material.\n\n"
   + context + "\n\nQuestion: " + question;

  return chatClient.call(prompt);
 }
}
