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
 * Use the {@link A3Login#newInstance} factory method to
 * create an instance of this fragment.
 */
public class A3Login extends Fragment {



    public A3Login() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static A3Login newInstance(String param1, String param2) {
        A3Login fragment = new A3Login();
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
        return inflater.inflate(R.layout.fragment_a3_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final NavController navController = Navigation.findNavController(view);

        Button btnLogin = view.findViewById(R.id.btn_logeo);
        TextView btnCuentaCreadaLogin = view.findViewById(R.id.txt_ya_cuenta_login);

        btnLogin.setOnClickListener(v -> {
            navController.navigate(R.id.a5home);
        });
        btnCuentaCreadaLogin.setOnClickListener(v -> {
            navController.navigate(R.id.a4SignUp);
        });
    }
}