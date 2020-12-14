package com.example.bottlefriendsl.pedidosBF;

import android.content.res.AssetManager;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bottlefriendsl.R;
import com.example.bottlefriendsl.clasesBF.LeerXML;
import com.example.bottlefriendsl.clasesBF.Producto;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Objects;

public class Encargo extends Fragment {

    TextView prod, pre;
    Button b;
    EditText c;
    String cantidad;
    Producto producto;
    ArrayList<Producto> lista = new ArrayList<>();
    ArrayList<String>lista_nombres = new ArrayList<>();
    int[]imagenes = {R.drawable.botella0_5l, R.drawable.botella1_5l};
    Spinner sp;
    ImageView img;
    Button b1, b3;

    public Encargo() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_encargo, container, false);

        prod = view.findViewById(R.id.txt_prod);
        sp = view.findViewById(R.id.CB_productos);
        img = view.findViewById(R.id.galeria);
        c = view.findViewById(R.id.cantidad);
        pre = view.findViewById(R.id.precio);
        b1 = view.findViewById(R.id.btn_agregar);
        b3 = view.findViewById(R.id.btn_precio);

        try {

            AssetManager assetMan = Objects.requireNonNull(getActivity()).getAssets();
            assert false;
            InputStream is = assetMan.open("catalogo.xml");
            lista = LeerXML.catalogoXML(is);

        } catch (Exception e) {

            e.printStackTrace();
        }

        ArrayAdapter<Producto> articulos = new ArrayAdapter<>(Objects.requireNonNull(getContext()), android.R.layout.simple_spinner_dropdown_item, lista);
        articulos.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp.setAdapter(articulos);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                b1.setEnabled(true);
                producto = lista.get(position);
                prod.setText(producto.toString());
                img.setImageResource(imagenes[position]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                b1.setEnabled(false);
            }
        });

        b1.setOnClickListener((View v)->{

            Toast.makeText(getContext(), "Añadido "+producto.getNom_producto(), Toast.LENGTH_SHORT).show();

        });

        return view;
    }
}