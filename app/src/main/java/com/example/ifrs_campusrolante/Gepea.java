package com.example.ifrs_campusrolante;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ifrs_campusrolante.ui.carrossel.CarouselAdapter;

import java.util.Arrays;
import java.util.List;

public class Gepea extends Fragment {

    public Gepea() {
        // Construtor vazio obrigatório
    }

    public static Gepea newInstance() {
        return new Gepea();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Infla o layout da fragment
        View view = inflater.inflate(R.layout.fragment_gepea, container, false);

        // === ETAPA 5: Configuração do carrossel ===
        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewCarousel);

        // Lista de imagens do drawable
        List<Integer> imagens = Arrays.asList(
                R.drawable.gepeaalvorada,
                R.drawable.fotogepea,
                R.drawable.showgepea,
                R.drawable.reuniaogepea
        );

        // Cria e configura o adapter
        CarouselAdapter adapter = new CarouselAdapter(imagens);
        recyclerView.setAdapter(adapter);

        // Define o layout horizontal
        recyclerView.setLayoutManager(
                new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false)
        );
        Log.d("CAROUSEL", "Imagens carregadas: " + imagens.size());


        return view;
    }
}

