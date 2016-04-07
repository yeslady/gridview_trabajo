package com.example.yessy.gridview_trabajo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;

import java.util.zip.Inflater;


public class GridViewAdapter extends BaseAdapter {

    Context context;
    String[] titulos;
    int[] utilesescolares;
    LayoutInflater inflater;

    public GridViewAdapter(Context context, String[] titulos, int[] utilesescolares) {
        this.context = context;
        this.titulos = titulos;
        this.utilesescolares = utilesescolares;
    }

    @Override
    public int getCount() {
        return titulos.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imgimg;
        Button btNombre;

        inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView=inflater.inflate(R.layout.vista_cuadricula,parent,false);

        btNombre=(Button) itemView.findViewById(R.id.button);
        imgimg=(ImageView) itemView.findViewById(R.id.grid_image);

        btNombre.setText(titulos[position]);
        imgimg.setImageResource(utilesescolares[position]);
        return itemView;
    }
}