package com.shoppingonline.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shoppingonline.mapper.ProductTypeMapper;
import com.shoppingonline.pojo.ProductType;
import com.shoppingonline.service.ProductTypeService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private ProductTypeMapper productTypeMapper;

    @Override
    public void addProductType(ProductType productType) {
        productTypeMapper.insert(productType);
    }

    @Override
    public void deleteProductTypeById(String id) {
        productTypeMapper.deleteById(id);
    }

    @Override
    public void updateProductType(ProductType productType) {
        productTypeMapper.updateById(productType);
    }

    @Override
    public List<ProductType> search(String name) {
        LambdaQueryWrapper<ProductType> lqw = new LambdaQueryWrapper<>();
        return productTypeMapper.selectList(lqw.like(ProductType::getName,name));
    }

    @Override
    public List<ProductType> selectAllProductType() {
        return productTypeMapper.selectList(null);
    }
}

