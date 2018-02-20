package com.josenaves.acviewmodel.base;

import android.app.Application;
import android.content.Context;

public class ACViewModelApplication extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.create();
    }

    public static ApplicationComponent getApplicationComponent(Context context) {
        return ((ACViewModelApplication) context.getApplicationContext()).component;
    }
}
