package com.example.demo.service.product;

import com.example.demo.dto.ProductDTO;
import com.example.demo.model.Product;
import com.example.demo.repository.IProductRepo;
import com.google.api.gax.rpc.NotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class ProductService implements IProductService {
    private IProductRepo productRepo;
    private UploadService uploadService;

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public Product findById(String id) throws NotFoundException {
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public Product add(ProductDTO productDto) {
        String url = null;
        if (!productDto
                .getFileImage()
                .isEmpty()) {
            url = uploadService.uploadFile(productDto.getFileImage());
        }
        return productRepo.save(new Product(productDto, url));
    }

    @Override
    public Product update(Product product, MultipartFile fileImage) {
        String imageUrl = productRepo.findById(product
                        .getId())
                .get()
                .getImage();
        if (!fileImage.isEmpty()) {
            imageUrl = uploadService.uploadFile(fileImage);
        }
        product.setImage(imageUrl);
        return productRepo.save(product);
    }

    @Override
    public void delete(String id) {
        productRepo.deleteById(id);
    }


}
