package com.itsbabay.nongki.ui.cafe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.itsbabay.nongki.R;
import com.itsbabay.nongki.adapter.CafeAdapter;
import com.itsbabay.nongki.model.CafeModel;

import java.util.ArrayList;
import java.util.List;

public class CafeFragment extends Fragment {
    RecyclerView recyclerView;
    List<CafeModel> listCafe;
    CafeModel cafeModel;

//    private CafeViewModel cafeViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        cafeViewModel = new ViewModelProvider(this).get(CafeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_cafe, container, false);
//        final TextView textView = root.findViewById(R.id.text_cafe);
//        cafeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });


        recyclerView = (RecyclerView) root.findViewById(R.id.recv_cafe);
//        GridLayoutManager grid = new GridLayoutManager(MainCyclerCardActivity.this, 2);
//        recyclerView.setLayoutManager(grid);
//        recyclerView.setHasFixedSize(true);
        listCafe = new ArrayList<>();
        cafeModel = new CafeModel("Burger", "Jln raya 1", "500000", "08.00 - 20.00", R.drawable.ic_dashboard_black_24dp);
        listCafe.add(cafeModel);
        cafeModel = new CafeModel("Burger", "Jln raya 1", "500000", "08.00 - 20.00", R.drawable.ic_dashboard_black_24dp);
        listCafe.add(cafeModel);
        cafeModel = new CafeModel("Burger", "Jln raya 1", "500000", "08.00 - 20.00", R.drawable.ic_dashboard_black_24dp);
        listCafe.add(cafeModel);
        cafeModel = new CafeModel("Burger", "Jln raya 1", "500000", "08.00 - 20.00", R.drawable.ic_dashboard_black_24dp);
        listCafe.add(cafeModel);
        cafeModel = new CafeModel("Burger", "Jln raya 1", "500000", "08.00 - 20.00", R.drawable.ic_dashboard_black_24dp);
        listCafe.add(cafeModel);
        cafeModel = new CafeModel("Burger", "Jln raya 1", "500000", "08.00 - 20.00", R.drawable.ic_dashboard_black_24dp);
        listCafe.add(cafeModel);
        cafeModel = new CafeModel("Burger", "Jln raya 1", "500000", "08.00 - 20.00", R.drawable.ic_dashboard_black_24dp);
        listCafe.add(cafeModel);

        CafeAdapter myAdapter = new CafeAdapter(CafeFragment.this, listCafe);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(myAdapter);

        return root;
    }
}