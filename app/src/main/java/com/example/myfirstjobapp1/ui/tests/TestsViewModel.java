package com.example.myfirstjobapp1.ui.tests;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TestsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TestsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Tests");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
