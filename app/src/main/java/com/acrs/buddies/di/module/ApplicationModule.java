package com.acrs.buddies.di.module;

import android.app.Application;
import android.content.Context;

import com.acrs.buddies.App;
import com.acrs.buddies.di.ApplicationContext;

import dagger.Module;
import dagger.Provides;


@Module
public class ApplicationModule {

    private final App mAp;

    public ApplicationModule(App application) {
        this.mAp = application;
    }

    @Provides
    @ApplicationContext
    public Context provideApplicationcontext() {
        return mAp;
    }

    @Provides
    Application provideApplication() {

        return mAp;
    }
    /*@Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {

        return appDataManager;
    }
    @Provides
    @Singleton
    SharedPresenter sharedPresenter(SharedHelper sharedPreferences) {

        return sharedPreferences;
    }*/
}

