package com.example.simpleWebApp.ServicePackage;

import com.example.simpleWebApp.model.Products;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class ProductService {
    List<Products> list = new ArrayList<>(Arrays.asList(new Products(101,"iphone",50000),
            new Products(102,"laptop",90000),
            new Products(102,"camera",70000)));
    public List<Products> getProducts(){
       return list;
    }

    public Products getProductById(int id){
        return list.stream().filter(p->p.getProdId()==id).findFirst().get();
    }

    public void addProduct(Products prod){
        list.add(prod);
    }

    public void updateProduct(Products prod){
       int index=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getProdId()==prod.getProdId()){
                index=i;
            }
        }
        list.set(index,prod);
    }


    public void delete(int id){
        int index=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getProdId()==id){
                index=i;
            }
        }
        list.remove(index);

    }




}
