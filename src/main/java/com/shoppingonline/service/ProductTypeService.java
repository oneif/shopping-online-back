package com.shoppingonline.service;

import com.shoppingonline.pojo.ProductType;

import java.util.List;

public interface ProductTypeService {

    void addProductType(ProductType productType);

    void deleteProductTypeById(String id);

    void updateProductType(ProductType productType);

    List<ProductType> search(String name);

    List<ProductType> selectAllProductType();
}
