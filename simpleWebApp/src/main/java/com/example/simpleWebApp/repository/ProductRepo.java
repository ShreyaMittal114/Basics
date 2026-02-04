package com.example.simpleWebApp.repository;

import com.example.simpleWebApp.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository <Products, Integer>{   //class name, primary key type

}
