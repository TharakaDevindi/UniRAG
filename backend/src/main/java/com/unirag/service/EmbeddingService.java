package com.unirag.service;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.embedding.EmbeddingClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmbeddingService {
 private final EmbeddingClient embeddingClient;
 public float[] embed(String text) {
  return embeddingClient.embed(text);
 }
}
