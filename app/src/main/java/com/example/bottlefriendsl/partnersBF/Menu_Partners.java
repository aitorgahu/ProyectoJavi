package com.example.bottlefriendsl.partnersBF;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.bottlefriendsl.R;
import com.example.bottlefriendsl.interfacesBF.ComunicaMenuPartners;

public class Menu_Partners extends Fragment {

    private final int[]MENU={R.id.btn_verP, R.id.btn_nuevoP};

    public Menu_Partners() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_menu__partners, container, false);

        Button b;

        for(int i = 0;i< MENU.length;i++){

            b = view.findViewById(MENU[i]);

            final int bot = i;

            b.setOnClickListener((View v)->{

                Activity actividad = getActivity();

                assert actividad != null;
                ((ComunicaMenuPartners)actividad).pestaña(bot);

            });

        }
        return view;
    }
}