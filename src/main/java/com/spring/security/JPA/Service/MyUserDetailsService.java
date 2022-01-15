package com.spring.security.JPA.Service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.spring.security.JPA.Models.MyUserDetails;
import com.spring.security.JPA.Models.User;
import com.spring.security.JPA.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    //This class is auto wired in SecurityConfig.java
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return new MyUserDetails(username);
        System.out.println("Username = "+username);
        Optional<User> user =  userRepository.findByUsername(username);

        System.out.println("User = "+user);

        user.orElseThrow(()->new UsernameNotFoundException("No Username found with name: "+username));
        return user.map(MyUserDetails::new).get();

    }

}
