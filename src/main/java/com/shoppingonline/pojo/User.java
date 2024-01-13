package com.shoppingonline.pojo;


import lombok.Data;

import java.time.LocalDateTime;

@Data
// lombok 在编译阶段 为实体类自动添加getter setter toString方法
// pom 文件中引入依赖 在实体类上添加注解
public class User {
    private Integer id;//主键ID
    private String username;//用户名
    private String password;//密码
    private String nickname;//昵称
    private String email;//邮箱
    private String userPic;//用户头像地址
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//更新时间
}
