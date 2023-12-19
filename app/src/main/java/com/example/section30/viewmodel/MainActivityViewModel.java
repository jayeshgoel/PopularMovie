package com.example.section30.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.section30.model.Movie;
import com.example.section30.model.MovieRepository;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    // view model : suitable for non-Android-specific logic
    // AndroidViewModel : used when view Model class
    //                      needs to access Android-specific components

    private MovieRepository repository;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        this.repository = new MovieRepository(application);
    }



    // Live data
    public LiveData<List<Movie>> getAllMovies(){
        return repository.getMutableLiveData();
    }
}
