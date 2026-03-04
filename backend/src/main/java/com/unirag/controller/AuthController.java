package com.unirag.controller;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.unirag.security.JwtUtil;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

 private final JwtUtil jwtUtil;

 @PostMapping("/login")
 public String login(@RequestBody AuthRequest req){
  if(req.username.equals("admin")){
   return jwtUtil.generateToken(req.username,"ADMIN");
  }
  return jwtUtil.generateToken(req.username,"USER");
 }
}

@Data
class AuthRequest{
 public String username;
 public String password;
}
