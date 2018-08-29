package com.acrs.buddies.ui.dashboard;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.acrs.buddies.R;
import com.acrs.buddies.databinding.ActivityDashBoardBinding;
import com.acrs.buddies.ui.base.BaseActivity;
import com.acrs.buddies.ui.medicineadd.MedicineAddActvity;

public class DashBoardActvity extends BaseActivity implements DashBoardView {
    ActivityDashBoardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_dash_board);
        binding.addmedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashBoardActvity.this, MedicineAddActvity.class);
                startActivity(intent);

            }
        });

    }


}
