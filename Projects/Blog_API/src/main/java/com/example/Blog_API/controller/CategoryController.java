package com.example.Blog_API.controller;

import com.example.Blog_API.payloads.CategoryDTO;
import com.example.Blog_API.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    //create

    @PostMapping
    public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO categoryDTO){
        CategoryDTO addedCategory=categoryService.createCategory(categoryDTO);
        return new ResponseEntity<>(addedCategory, HttpStatus.CREATED);


    }


    //update

    @PutMapping("/{Id}")
    public ResponseEntity<CategoryDTO> updateCategory(@RequestBody CategoryDTO categoryDTO,@PathVariable Integer Id){
        CategoryDTO updateCategory=this.categoryService.updateCategory(categoryDTO,Id);
        return new ResponseEntity<CategoryDTO>(updateCategory,HttpStatus.OK);
    }

    //delete
    @DeleteMapping("/{Id}")
    public void deleteCategory(@PathVariable Integer Id){
       this.categoryService.deleteCategory(Id);
    }

    //get
    @GetMapping("/{Id}")
    public ResponseEntity<CategoryDTO> getCategory(@PathVariable Integer Id){
        CategoryDTO getCategory=this.categoryService.O,Id);
        return new ResponseEntity<CategoryDTO>(updateCategory,HttpStatus.OK);
    }

    //getAll
}
