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
public class AutomorphicFragment extends Fragment implements View.OnClickListener {
    private Button btncalcautomorphic;
    private EditText etnumber;


    public AutomorphicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);
        etnumber = view.findViewById(R.id.etnumber);
        btncalcautomorphic = view.findViewById(R.id.btncalcautomorphic);

        btncalcautomorphic.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {


    }
}
