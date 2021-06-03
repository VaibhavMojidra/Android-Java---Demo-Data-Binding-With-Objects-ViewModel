package com.vaibhavmojidra.databindingwithobjectsviewmodeljava;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import org.jetbrains.annotations.NotNull;

public class MyViewModelFactory implements ViewModelProvider.Factory {
    private String startingValue;

    public MyViewModelFactory(String startingValue) {
        this.startingValue = startingValue;
    }

    @NonNull
    @NotNull
    @Override
    public <T extends ViewModel> T create(@NonNull @NotNull Class<T> modelClass) {
        return (T)new MyViewModel(startingValue);
    }
}
