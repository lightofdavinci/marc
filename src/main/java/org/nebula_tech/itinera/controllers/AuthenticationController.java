//package org.nebula_tech.itinera.controllers;
//
//import jakarta.validation.Valid;
//import org.nebula_tech.itinera.data.LoginFormDTO;
//import org.springframework.http.ResponseEntity;
//import org.springframework.ui.Model;
//import jakarta.servlet.http.HttpSession;
//import org.nebula_tech.itinera.data.RegisterFormDTO;
//import org.nebula_tech.itinera.data.UserRepository;
//import org.nebula_tech.itinera.models.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import java.util.Optional;
//
//@Controller
//public class AuthenticationController {
//
//    @Autowired
//    UserRepository userRepository;
//
//    private static final String userSessionKey = "user";
//
//    public User getUserFromSession(HttpSession session) {
//        Integer userId = (Integer) session.getAttribute(userSessionKey);
//        if (userId == null) {
//            return null;
//        }
//
//        Optional<User> user = userRepository.findById(userId);
//
//        if (user.isEmpty()) {
//            return null;
//        }
//
//        return user.get();
//    }
//
//    private static void setUserInSession(HttpSession session, User user) {
//        session.setAttribute(userSessionKey, user.getId());
//    }
//
//    @GetMapping("/register")
//    public String displayRegistrationForm(Model model) {
//        model.addAttribute(new RegisterFormDTO());
//        model.addAttribute("title", "Register");
//        return "register";
//    }
//
//    @PostMapping("/register")
//    public ResponseEntity<?> processRegistrationForm(@RequestBody @Valid RegisterFormDTO registerFormDTO, HttpSession session) {
//        // Validate that the two passwords match
//        if (!registerFormDTO.getPassword().equals(registerFormDTO.getVerifyPassword())) {
//            return ResponseEntity.badRequest().body("Passwords do not match");
//        }
//
//        // Check if the username already exists
//        Optional<User> existingUser = userRepository.findByUsername(registerFormDTO.getUsername());
//        if (existingUser.isPresent()) {
//            return ResponseEntity.badRequest().body("Username already exists");
//        }
//
//        // Create and save the new user
//        User newUser = new User(registerFormDTO.getUsername(), registerFormDTO.getPassword());
//        userRepository.save(newUser);
//
//        // Set user in session
//        setUserInSession(session, newUser);
//
//        // Return success response
//        return ResponseEntity.ok("User registered successfully");
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<?> processLoginForm(@RequestBody @Valid LoginFormDTO loginFormDTO, HttpSession session) {
//        // Find user by username
//        Optional<User> userOptional = userRepository.findByUsername(loginFormDTO.getUsername());
//        if (userOptional.isEmpty()) {
//            return ResponseEntity.badRequest().body("Invalid username or password");
//        }
//
//        User user = userOptional.get();
//
//        // Validate password
//        if (!user.isMatchingPassword(loginFormDTO.getPassword())) {
//            return ResponseEntity.badRequest().body("Invalid username or password");
//        }
//
//        // Set user in session
//        setUserInSession(session, user);
//
//        // Return success response
//        return ResponseEntity.ok("User logged in successfully");
//    }
//}
