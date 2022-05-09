package com.example.garageapp.controller;

import com.example.garageapp.model.User;
import com.example.garageapp.service.IUserService;
import com.example.garageapp.service.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    //    @GetMapping("")
//    @GetMapping("hello")
//public String sayHello() {
    @GetMapping("/public")
    public String sayHelloPublic() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails ud = (UserDetails) auth.getPrincipal();

        return "Hello on public, " + ud.getUsername() + "...";
    }

    @GetMapping("/private")
    public String sayHelloPrivate() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails ud = (UserDetails) auth.getPrincipal();

        return "Hello on private, " + ud.getUsername() + "...";
    }

    @GetMapping("/users")
    public String sayHiUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails ud = (UserDetails) auth.getPrincipal();

        return "Hallo USER";
    }



}



//        return "Hello there";


//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        if (auth.getPrincipal() instanceof UserDetails) {
//            UserDetails ud = (UserDetails) auth.getPrincipal();
//            return "Hello " + ud.getUsername() + "!";
//        }
//        else {
//            return "Hello Stranger!";
//        }

//    }

//    @GetMapping("/secret")
//    public String topSecret() {
//        return "This is very secret ";
//    }

//}
