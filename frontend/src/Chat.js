import axios from "axios";
import { useState } from "react";

function Chat() {
 const [question,setQuestion]=useState("");
 const [answer,setAnswer]=useState("");

 const ask = async () => {
  const res = await axios.post("http://localhost:8080/api/ask",question,{
   headers:{ Authorization:"Bearer "+localStorage.getItem("token") }
  });
  setAnswer(res.data);
 };

 return (
  <div>
   <h2>UniRAG Assistant</h2>
   <textarea onChange={e=>setQuestion(e.target.value)} />
   <button onClick={ask}>Ask</button>
   <p>{answer}</p>
  </div>
 );
}
export default Chat;
