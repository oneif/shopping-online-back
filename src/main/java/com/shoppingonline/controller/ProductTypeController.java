package com.shoppingonline.controller;
import com.shoppingonline.pojo.ProductType;
import com.shoppingonline.pojo.Result;
import com.shoppingonline.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    @PostMapping("/type")
    public Result addProductType(@RequestParam("action") String action, ProductType productType) {
        switch (action){
            case "add":
                System.out.println("tianjia");

                break;
            case "delete":
                System.out.println("shanchu");
                break;
            case "update":
                System.out.println("gengxin");
                break;
            case  "selectAll":
                System.out.println("chaquanbu");
                break;
        }
        System.out.println(productType);
//        productTypeService.addProductType(productType);
        return Result.success("添加成功");
    }
}

//    @PostMapping("/login")
//    public Result<String> login(@Pattern(regexp = "^\\S{4,16}$") String username, @Pattern(regexp = "^\\S{4,16}$") String password) {
//        // 查询用户名
//        User loginUser = userService.findByUserName(username);
//        // 判断用户是否存在
//        if (loginUser == null) return Result.error("用户名错误");
//        // 判断密码是否正确
//        if (Md5Util.getMD5String(password).equals(loginUser.getPassword())) {
//            Map<String, Object> claims = new HashMap<>();
//            claims.put("id", loginUser.getId());
//            claims.put("username", loginUser.getUsername());
//            String token = JwtUtil.getToken(claims);
//
//            return Result.success("登录成功", token);
//        }
//        return Result.error("密码错误");
//    }

