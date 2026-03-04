# 🎓 UniRAG – Secure AI-Powered University Lecture Assistant Using Retrieval-Augmented Generation

![Backend](https://img.shields.io/badge/Backend-SpringBoot-green)
![Frontend](https://img.shields.io/badge/Frontend-React-blue)
![Database](https://img.shields.io/badge/Database-PostgreSQL-blue)
![VectorSearch](https://img.shields.io/badge/VectorSearch-pgvector-purple)
![Authentication](https://img.shields.io/badge/Auth-JWT-red)
![Architecture](https://img.shields.io/badge/Architecture-RAG-orange)
![Deployment](https://img.shields.io/badge/Deployment-Docker-brightgreen)
![AI Powered](https://img.shields.io/badge/AI-Powered-critical)
![RAG System](https://img.shields.io/badge/RAG-Enabled-success)
![Secure System](https://img.shields.io/badge/Security-Enterprise--Grade-blue)

---

## 📄 Abstract

**UniRAG** is a secure AI-powered university learning assistant that implements **Retrieval-Augmented Generation (RAG)** to provide accurate, context-aware answers strictly from institutional lecture materials.

Unlike generic AI systems that generate answers from pretrained knowledge, UniRAG retrieves relevant lecture content using vector similarity search and then generates grounded responses based only on retrieved academic material. This significantly reduces hallucination and improves academic trustworthiness.

The system integrates semantic search, JWT-based authentication, role-based access control, and vector database storage using PostgreSQL with pgvector.

---

## 🏗️ System Architecture
Student / Admin
↓
React Frontend
↓
Spring Boot REST API (JWT Secured)
↓
PostgreSQL + pgvector (Vector Search)
↓
OpenAI Embeddings + Chat Model
↓
Grounded Academic Response

---

## 🔄 System Workflow

### 🔹 Phase 1 – Admin Document Processing

1. Admin logs in securely (JWT authentication).
2. Lecture PDF is uploaded.
3. System extracts and cleans text.
4. Text is divided into semantic chunks.
5. Each chunk is converted into embeddings.
6. Embeddings are stored in PostgreSQL using pgvector.

---

### 🔹 Phase 2 – Student Query Processing

1. Student logs in securely.
2. Student submits a question.
3. Question is converted into an embedding.
4. pgvector performs cosine similarity search.
5. Top-k relevant lecture chunks are retrieved.
6. Retrieved context is injected into AI prompt.
7. AI generates grounded answer.
8. Answer and source references are returned.

---

## 🧠 Retrieval Mathematics

Cosine Similarity Formula:

Similarity(Q, D) = (Q · D) / (||Q|| × ||D||)

Where:
- Q = Query embedding  
- D = Document chunk embedding  

Top matching vectors are selected for context grounding.

---

## 🔐 Security Model

- JWT-based stateless authentication  
- Role-Based Access Control (Admin / Student)  
- Protected REST endpoints  
- Secure token validation  
- Backend request authorization  

### 👤 Roles

**Admin**
- Upload and manage lecture materials
- Control academic data

**Student**
- Submit academic queries
- View AI-generated responses with source transparency

---

## 🛠️ Technology Stack

### Backend
- Spring Boot
- Spring Security
- JWT Authentication
- PostgreSQL
- pgvector
- OpenAI API

### Frontend
- React
- Axios
- React Router

### Deployment
- Docker compatible
- AWS EC2 deployable
- AWS RDS compatible

---

## 📡 API Endpoints

### 🔐 Authentication

POST /api/auth/register  
POST /api/auth/login  

---

### 📚 Admin

POST /api/lectures/upload  

Headers:
Authorization: Bearer <JWT>

---

### ❓ Student

POST /api/query/ask  

Request:
{
  "question": "Explain database normalization."
}

Response:
{
  "answer": "Database normalization is...",
  "sources": ["Lecture 3 - Database Design.pdf"]
}

---

## 🗄️ Database Schema

### Users Table

- id (UUID)
- username (VARCHAR)
- password (VARCHAR)
- role (VARCHAR)

### LectureChunks Table

- id (UUID)
- lecture_name (VARCHAR)
- chunk_text (TEXT)
- embedding (VECTOR)

---

## 🎯 Project Objectives

- Provide lecture-grounded AI answers
- Reduce hallucination in academic AI usage
- Improve learning efficiency
- Demonstrate secure RAG implementation
- Showcase vector database integration

---

## 📈 Key Benefits

- Context-aware responses
- Transparent source references
- Secure system access
- Scalable architecture
- Research-ready AI implementation

---

## 🔮 Future Enhancements

- Hybrid search (BM25 + vector fusion)
- Multi-document summarization
- Cross-language retrieval
- Fine-tuned embedding models
- Institutional AI deployment framework

---

## 👩‍💻 Author

Tharaka Devindi  
BSc (Hons) Computer Science – Software Engineering  


---
