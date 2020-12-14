package com.example.bottlefriendsl.partnersBF;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.bottlefriendsl.R;
import com.example.bottlefriendsl.interfacesBF.ComunicaMenuPartners;

public class Activity_Gestion_partners extends AppCompatActivity implements ComunicaMenuPartners {

    Fragment[]arrayFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__gestion_partners);

        arrayFragments = new Fragment[2];

        arrayFragments[0]=new Socio();
        arrayFragments[1]=new Alta();

        Bundle extras = getIntent().getExtras();

        assert extras != null;
        pestaña(extras.getInt("BOTON"));

    }

    @Override
    public void pestaña(int tab) {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction mt = fm.beginTransaction();
        mt.replace(R.id.gestion, arrayFragments[tab]);
        mt.commit();
    }
}