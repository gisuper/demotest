package com.example.demo.web;

import com.alibaba.fastjson.JSONArray;
import com.example.demo.bean.Category;
import com.example.demo.mapper.CategoryMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/21.
 */

@RestController
public class StringController {
    @Autowired
    CategoryMapper categoryMapper;
    @RequestMapping("/str")
    public String hello() {
        List<Category> categoryList = categoryMapper.findAll( );
        Object json = JSONArray.toJSON(categoryList);
        System.out.println(json );
        return json.toString()+json+json;
    }
}
