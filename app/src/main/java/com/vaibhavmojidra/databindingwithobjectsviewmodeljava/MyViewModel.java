package com.vaibhavmojidra.databindingwithobjectsviewmodeljava;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    MutableLiveData text=new MutableLiveData<String>("");

    public MyViewModel(String text) {
        this.text.setValue(text);
    }

    public void updateValue(CharSequence s, int start, int before, int count){
        this.text.setValue(s);
    }
}
