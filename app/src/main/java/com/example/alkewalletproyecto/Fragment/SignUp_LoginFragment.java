package com.example.alkewalletproyecto.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.alkewalletproyecto.R;


public class SignUp_LoginFragment extends Fragment {


    public SignUp_LoginFragment() {
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
        return inflater.inflate(R.layout.fragment_sign_up__login, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btn1 = view.findViewById(R.id.button_crearcuenta);
        btn1.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.signUpFragment));
        TextView txtcuenta = view.findViewById(R.id.textView_ya_cuenta);
        txtcuenta.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.loginFragment2));
    }
}