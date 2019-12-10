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
public class SwapNumberFragment extends Fragment implements View.OnClickListener{
    private Button btncalcswap;
    private EditText etnumber;


    public SwapNumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_swap_number, container, false);
        etnumber = view.findViewById(R.id.etnumber);
        btncalcswap = view.findViewById(R.id.btncalcswap);

        btncalcswap.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
