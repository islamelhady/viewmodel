package com.example.el_hady.viewmodel.viewModels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.example.el_hady.viewmodel.models.Note;
import com.example.el_hady.viewmodel.repository.NoteRepository;

import java.util.List;


public class WordViewModel extends AndroidViewModel {

    private NoteRepository repository;

    private LiveData<List<Note>> allWords;

    public WordViewModel (Application application) {
        super(application);

        repository = new NoteRepository(application);
        allWords = repository.getAllWords();
    }

    public LiveData<List<Note>> getAllWords() {
        return allWords;
    }

    public void insert(Note word) {
        repository.insert(word);
    }

}
