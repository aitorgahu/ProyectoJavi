package com.example.bottlefriendsl.partnersBF;

import android.content.res.AssetManager;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bottlefriendsl.R;
import com.example.bottlefriendsl.clasesBF.LeerXML;
import com.example.bottlefriendsl.clasesBF.Partner;
import com.example.bottlefriendsl.recycler_listasBF.Lista_partner;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Socio extends Fragment {

    List<Partner> partners;
    RecyclerView rec;

    public Socio() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_socio, container, false);

        partners = new ArrayList<>();
        rec = view.findViewById(R.id.lista_part);

        try {

            AssetManager asset = Objects.requireNonNull(getActivity()).getAssets();
            InputStream entrada = asset.open("socios.xml");
            partners = LeerXML.partnersXML(entrada);

        } catch (Exception e) {
            e.printStackTrace();
        }

        partners.forEach(p -> p.setImagen(R.drawable.edifisio));

        Lista_partner lista = new Lista_partner(partners, getContext());
        LinearLayoutManager capa = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        rec.setLayoutManager(capa);
        rec.setAdapter(lista);

        return view;
    }
}