package com.acrs.buddies.ui.login;

import com.acrs.buddies.data.DataManager;
import com.acrs.buddies.ui.base.BasePresenter;

public class LoginPresenter<T extends LoginView> extends BasePresenter<T> implements Login_i_Presenter<T>{
    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }
}
