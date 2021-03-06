package com.example.demo.web;


import com.example.demo.bean.Category;
import com.example.demo.dao.CategoryDAO;
import com.example.demo.mapper.CategoryMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/21.
 */
@Controller
public class HelloController {
    @Autowired
    CategoryDAO categoryDAO;
    @Autowired
    CategoryMapper categoryMapper;

    @RequestMapping("/hello")
    public String listCategory(Model m) throws Exception {
        List<Category> cs=categoryMapper.findAll();

        m.addAttribute("cs", cs);

        return "hello";
    }
}