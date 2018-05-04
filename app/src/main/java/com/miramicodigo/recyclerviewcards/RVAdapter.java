package com.miramicodigo.recyclerviewcards;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Type;
import java.util.ArrayList;

class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Pokemon> items;

    public RVAdapter(Activity activity, ArrayList<Pokemon> data) {
        this.context = activity;
        this.items = data;
    }

    @Override
    //seleccionar a un xml
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_grid,parent,false);
        return new ViewHolder(v);
    }

    @Override

    // llenar datos
    public void onBindViewHolder(ViewHolder holder, int position) {
    Pokemon p=items.get(position);
    holder.tvTitulo.setText(p.getNombre());
    holder.tvSubtitulo.setText(p.getTipo());
    holder.ivImagen.setImageResource(p.getImagen());



    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    //enlaces a componentes

    class ViewHolder extends RecyclerView.ViewHolder{
    private TextView tvTitulo;
    private  TextView tvSubtitulo;
    private ImageView ivImagen;


        public ViewHolder(final View itemView) {
            super(itemView);
            tvTitulo=(TextView)itemView.findViewById(R.id.tvTitulo);
            tvSubtitulo=(TextView)itemView.findViewById(R.id.tvSubtitulo);
            ivImagen=(ImageView)itemView.findViewById(R.id.ivImagen);

        }
    }
}
