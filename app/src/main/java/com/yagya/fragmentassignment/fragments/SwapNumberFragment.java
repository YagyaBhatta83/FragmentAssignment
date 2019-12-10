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
public class SwapNumberFragment extends Fragment implements View.OnClickListener{
    private Button btncalcswap;
    private EditText etnumber1, etnumber2;
    TextView res;


    public SwapNumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_swap_number, container, false);
        etnumber1 = view.findViewById(R.id.etnumber1);
        etnumber2 = view.findViewById(R.id.etnumber2);
        btncalcswap = view.findViewById(R.id.btncalcswap);
        res = view.findViewById(R.id.Res);
        btncalcswap.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (etnumber1.getText().toString().isEmpty()) {
            etnumber1.setError("please enter First Number!");
            return;
        }
        else if (etnumber2.getText().toString().isEmpty()){
            etnumber2.setError("Please Enter Second Number");
        }else{
            int fNum = Integer.parseInt(etnumber1.getText().toString());
            int sNum = Integer.parseInt(etnumber2.getText().toString());

            fNum = fNum + sNum;//a=30 (10+20)
            sNum = fNum - sNum;//b=10 (30-20)
            fNum = fNum - sNum;//a=20 (30-10)

            res.setText("First number is :" + fNum + " Second number is : " + sNum);


        }

    }
}
