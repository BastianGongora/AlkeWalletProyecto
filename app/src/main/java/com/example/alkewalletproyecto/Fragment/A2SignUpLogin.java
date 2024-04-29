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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link A2SignUpLogin#newInstance} factory method to
 * create an instance of this fragment.
 */
public class A2SignUpLogin extends Fragment {



    public A2SignUpLogin() {
        // Required empty public constructor
    }


    public static A2SignUpLogin newInstance(String param1, String param2) {
        A2SignUpLogin fragment = new A2SignUpLogin();
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
        return inflater.inflate(R.layout.fragment_a2_sign_up_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final NavController navController = Navigation.findNavController(view);

        Button btncrear = view.findViewById(R.id.btn_crear_cuenta);
        TextView btnCuentaCreada = view.findViewById(R.id.txt_ya_cuenta);

        btncrear.setOnClickListener(v -> {
            navController.navigate(R.id.a4SignUp);
        });
        btnCuentaCreada.setOnClickListener(v -> {
            navController.navigate(R.id.a3Login);
        });
    }
}