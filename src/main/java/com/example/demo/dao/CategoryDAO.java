package com.example.demo.dao;


import com.example.demo.bean.Category;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yangxiong on 2019/3/21.
 */
public interface CategoryDAO extends JpaRepository<Category,Integer> {

}