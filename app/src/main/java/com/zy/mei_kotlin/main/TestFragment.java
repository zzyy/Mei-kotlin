package com.zy.mei_kotlin.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zy.mei_kotlin.R;
import com.zy.mei_kotlin.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yunzou on 17-8-23.
 */

public class TestFragment extends BaseFragment {

    final static List<String> DATA = new ArrayList<>();

    static {
        for (int i = 0; i<50; i++ ){
            DATA.add("12");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_home_content);

        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
    }
}
