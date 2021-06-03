package com.vaibhavmojidra.databindingwithobjectsviewmodeljava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.vaibhavmojidra.databindingwithobjectsviewmodeljava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MyViewModel myViewModel;
    private MyViewModelFactory myViewModelFactory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main);
        myViewModelFactory=new MyViewModelFactory("Your text will appear");
        myViewModel= new ViewModelProvider(this,myViewModelFactory).get(MyViewModel.class);
        myViewModel.text.observe(this, o -> {
            binding.resultText.setText(o.toString());
        });
        binding.setViewModel(myViewModel);
    }
}