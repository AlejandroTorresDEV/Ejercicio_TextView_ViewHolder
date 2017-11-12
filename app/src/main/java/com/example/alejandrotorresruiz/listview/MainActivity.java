package com.example.alejandrotorresruiz.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView) ;

        List<String > names = new ArrayList<String>();
        names.add("Alejandro");
        names.add("Alejandro");
        names.add("Alejandro");
        names.add("Alejandro");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);

        //Enlazamos el adaptador con nuestra vista.
        listView.setAdapter(adapter);
    }
}
