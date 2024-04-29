package com.example.alkewalletproyecto.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alkewalletproyecto.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link A1SplashScreen#newInstance} factory method to
 * create an instance of this fragment.
 */
public class A1SplashScreen extends Fragment {



    public A1SplashScreen() {
        // Required empty public constructor
    }


    public static A1SplashScreen newInstance(String param1, String param2) {
        A1SplashScreen fragment = new A1SplashScreen();
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
        return inflater.inflate(R.layout.fragment_a1_splash_screen, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View vistasplash = view.findViewById(R.id.a1splashscreen);
        vistasplash.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.a2SignUpLogin);
        });
    }
}