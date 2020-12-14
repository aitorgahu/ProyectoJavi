package com.example.bottlefriendsl.recycler_listasBF;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bottlefriendsl.R;
import com.example.bottlefriendsl.clasesBF.Partner;

import java.util.List;

public class Lista_partner extends RecyclerView.Adapter<Lista_partner.ViewHolder> {


    private List<Partner> catalogo;
    private LayoutInflater mInflater;
    private Context context;

    public Lista_partner(List<Partner> itemList, Context context){

        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.catalogo = itemList;

    }

    @Override
    public int getItemCount(){return catalogo.size();}

    @Override
    public Lista_partner.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){

        View view = mInflater.inflate(R.layout.partners, null);

        return new Lista_partner.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Lista_partner.ViewHolder holder, int position) {

        holder.bindData(catalogo.get(position));

    }

    public void setItems(List<Partner> items){catalogo = items;}

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView foto;
        TextView nombre;

        ViewHolder(View itemView){

            super(itemView);
            foto = itemView.findViewById(R.id.iconImageView);
            nombre = itemView.findViewById(R.id.txt_nombre);

        }

        void bindData(final Partner item){

            foto.setImageResource(item.getImagen());
            nombre.setText(item.toString());

        }
    }
}
