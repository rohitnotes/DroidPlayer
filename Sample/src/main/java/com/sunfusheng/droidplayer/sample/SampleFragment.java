package com.sunfusheng.droidplayer.sample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by sunfusheng on 2017/3/3.
 */
public class SampleFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sample, null);
        ButterKnife.bind(this, view);
        initData();
        initView();
        initListener();
        return view;
    }

    private void initData() {

    }

    private void initView() {

    }

    private void initListener() {

    }
}
