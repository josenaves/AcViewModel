package com.josenaves.acviewmodel.home;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.josenaves.acviewmodel.model.Repo;

public class SelectedRepoViewModel extends ViewModel {
    private final MutableLiveData<Repo> selectedRepo = new MutableLiveData<>();

    public LiveData<Repo> getSelectedRepo() {
        return selectedRepo;
    }

    void setSeletedRepo(Repo repo) {
        selectedRepo.setValue(repo);
    }
}
