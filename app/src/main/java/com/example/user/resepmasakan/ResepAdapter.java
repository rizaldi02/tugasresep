package com.example.user.resepmasakan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.MyViewHolder> {
    private Context x;
    private List<Resepku> resepList;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.daftar_resep_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Resepku resepku = resepList.get(position);
        holder.judulnya.setText(resepku.getJudulnya());
        holder.keterangannya.setText(resepku.getKeterangannya());
        holder.image.setImageResource(resepku.getImage());
        holder.RL.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent in = new Intent(x, Data.class);
                        in.putExtra("image", resepku.getImage());
                        in.putExtra("keterangannya", resepku.getKeterangannya());
                        in.putExtra("judulnya", resepku.getJudulnya());
                        in.putExtra("prosesnya", resepku.getProses());
                        x.startActivity(in);
                    }
                });
    }

    @Override
    public int getItemCount() {
        return resepList.size();

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView judulnya,keterangannya,proses;
        public ImageView image;
        public RelativeLayout RL;
        public MyViewHolder(View view) {
            super(view);
            judulnya = (TextView) view.findViewById(R.id.judulnya);
            keterangannya = (TextView) view.findViewById(R.id.keterangannya);
            image = (ImageView) view.findViewById(R.id.image);
            proses = (TextView) view.findViewById(R.id.proses);
            RL = (RelativeLayout) view.findViewById(R.id.row_data);
        }
    }

    public ResepAdapter(Context x, List<Resepku> resepList) {
        this.resepList = resepList;
        this.x = x;
    }
}