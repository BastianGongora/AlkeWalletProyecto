package com.example.alkewalletproyecto.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.alkewalletproyecto.R;


public class A4SignUp extends Fragment {



    public A4SignUp() {
        // Required empty public constructor
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

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final NavController navc3 = Navigation.findNavController(view);
        Button btnCrearcuenta = view.findViewById(R.id.btn_crear_signup);
        TextView txtYaCuenta = view.findViewById(R.id.txt_ya_cuenta_signup);

        btnCrearcuenta.setOnClickListener(v -> {
            navc3.navigate(R.id.a5Home);
        });
        txtYaCuenta.setOnClickListener(v -> {
            navc3.navigate(R.id.a3Login);
        });



    }
}