package com.example.bottlefriendsl.partnersBF;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.bottlefriendsl.R;
import com.example.bottlefriendsl.interfacesBF.ComunicaMenuPartners;

public class Activity_Partners extends AppCompatActivity implements ComunicaMenuPartners {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__partners);

    }

    @Override
    public void pestaña(int tab) {

        Intent voy = new Intent(this, Activity_Gestion_partners.class);
        voy.putExtra("BOTON", tab);
        startActivity(voy);

    }
}