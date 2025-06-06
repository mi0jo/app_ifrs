package com.example.ifrs_campusrolante.ui.oportunidades;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ifrs_campusrolante.databinding.FragmentIntercambioBinding;

public class intercambioFragment extends Fragment {

    private FragmentIntercambioBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentIntercambioBinding.inflate(inflater, container, false);

        binding.textLinkIntercambio.setOnClickListener(v -> {
            String url = "https://ifrs.edu.br/rolante/estudantes-do-ifrs-campus-rolante-sao-selecionadas-para-programa-de-intercambio-intercultural-global/"; // substitui pela URL real se quiser outra
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        return binding.getRoot();
    }
}