package com.yagya.fragmentassignment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.yagya.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AutomorphicFragment extends Fragment implements View.OnClickListener {
    private Button btncalcautomorphic;
    private EditText etnumber;
    TextView res;


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
        res = view.findViewById(R.id.Res);

        btncalcautomorphic.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (etnumber.getText().toString().isEmpty()) {
            etnumber.setError("please enter number!");
        } else {
            int num = Integer.parseInt(etnumber.getText().toString());
            int div, c = 0, sq, rem;
            c = 0;
            for (div = num; div > 0; div = div / 10) {
                c++;
            }
            div = (int) Math.pow(10, c);
            sq = num * num;
            rem = sq % div;

            if (rem == num) {
                res.setText("The number is a Automorphic number");

            } else {
                res.setText("The number is not a Automorphic number");

            }

        }
    }
}
