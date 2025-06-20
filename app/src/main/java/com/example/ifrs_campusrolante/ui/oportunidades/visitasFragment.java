package com.example.ifrs_campusrolante.ui.oportunidades;

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

public class visitasFragment extends Fragment {

    public visitasFragment() {
        // Construtor vazio obrigatório
    }

    public static visitasFragment newInstance() {
        return new visitasFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Infla o layout da fragment
        View view = inflater.inflate(R.layout.fragment_visitas, container, false);

        // === ETAPA 5: Configuração do carrossel ===
        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewCarousel);

        // Lista de imagens do drawable
        List<Integer> imagens = Arrays.asList(
                R.drawable.feiradolivropoa,
                R.drawable.visitaadm,
                R.drawable.space,
                R.drawable.visitaagro

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