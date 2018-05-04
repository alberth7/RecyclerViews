package com.miramicodigo.recyclerviewcards;

import android.app.Activity;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Pokemon> datos;
    private RecyclerView rvDatos;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    private Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llenarPokemones();
        activity = this;

        rvDatos=(RecyclerView)findViewById(R.id.rvContenido);

        layoutManager=new GridLayoutManager(this,2);

        rvDatos.setLayoutManager(layoutManager);
        adapter = new RVAdapter(activity,datos);
        rvDatos.setAdapter(adapter);

    }

    public void llenarPokemones() {
        datos = new ArrayList<Pokemon>();
        Resources resources = getResources();
        String[] arrayNombres = resources.getStringArray(R.array.nombre);
        String[] arrayTipos = resources.getStringArray(R.array.tipos);
        TypedArray arrayImgs = resources.obtainTypedArray(R.array.image);
        for(int i=0; i < arrayNombres.length; i++) {
            Pokemon poke= new Pokemon(arrayNombres[i],arrayTipos[i],arrayImgs.getResourceId(i,-1));
            datos.add(poke);
        }
    }


}
