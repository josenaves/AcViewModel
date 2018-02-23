package com.josenaves.acviewmodel.networking;

import com.josenaves.acviewmodel.model.ModelAdapterFactory;
import com.squareup.moshi.Moshi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Module
public abstract class NetworkModule {

    private static final String BASE_URL = "https://api.github.com/";

    @Provides
    @Singleton
    static Moshi provideMoshi() {
        return new Moshi.Builder()
                .add(ModelAdapterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    static Retrofit provideRetrofit(Moshi moshi) {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .build();
    }

    @Provides
    @Singleton
    static RepoService provideRepoService(Retrofit retrofit) {
        return retrofit.create(RepoService.class);
    }
}
