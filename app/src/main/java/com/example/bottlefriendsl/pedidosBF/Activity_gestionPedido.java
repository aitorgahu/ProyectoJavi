package com.example.bottlefriendsl.pedidosBF;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.bottlefriendsl.R;
import com.example.bottlefriendsl.interfacesBF.ComunicaMenuPedido;

public class Activity_gestionPedido extends AppCompatActivity implements ComunicaMenuPedido {

    Fragment[]fragmentsPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion_pedido);

        fragmentsPedido = new Fragment[2];

        fragmentsPedido[0] = new Encargo();
        fragmentsPedido[1] = new Pedido();

        Bundle extras = getIntent().getExtras();

        boton(extras.getInt("BOTON_PEDIDO"));


    }

    @Override
    public void boton(int b) {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction mt = fm.beginTransaction();
        mt.replace(R.id.gest_pedido, fragmentsPedido[b]);
        mt.commit();

    }
}