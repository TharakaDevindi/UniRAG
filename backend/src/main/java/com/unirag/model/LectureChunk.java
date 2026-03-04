package com.unirag.model;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
public class LectureChunk {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 @Column(columnDefinition = "TEXT")
 private String content;
 @Column(columnDefinition = "vector(1536)")
 private float[] embedding;
}
