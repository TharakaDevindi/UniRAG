CREATE EXTENSION IF NOT EXISTS vector;
CREATE TABLE IF NOT EXISTS lecture_chunk (
 id SERIAL PRIMARY KEY,
 content TEXT,
 embedding vector(1536)
);
CREATE INDEX IF NOT EXISTS lecture_chunk_embedding_idx
ON lecture_chunk USING ivfflat (embedding vector_cosine_ops)
WITH (lists = 100);
