package com.example.ifrs_campusrolante.ui.bolsas;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ifrs_campusrolante.ui.carrossel.CarouselAdapter;
import com.example.ifrs_campusrolante.R;

import java.util.Arrays;
import java.util.List;

public class ensinoFragment extends Fragment {

    public ensinoFragment() {
        // Construtor vazio obrigatório
    }

    public static ensinoFragment newInstance() {
        return new ensinoFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Infla o layout da fragment
        View view = inflater.inflate(R.layout.fragment_ensino, container, false);

        // === ETAPA 5: Configuração do carrossel ===
        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewCarousel);

        // Lista de imagens do drawable
        List<Integer> imagens = Arrays.asList(
                R.drawable.englishclub,
                R.drawable.bovinocultura,
                R.drawable.clube
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