package com.shoppingonline.pojo;

import lombok.Data;

@Data
public class ProductType {
    private Integer id;//主键ID
    private String name;//分类名称
    private String description;//分类描述
    private String iconName;//分类图标
}
