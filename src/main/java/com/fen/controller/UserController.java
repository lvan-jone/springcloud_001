//package com.fen.controller;
//
//import com.fen.entity.User;
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.Parameter;
//import io.swagger.v3.oas.annotations.Parameters;
//import io.swagger.v3.oas.annotations.tags.Tag;
//import jakarta.servlet.http.HttpServletRequest;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@Tag(name = "控制类", description = "用户信息")
//@RestController
//@RequestMapping("/v1/user")
//public class UserController {
//    @Operation(summary = "欢迎页")
//    @GetMapping("/come")
//    @Parameter(name = "id", description = "主键id")
//    public String hello(String id) {
//        return "come.";
//    }
//
//    @Operation(summary = "查询用户信息")
//    @GetMapping
//    @Parameters(
//            value = {
//                    @io.swagger.v3.oas.annotations.Parameter(name = "id", description = "主键id"),
//                    @io.swagger.v3.oas.annotations.Parameter(name = "name", description = "用户名")
//            }
//    )
//    public String query(String id, String name, @RequestBody User user) {
//        return "hello";
//    }
//
//    @Operation(summary = "测试2")
//    @GetMapping("/come2")
//    public String hello2(String id) {
//        return "hello";
//    }
//
//    //    @ApiIgnore("忽略测试")
//    @Operation(summary = "测试1")
//    @GetMapping("/come10")
//    public String hello10(HttpServletRequest request) {
//        return "hello";
//    }
//
//
//}
