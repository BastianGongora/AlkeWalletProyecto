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
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alkewalletproyecto.R;


public class A5Home extends Fragment {


    public A5Home() {
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
        return inflater.inflate(R.layout.fragment_a5_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final NavController navC3 = Navigation.findNavController(view);
        Button btningreso = view.findViewById(R.id.btn_ingreso_home);
        Button btnenvio = view.findViewById(R.id.btn_envio_home);
        ImageView imagentransaccion = view.findViewById(R.id.image_transaccion);
        ImageView perfil = view.findViewById(R.id.imagen_perfil);


        btningreso.setOnClickListener(v -> {
            navC3.navigate(R.id.a6IngresarDinero);
        });
        btnenvio.setOnClickListener(v -> {
            navC3.navigate(R.id.a7EnviarDinero);
        });
        imagentransaccion.setOnClickListener(v -> {
            navC3.navigate(R.id.a5HomeFull);
        });
        perfil.setOnClickListener(v -> {
            navC3.navigate(R.id.a8MiPerfil);
        });
    }
}