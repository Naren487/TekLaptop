package com.example.Blog_API.service.impl;

import com.example.Blog_API.entity.Category;
import com.example.Blog_API.exceptions.ResouceNotFoundException;
import com.example.Blog_API.payloads.CategoryDTO;
import com.example.Blog_API.repository.CategoryRepo;
import com.example.Blog_API.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDto) {
        Category newCategory=this.modelMapper.map(categoryDto, Category.class);
        Category addedCategory=this.categoryRepo.save(newCategory);
        return this.modelMapper.map(addedCategory,CategoryDTO.class);
    }

    @Override
    public CategoryDTO updateCategory(CategoryDTO categoryDto, Integer Id) {

        Category newCategory=this.categoryRepo.findById(Id).orElseThrow(()-> new ResouceNotFoundException("Category","Category Id",Id));


        newCategory.setCategoryTitle(categoryDto.getCategoryTitle());
        newCategory.setCategoryDescription(categoryDto.getCategoryDescription());

        Category updatedCategory=this.categoryRepo.save(newCategory);
        return this.modelMapper.map(updatedCategory,CategoryDTO.class);
    }

    @Override
    public void deleteCategory(Integer Id) {

        Category cat=this.categoryRepo.findById(Id).orElseThrow(()-> new ResouceNotFoundException("Category","Category Id",Id));
        this.categoryRepo.delete(cat);

    }

    @Override
    public CategoryDTO getCategory(Integer Id) {
        Category cat=this.categoryRepo.findById(Id).orElseThrow(()-> new ResouceNotFoundException("Category","Category Id",Id));

        return this.modelMapper.map(cat,CategoryDTO.class);
    }

    @Override
    public List<CategoryDTO> getAllCategory() {
        List<Category> allCategories=this.categoryRepo.findAll();
        return allCategories.stream().map((cat)-> this.modelMapper.map(cat,CategoryDTO.class)).collect(Collectors.toList());
    }
}
