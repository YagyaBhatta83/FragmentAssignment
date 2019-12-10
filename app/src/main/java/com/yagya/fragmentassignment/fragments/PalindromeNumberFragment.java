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
public class PalindromeNumberFragment extends Fragment implements View.OnClickListener {
    private Button btncalcpalindrome;
    private EditText etnumber;
    TextView res;


    public PalindromeNumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome_number, container, false);
        etnumber = view.findViewById(R.id.etnumber);
        btncalcpalindrome = view.findViewById(R.id.btncalcpalindrome);
        res = view.findViewById(R.id.Res);

        btncalcpalindrome.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (etnumber.getText().toString().isEmpty()) {
            etnumber.setError("please enter number!");
        }else {
            int num = Integer.parseInt(etnumber.getText().toString());

            int i;
            int r = 0;

            int initialNum = num;

            for (i = 0; i <= num; i++) {
                r = r * 10;
                r = r + num % 10;
                num = num / 10;
                i = 0;
            }

            if (r == initialNum) {
                res.setText("The number is a Palindrome number");

            } else {
                res.setText("The number is not a Palindrome number");

            }
        }

    }
}
