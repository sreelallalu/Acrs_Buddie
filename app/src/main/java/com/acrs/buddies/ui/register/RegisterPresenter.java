package com.acrs.buddies.ui.register;

import com.acrs.buddies.data.DataManager;
import com.acrs.buddies.ui.base.BasePresenter;

public class RegisterPresenter<T extends RegisterView> extends BasePresenter<T> implements Register_i_Presenter<T> {

    public RegisterPresenter(DataManager dataManager) {
        super(dataManager);
    }
}
