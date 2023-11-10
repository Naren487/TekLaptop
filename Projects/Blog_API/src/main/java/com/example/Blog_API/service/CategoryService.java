package com.example.Blog_API.service;

import com.example.Blog_API.payloads.CategoryDTO;

import java.util.List;

public interface CategoryService {

    //create


    CategoryDTO createCategory(CategoryDTO categoryDto);
    //update
    CategoryDTO updateCategory(CategoryDTO categoryDto,Integer Id);
    //delete
    void deleteCategory(Integer Id);
    //get
    CategoryDTO getCategory(Integer Id);
    //getAll

    List<CategoryDTO> getAllCategory();
}
