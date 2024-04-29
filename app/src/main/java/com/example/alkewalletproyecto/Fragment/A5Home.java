package com.example.alkewalletproyecto.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alkewalletproyecto.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link A5Home#newInstance} factory method to
 * create an instance of this fragment.
 */
public class A5Home extends Fragment {


    public A5Home() {
        // Required empty public constructor
    }


    public static A5Home newInstance(String param1, String param2) {
        A5Home fragment = new A5Home();
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
        return inflater.inflate(R.layout.fragment_a5_home, container, false);
    }
}