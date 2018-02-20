package com.josenaves.acviewmodel.base;

import com.josenaves.acviewmodel.networking.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        NetworkModule.class
})
public interface ApplicationComponent {
}
