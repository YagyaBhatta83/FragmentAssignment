package com.yagya.fragmentassignment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.yagya.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleInterestFragment extends Fragment implements View.OnClickListener {
    private Button btncalcsimpleinterest;
    private EditText etprinciple, ettime, etrate;


    public SimpleInterestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_interest, container, false);
        etprinciple = view.findViewById(R.id.etprinciple);
        ettime = view.findViewById(R.id.ettime);
        etrate = view.findViewById(R.id.etrate);
        btncalcsimpleinterest = view.findViewById(R.id.btncalcsimpleinterest);

        btncalcsimpleinterest.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
