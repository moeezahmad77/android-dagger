package com.example.java_application.view_model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.java_application.dagger_mvvm.models.Product;
import com.example.java_application.dagger_mvvm.repository.ProductRepo;

import java.util.List;

public class MainActivity2ViewModel extends ViewModel {
    private ProductRepo productRepo;
    public LiveData<List<Product>> products;
    public MainActivity2ViewModel(ProductRepo productRepo) {
        this.productRepo = productRepo;
        this.products = productRepo.products;
    }
    public void getProducts() {
        productRepo.getProducts();
    }
}