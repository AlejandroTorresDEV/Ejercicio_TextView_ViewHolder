package com.example.alejandrotorresruiz.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<Titular> names;
    private TextView textViewTitulo;
    private TextView textViewSubtitulo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView) ;
        textViewTitulo = (TextView) findViewById(R.id.LblTitulo);
        textViewSubtitulo = (TextView) findViewById(R.id.LblSubTitulo);

        names = new ArrayList<Titular>();

        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));
        names.add(new Titular("Alex","prueba"));

        /* Manera simple de enlazar nuestro listView con un adaptador predeterminado
        //Creamos el adaptador
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);

        //Enlazamos el adaptador con nuestra vista.
        listView.setAdapter(adapter);
        */

        //Enlazamos esta vista con nustro adaptador
        MyAdapter myAdapter = new MyAdapter(this,R.layout.listview,names);
        listView.setAdapter(myAdapter);

        //Seleccionar elementos del textView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Toast.makeText(MainActivity.this,"Has seleccionado "+names.get(position).getTitulo(),Toast.LENGTH_LONG).show();
            }
        });
    }
}

