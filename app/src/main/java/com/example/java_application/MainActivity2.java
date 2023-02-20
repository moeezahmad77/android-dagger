package com.example.java_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import com.example.java_application.ViewModelFactory.MainActivity2ViewModelFactory;
import com.example.java_application.dagger_mvvm.models.Product;
import com.example.java_application.view_model.MainActivity2ViewModel;
import com.google.gson.Gson;

import java.util.List;

import javax.inject.Inject;

public class MainActivity2 extends AppCompatActivity {
    private String TAG = "MAIN_AC2";
    MainActivity2ViewModel mainActivity2ViewModel;

    @Inject
    MainActivity2ViewModelFactory mainActivity2ViewModelFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ((MainApplication) getApplication()).appComponent.inject(this);
        mainActivity2ViewModel = new ViewModelProvider(this, mainActivity2ViewModelFactory).get(MainActivity2ViewModel.class);
        subscriber();
        mainActivity2ViewModel.getProducts();
    }

    private void subscriber() {
        mainActivity2ViewModel.products.observe(this, new Observer<List<Product>>() {
            @Override
            public void onChanged(List<Product> products) {
                Log.d(TAG, new Gson().toJson(products));
                Log.d(TAG, "");
            }
        });
    }
}