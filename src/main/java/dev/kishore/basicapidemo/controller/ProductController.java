package dev.kishore.basicapidemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    //HTTP Methods
    @GetMapping("/products")
    public String GetAllProduct(){
        return "Display All the products";
    }

    @GetMapping("/products/{id}")
    public String GetProductById(@PathVariable("id") int id){
        return "Display Product by ID: " + id;
    }
    @PostMapping("/products")
    public String AddNewProduct(){
        return "New product Added";
    }
    @PutMapping("/products/{id}")
    public String updateProductById(@PathVariable("id") int id){
        return "Product id : " +id+" Updated successfully";
    }

    @PatchMapping("/products/{id}")
    public String patchProductById(@PathVariable("id") int id){
        return "Product id : " +id+" partially Updated successfully";
    }
    @DeleteMapping("/products/{id}")
    public String deleteProductById(@PathVariable("id") int id){
        return "Product id: " +id+" Deleted successfully";
    }


}
