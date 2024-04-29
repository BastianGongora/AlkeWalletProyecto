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


public class A3Login extends Fragment {



    public A3Login() {
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
        return inflater.inflate(R.layout.fragment_a3_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final NavController navC2 = Navigation.findNavController(view);
        Button btnLogeo = view.findViewById(R.id.btn_logeo);
        TextView txtCrearcuenta = view.findViewById(R.id.txt_crear_cuenta);

        txtCrearcuenta.setOnClickListener(v -> {
            navC2.navigate(R.id.a4SignUp);
        });
        btnLogeo.setOnClickListener(v -> {
            navC2.navigate(R.id.a5Home);
        });
    }
}