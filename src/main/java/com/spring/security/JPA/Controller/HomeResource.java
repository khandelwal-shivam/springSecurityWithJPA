package com.spring.security.JPA.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController()
//@RequestMapping()
public class HomeResource {

    @GetMapping("/")
    public ResponseEntity<String> Home() {
        try {
            return new ResponseEntity<String>("Home", HttpStatus.OK);
        }
        catch(Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Home Service Exception");
        }
    }

    @GetMapping("/user")
    public ResponseEntity<String> User() {
        try {
            return new ResponseEntity<>("User",HttpStatus.OK);
        } catch(Exception e) {
            throw  new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"User Service Exception");
        }
    }

    @GetMapping("/admin")
    public ResponseEntity<String> Admin() {
        try{
            return new ResponseEntity<String>("Admin",HttpStatus.OK);
        }catch(Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Admin Service Exception");
        }
    }
}
