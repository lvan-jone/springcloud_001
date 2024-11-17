//package com.fen.entity;
//
////import io.swagger.annotations.ApiModel;
////import io.swagger.annotations.ApiModelProperty;
//
//import io.swagger.v3.oas.annotations.media.Schema;
//import io.swagger.v3.oas.annotations.tags.Tag;
////import jakarta.persistence.*;
//import lombok.Data;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//
//@Schema(name = "UserModel", description = "用户模型")
//@Data
////@Entity
////@Table(name = "user", schema = "public")
//public class User implements UserDetails {
//
//    @Schema(description = "主键id", required = true, example = "1", hidden = true,
//            allowableValues = "1,2,3")
////    @Id
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String username;
//    private String password;
//    private boolean enabled;
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return enabled;
//    }
//}
