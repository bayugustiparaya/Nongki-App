package com.itsbabay.nongki.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.itsbabay.nongki.R;
import com.itsbabay.nongki.model.CafeModel;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class CafeAdapter extends RecyclerView.Adapter<CafeAdapter.CafeViewHolder> {
    private Fragment context;
    private List<CafeModel> listCafe;
    private NumberFormat currentcy = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

    public CafeAdapter(Fragment context, List<CafeModel> listCafe) {
        this.context = context;
        this.listCafe = listCafe;
    }

    @NonNull
    @Override
    public CafeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new CafeViewHolder(layoutInflater.inflate(R.layout.item_data, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CafeViewHolder holder, int position) {
        final CafeModel model = listCafe.get(position);
        Glide.with(context)
                .load(model.getGambar())
                .into(holder.imgCafe);
        holder.txtNama.setText(model.getNamaCafe());
        holder.txtLokasi.setText(model.getLokasi());
        holder.txtRangeHarga.setText("± "+currentcy.format(Integer.parseInt(model.getRangeHarga())));
        holder.txtJamBuka.setText(model.getJamBuka());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(context, Detail.class);
//                intent.putExtra("namafood", food.getNama());
//                context.startActivity(intent);
                Toast.makeText(context.getContext(), model.getNamaCafe(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listCafe.size();
    }

    class CafeViewHolder extends RecyclerView.ViewHolder {
        ImageView imgCafe;
        TextView txtNama, txtLokasi, txtRangeHarga,txtJamBuka, txtStatus;
        CardView cardView;
        CafeViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCafe = (ImageView) itemView.findViewById(R.id.cvw_img_cafe);
            txtNama = (TextView) itemView.findViewById(R.id.cvw_nama);
            txtLokasi = (TextView) itemView.findViewById(R.id.cvw_lokasi);
            txtRangeHarga = (TextView) itemView.findViewById(R.id.cvw_range_harga);
            txtJamBuka = (TextView) itemView.findViewById(R.id.cvw_jam_buka);
            txtStatus = (TextView) itemView.findViewById(R.id.cvw_status);
            cardView = (CardView) itemView.findViewById(R.id.cvw_item);
        }
    }
}
