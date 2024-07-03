//package com.example.JWT.Service;
//
//import com.example.JWT.Entity.User;
//import com.example.JWT.Reopsitory.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserDeatilsService implements UserDetailsService {
//    @Autowired
//    UserRepository userRepository;
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        userRepository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("Username not found: " + username));
//        return user;
//    }
//}
