package com.shoppingonline.service;

import com.shoppingonline.pojo.ProductType;

import java.util.List;

public interface ProductTypeService {

    void addProductType(ProductType productType);

    void deleteProductTypeById(Integer id);

    void updateProductType(ProductType productType);

//    ProductType selectProductTypeById(Integer id);

    List<ProductType> selectAllProductType();
}
