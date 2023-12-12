package com.example.demo.service.product;

import com.example.demo.dto.ProductDTO;
import com.example.demo.model.Product;
import com.google.api.gax.rpc.NotFoundException;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(String id) throws NotFoundException;
    Product add (ProductDTO productDto);
    Product update (Product product, MultipartFile fileImage);
    void delete(String id);

}
