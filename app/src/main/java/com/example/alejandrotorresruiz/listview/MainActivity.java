package com.example.alejandrotorresruiz.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<String > names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView) ;

        names = new ArrayList<String>();
        names.add("Alejandro");
        names.add("Pepe");
        names.add("Aroa");
        names.add("Jessica");

        //Creamos el adaptador
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);

        //Enlazamos el adaptador con nuestra vista.
        listView.setAdapter(adapter);


        //Seleccionar elementos del textView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Toast.makeText(MainActivity.this,"Has seleccionado "+names.get(position),Toast.LENGTH_LONG).show();
            }
        });
    }
}
