package com.example.buybag.services;

import com.example.buybag.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;
    {
        products.add(new Product(++ID, "MICHAEL KORS bag", "Medium Saffiano Leather Satchel", 358, "New-York", "Michael Kors"));
        products.add(new Product(++ID,"MICHAEL KORS bag", "Mila Small Metallic Leather Shoulder Bag", 258, "New-York", "Michael Kors"));
    }
    public List<Product> list() {
        return products;
    }
    public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);
    }
    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId().equals(id));

    }

    public List<Product> listProducts() {
        return products;
    }
}
