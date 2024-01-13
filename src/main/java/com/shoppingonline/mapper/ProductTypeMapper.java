package com.shoppingonline.mapper;

import com.shoppingonline.pojo.ProductType;
import org.apache.ibatis.annotations.*;
import java.util.List;

/**
 * 操作商品分类相关数据接口
 */
@Mapper
public interface ProductTypeMapper {

    @Insert("insert into product_type(id,name,description,icon_name)" +
            " values(#{id},#{name},#{description},#{iconName})")
    void addProductType(ProductType productType);

    @Delete("delete from product_type where id=#{id}")
    void deleteById(Integer id);

    @Update("UPDATE product_type SET name = #{name},description = #{description},icon_name = #{iconName} where id = #{id}")
    void updateById(ProductType productType);

//    @Select("select id,name,description,icon_name from product_type where id=#{id}")
//    ProductType selectById(Integer id);

    @Select("select id,name,description,icon_name from product_type order by id desc")
    List<ProductType> selectAll();

}
