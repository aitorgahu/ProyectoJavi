package com.example.bottlefriendsl.pedidosBF;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.bottlefriendsl.R;
import com.example.bottlefriendsl.interfacesBF.ComunicaMenuPedido;

import java.util.List;

public class Activity_pedido extends AppCompatActivity implements ComunicaMenuPedido {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

    }

    @Override
    public void boton(int b) {

        Intent voy = new Intent(this, Activity_gestionPedido.class);
        voy.putExtra("BOTON_PEDIDO", b);
        startActivity(voy);

    }
}