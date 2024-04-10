package com.Product.ProductServiceApplication.Service;

import com.Product.ProductServiceApplication.Entity.Product;


import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product addProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(Long id);


}