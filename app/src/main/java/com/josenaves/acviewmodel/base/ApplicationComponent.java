package com.josenaves.acviewmodel.base;

import com.josenaves.acviewmodel.details.DetailsFragment;
import com.josenaves.acviewmodel.home.ListFragment;
import com.josenaves.acviewmodel.networking.NetworkModule;
import com.josenaves.acviewmodel.viewmodel.ViewModelModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = { NetworkModule.class, ViewModelModule.class })
public interface ApplicationComponent {
    void inject(ListFragment listFragment);
    void inject(DetailsFragment detailsFragment);
}
