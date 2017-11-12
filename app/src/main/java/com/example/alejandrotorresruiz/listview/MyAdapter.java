package com.example.alejandrotorresruiz.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {


    private Context context;
    private int layout;
    private List<Titular> names;

    public MyAdapter (Context context, int layout,List<Titular> names){
        this.context = context;
        this.layout = layout;
        this.names = names;
    }

    @Override
    public int getCount() {

        return this.names.size();
    }

    @Override
    public Object getItem(int i) {
        return this.names.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {


        //-----------------------------PATRON VIEW HOLDER------------------------

        //Creamos una instacia de la clase view holder.
        ViewHolder holder;

        //Si convert view es vacio inflamos la vista con nuestro layout personalizado.
        if(convertView == null){
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            convertView = layoutInflater.inflate(R.layout.listview,null);

            //Creo una nueva instancia del holder para poder acceder a los elementos.
            holder = new ViewHolder();

            //Referencia al elemento a rellenar.
            holder.textViewTitulo = (TextView) convertView.findViewById(R.id.LblTitulo);

            holder.textViewSubtitulo = (TextView) convertView.findViewById(R.id.LblSubTitulo);

            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        //OBTENEMOS LA POSICION
        Titular currentName = names.get(position);

        // Y LO RELLENAMOS CON EL ELEMENTO RESCATADO DE LA CLASE GOLDER
        holder.textViewTitulo.setText((currentName.getTitulo()));

        holder.textViewSubtitulo.setText(currentName.getSubtitulo());




        //---------------------------------ANTERIOR COMMIT------------------------

        /*
        //RELLENAR UN LIST VIEW CON VARIOS ELEMENTOS A LA VEZ.

        //CREAMOS UNA VISTA
        View v = convertView;

        //INFLAMOS LA VISTA
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        v = layoutInflater.inflate(R.layout.listview,null);

        //OBTENEMOS LA POSICION
        Titular currentName = names.get(position);

        //AÑADIMOS LOS ELEMENTOS DE LA LISTA CON SUS ELEMENTOS.
        TextView lblTitulo = (TextView) v.findViewById(R.id.LblTitulo);
        lblTitulo.setText((currentName.getTitulo()));

        TextView lblSubtitulo = (TextView)v.findViewById(R.id.LblSubTitulo);
        lblSubtitulo.setText(currentName.getSubtitulo()); */




        return convertView;
    }

    static class ViewHolder{
        private TextView textViewTitulo;
        private TextView textViewSubtitulo;
    }
}
