package com.yagya.fragmentassignment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yagya.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AreaofCircleFragment extends Fragment {


    public AreaofCircleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_areaof_circle, container, false);
    }

}
