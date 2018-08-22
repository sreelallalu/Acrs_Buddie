package com.acrs.buddies.ui.medicineadd;

import com.acrs.buddies.data.DataManager;
import com.acrs.buddies.ui.base.BasePresenter;

public class MedicineAddPresenter<T extends MedicineAddView> extends BasePresenter<T> implements MedicineAdd_i_Presenter<T> {

    public MedicineAddPresenter(DataManager dataManager) {
        super(dataManager);
    }
}
