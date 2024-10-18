package br.com.etec.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class BikesNovasFragment extends Fragment {
private List <BikeNova>lstBikeNova;
RecyclerView idRecBikesNovas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_bikes_novas, container, false);
        idRecBikesNovas = view.findViewById(R.id.idRecBikesNovas);

        // Carregando os objetos na lista
        lstBikeNova = new ArrayList<>();

        lstBikeNova.add(new BikeNova("vintage",R.drawable.bikea));
        lstBikeNova.add(new BikeNova("vintage",R.drawable.bikeb));
        lstBikeNova.add(new BikeNova("vintage",R.drawable.bikec));
        lstBikeNova.add(new BikeNova("vintage",R.drawable.biked));
        lstBikeNova.add(new BikeNova("vintage",R.drawable.bikee));
        lstBikeNova.add(new BikeNova("vintage",R.drawable.bikef));
        lstBikeNova.add(new BikeNova("vintage",R.drawable.bikeg));
        lstBikeNova.add(new BikeNova("vintage",R.drawable.bikeh));
        lstBikeNova.add(new BikeNova("vintage",R.drawable.bikei));
        lstBikeNova.add(new BikeNova("vintage",R.drawable.bikej));

        //carregando o adaptador
        RecyclerAdapterBikeNova adapterBikeNova = new RecyclerAdapterBikeNova(getContext(),lstBikeNova);
        idRecBikesNovas.setLayoutManager(new GridLayoutManager(getContext(),2));
        idRecBikesNovas.setAdapter(adapterBikeNova);
        return view;
    }
}