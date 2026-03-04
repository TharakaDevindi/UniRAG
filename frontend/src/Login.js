import axios from "axios";
import { useState } from "react";
import { useNavigate } from "react-router-dom";

function Login() {
 const [username,setUsername]=useState("");
 const [password,setPassword]=useState("");
 const nav=useNavigate();

 const login = async () => {
  const res = await axios.post("http://localhost:8080/auth/login",{username,password});
  localStorage.setItem("token",res.data);
  nav("/chat");
 };

 return (
  <div>
   <h2>UniRAG Login</h2>
   <input placeholder="Username" onChange={e=>setUsername(e.target.value)} />
   <input type="password" placeholder="Password" onChange={e=>setPassword(e.target.value)} />
   <button onClick={login}>Login</button>
  </div>
 );
}
export default Login;
