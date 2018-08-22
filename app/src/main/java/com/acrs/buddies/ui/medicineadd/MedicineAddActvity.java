package com.acrs.buddies.ui.medicineadd;

import android.os.Bundle;

import com.acrs.buddies.R;
import com.acrs.buddies.ui.base.BaseActivity;

public class MedicineAddActvity extends BaseActivity implements MedicineAddView  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_add);
    }
}
