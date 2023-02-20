package com.example.java_application.ViewModelFactory;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;

import com.example.java_application.dagger_mvvm.repository.ProductRepo;
import com.example.java_application.view_model.MainActivity2ViewModel;

import javax.inject.Inject;

public class MainActivity2ViewModelFactory implements ViewModelProvider.Factory {
    private ProductRepo productRepo;

    @Inject
    public MainActivity2ViewModelFactory(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new MainActivity2ViewModel(productRepo);
    }
}
