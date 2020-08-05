package com.example.constructionPrecurment_backend.service.user;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/*
Spring has in built user details service which is being used by spring security to load the user
there is a methods to load the user
which we need to override in here.
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

    /*
    Override the method from UserDetailsService
    which loads the user by userName

     */
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        return new User("foo", "foo", new ArrayList<>()); // I have added username and password statically
        /*
        you can get this user from database or wherever you have user stored.
         */
    }



}
