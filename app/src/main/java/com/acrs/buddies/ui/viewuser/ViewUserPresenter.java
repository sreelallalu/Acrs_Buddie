package com.acrs.buddies.ui.viewuser;

import com.acrs.buddies.data.DataManager;
import com.acrs.buddies.ui.base.BasePresenter;

public class ViewUserPresenter<T extends ViewUserView> extends BasePresenter<T> implements ViewUser_i_Presenter<T> {

    public ViewUserPresenter(DataManager dataManager) {
        super(dataManager);
    }
}
