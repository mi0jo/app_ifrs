package com.example.ifrs_campusrolante.ui.incricao;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.ifrs_campusrolante.databinding.FragmentInscricaoBinding;

public class inscricaoFragment extends Fragment {

    private FragmentInscricaoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentInscricaoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.btnProvas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://ingresso.ifrs.edu.br/2025/provas-e-gabaritos-anteriores/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        binding.btnSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://ingresso.ifrs.edu.br/2025/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        binding.btnEditais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://ingresso.ifrs.edu.br/2025/editais/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        return root;
    }
}
