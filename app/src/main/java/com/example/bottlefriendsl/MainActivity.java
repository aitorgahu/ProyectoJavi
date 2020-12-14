package com.example.bottlefriendsl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bottlefriendsl.partnersBF.Activity_Partners;
import com.example.bottlefriendsl.pedidosBF.Activity_pedido;

public class MainActivity extends AppCompatActivity {

    Button b_partners, b_pedidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_partners = findViewById(R.id.btn_gestion_partners);
        b_pedidos = findViewById(R.id.btn_gestion_pedidos);

        b_partners.setOnClickListener((View v)->{

            Intent activity_partners = new Intent(this, Activity_Partners.class);
            startActivity(activity_partners);

        });

        b_pedidos.setOnClickListener((View v)->{

            Intent activity_pedidos = new Intent(this, Activity_pedido.class);
            startActivity(activity_pedidos);

        });
    }
}