//package com.fen.controller;
//
//import com.fen.entity.User;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.web.bind.annotation.*;
//
//@Slf4j
//@RestController
//@RequestMapping()
//public class LoginController {
//    @Autowired
//    UserDetailsService userDetailsService;
//
//    @PostMapping("/login")
//    public String login(@RequestBody User user) {
//
//        String username = user.getUsername();
//        String password = user.getPassword();
//
//        log.info("username:{},password:{}", username, password);
//        log.info(String.valueOf("admin".equals(username)));
//
//        User loginUser = (User) userDetailsService.loadUserByUsername(username);
//        //判断用户是否存在
//        if (loginUser == null) {
//            return "用户名不存在";
//        }
//
//        //判断密码是否正确 loginuser对象中密码是密文
////        if(Md5Util.getMD5String(password).equals(loginUser.getPassword())){
////            //登录成功
////            return Result.success("jwt token 令牌..");
////
////        }
//        return "密码错误";
//
//    }
//}
