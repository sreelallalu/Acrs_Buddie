package com.acrs.buddies.ui.dashboard;

import android.os.Bundle;

import com.acrs.buddies.R;
import com.acrs.buddies.ui.base.BaseActivity;

public class DashBoardActvity extends BaseActivity implements DashBoardView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
    }
}
