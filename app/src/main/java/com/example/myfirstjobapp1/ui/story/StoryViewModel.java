package com.example.myfirstjobapp1.ui.story;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StoryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public StoryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Story");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
