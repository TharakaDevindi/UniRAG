package com.unirag.repository;
import com.unirag.model.LectureChunk;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface LectureChunkRepository extends JpaRepository<LectureChunk, Long> {

 @Query(value = "SELECT * FROM lecture_chunk ORDER BY embedding <-> CAST(:embedding AS vector) LIMIT 3",
        nativeQuery = true)
 List<LectureChunk> findTopMatches(@Param("embedding") float[] embedding);
}
