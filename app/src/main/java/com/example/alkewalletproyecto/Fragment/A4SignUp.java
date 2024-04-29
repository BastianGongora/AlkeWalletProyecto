package com.example.alkewalletproyecto.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alkewalletproyecto.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link A4SignUp#newInstance} factory method to
 * create an instance of this fragment.
 */
public class A4SignUp extends Fragment {



    public A4SignUp() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static A4SignUp newInstance(String param1, String param2) {
        A4SignUp fragment = new A4SignUp();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a4_sign_up, container, false);
    }
}