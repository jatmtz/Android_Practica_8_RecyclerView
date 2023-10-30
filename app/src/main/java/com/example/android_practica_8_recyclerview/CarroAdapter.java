package com.example.android_practica_8_recyclerview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarroAdapter extends RecyclerView.Adapter<CarroAdapter.viewHolder> {


    private List<ListElement> mData;
    private LayoutInflater minflater;
    private Context context;
    CarroAdapter.OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(ListElement item);
    }

    public CarroAdapter(List<ListElement> listaCarros, Context context, OnItemClickListener OnItemClickListener){
        this.minflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = listaCarros;
        this.listener = listener;
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    @NonNull
    @Override
    public CarroAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly = LayoutInflater.from(parent.getContext());
        View v = minflater.inflate(R.layout.itemcarro,parent,false);
        return new CarroAdapter.viewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull CarroAdapter.viewHolder holder, final int position) {
        holder.bindData(mData.get(position));
    }

    public void setItems(List<ListElement> items) { mData = items;}

    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView txtMarca;
        TextView txtModelo;
        ImageView iconcarro;



        //Contructor
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            txtMarca = itemView.findViewById(R.id.TxtMarca);
            txtModelo = itemView.findViewById(R.id.txtModelo);
            iconcarro = itemView.findViewById(R.id.iconocarro);
        }



        @Override
        public void onClick(View view) {

        }

        public void bindData(final ListElement item) {
            iconcarro.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            txtMarca.setText(item.getMarca());
            txtModelo.setText(item.getModelo());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(item);
                }
            });

        }
    }
}
