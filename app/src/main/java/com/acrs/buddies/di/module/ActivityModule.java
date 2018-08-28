package com.acrs.buddies.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.acrs.buddies.di.ActivityContext;
import com.acrs.buddies.ui.login.LoginPresenter;
import com.acrs.buddies.ui.login.LoginView;
import com.acrs.buddies.ui.login.Login_i_Presenter;
import com.acrs.buddies.ui.register.RegisterPresenter;
import com.acrs.buddies.ui.register.RegisterView;
import com.acrs.buddies.ui.register.Register_i_Presenter;

import dagger.Module;
import dagger.Provides;


/**
 * Created by sreelal on 13/12/17.
 */
@Module
public class ActivityModule {
    AppCompatActivity activity;

    public ActivityModule(AppCompatActivity activity) {

        this.activity = activity;
    }




    @Provides
    @ActivityContext
    Context provideContext() {

        return activity;
    }


    @Provides
    AppCompatActivity provideActivity() {
        return activity;
    }


    @Provides
    Register_i_Presenter<RegisterView> register_i_presenter(RegisterPresenter<RegisterView> presenter) {
        return presenter;
    }


    @Provides
    Login_i_Presenter<LoginView> register_i_presenter(LoginPresenter<LoginView> presenter) {
        return presenter;
    }
}
