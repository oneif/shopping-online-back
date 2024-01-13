package com.shoppingonline.service.impl;

import com.shoppingonline.mapper.ProductTypeMapper;
import com.shoppingonline.pojo.ProductType;
import com.shoppingonline.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private ProductTypeMapper productTypeMapper;

    @Override
    public void addProductType(ProductType productType) {
        productTypeMapper.addProductType(productType);
    }

    @Override
    public void deleteProductTypeById(Integer id) {
        productTypeMapper.deleteById(id);
    }

    @Override
    public void updateProductType(ProductType productType) {
        productTypeMapper.updateById(productType);
    }

//    @Override
//    public ProductType selectProductTypeById(Integer id) {
//        return productTypeMapper.selectById(id);
//    }

    @Override
    public List<ProductType> selectAllProductType() {
        return productTypeMapper.selectAll();
    }
}

