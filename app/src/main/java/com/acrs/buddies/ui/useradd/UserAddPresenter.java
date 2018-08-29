package com.acrs.buddies.ui.useradd;

import com.acrs.buddies.data.DataManager;
import com.acrs.buddies.ui.base.BasePresenter;

public class UserAddPresenter<T extends UserAddView> extends BasePresenter<T> implements UserAdd_i_Presenter<T> {

    public UserAddPresenter(DataManager dataManager) {
        super(dataManager);
    }
}
