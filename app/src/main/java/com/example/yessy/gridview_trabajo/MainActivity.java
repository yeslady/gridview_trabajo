package com.example.yessy.gridview_trabajo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridViewAdapter adapter ;
    String[] titulo = new String[]{
            "mochila",
            "regla",
            "lapiceros",
            "colores",
            "libros"

    };
    int[] utilesescolares={
            R.drawable.uno,
            R.drawable.dos,
            R.drawable.tres,
            R.drawable.cuatro,
            R.drawable.cinco

};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final GridView lista=(GridView)findViewById(R.id.gridView);
        lista.setAdapter(adapter);
    }
}
