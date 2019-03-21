package com.example.demo.mapper;

import com.example.demo.bean.Category;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/21.
 */
@Mapper
public interface CategoryMapper {
    @Select("select * from category_ where id > 1")
    List<Category> findAll();
}
