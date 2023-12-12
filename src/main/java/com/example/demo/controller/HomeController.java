package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.repository.IProductRepo;
import com.example.demo.service.product.IProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    private  IProductService productService;
    private IProductRepo productRepo;

    @RequestMapping("/")
    public String home(){
        return "views/home";
    }
    @GetMapping("/product")
    public List<Product> goProduct(){

    }
}
