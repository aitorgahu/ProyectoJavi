package com.example.bottlefriendsl.pedidosBF;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.bottlefriendsl.R;
import com.example.bottlefriendsl.interfacesBF.ComunicaMenuPedido;

public class Menu_Pedido extends Fragment {

    private final int[]BOTONES={R.id.btn_encargo, R.id.btn_ver_pedidos};

    public Menu_Pedido() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu_pedido, container, false);

        Button b1;

        for(int i = 0;i<BOTONES.length;i++){

            b1 = view.findViewById(BOTONES[i]);

            final int bot = i;

            b1.setOnClickListener((View v)->{

                Activity actividad_pedido = getActivity();

                assert actividad_pedido != null;
                ((ComunicaMenuPedido)actividad_pedido).boton(bot);

            });
        }
        return view;
    }
}