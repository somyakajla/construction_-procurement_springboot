package com.example.constructionPrecurment_backend.controllers;

import com.example.constructionPrecurment_backend.models.AuthenticationRequest;
import com.example.constructionPrecurment_backend.models.AuthenticationResponse;
import com.example.constructionPrecurment_backend.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
User routes
router.post('/register', ctrlUser.register);
router.post('/login', ctrlUser.login);
router.get('/userProfile', jwtHelper.verifyJwtToken, ctrlUser.userProfile);
router.get('/users', ctrlUser.users);
 */

@RestController
public class UserController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;


    @GetMapping("/hello")
    public String hello() {

        return "Hello World, seen?";
    }
    /*
    As we have spring security in this application which would not allow it call before checking
    So we need to override a method in security configurer class to call this method authenicating it

     */
    @PostMapping(value = "/authenticate")
    public ResponseEntity<?> createAuthenticateToken(@RequestBody AuthenticationRequest authenticateRequest) throws Exception {
        // authenticate manager will authenticate the user from rved credentials
        // System.out.println("hello");
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticateRequest.getUserName(), authenticateRequest.getPassword()));

        } catch(BadCredentialsException e) {
            throw new Exception("incorrect user name or password", e);
        }

        // load user by user name
        final UserDetails userDetail = userDetailsService.loadUserByUsername(authenticateRequest.getUserName());

        // generate token from user detail object
        final String jwt = jwtUtil.generateToken(userDetail);

        // send response back with jwt token
        return ResponseEntity.ok(new AuthenticationResponse(jwt));

    }


}
