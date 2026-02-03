package com.example.simpleWebApp.Controller;

import com.example.simpleWebApp.ServicePackage.ProductService;
import com.example.simpleWebApp.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Products> getProducts(){
        return service.getProducts();
    }

     @GetMapping("/products/{prodId}")
    public Products getProductById(@PathVariable int prodId){
         return service.getProductById(prodId);
    }

  @PostMapping("/products")
    public void addProdut(@RequestBody Products prod){
        service.addProduct(prod);
    }









}
