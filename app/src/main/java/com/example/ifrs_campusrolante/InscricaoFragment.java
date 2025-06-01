package com.example.ifrs_campusrolante;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class InscricaoFragment extends Fragment {

    public InscricaoFragment() {
        // construtor vazio obrigatório
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Toast.makeText(getContext(), "Fragment carregado", Toast.LENGTH_SHORT).show();

        View view = inflater.inflate(R.layout.fragment_inscricao, container, false);

        Button btnProvas = view.findViewById(R.id.btn_provas);
        Button btnSite = view.findViewById(R.id.btn_site);
        Button btnEditais = view.findViewById(R.id.btn_editais);

        btnProvas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Clicou em Provas", Toast.LENGTH_SHORT).show();
                abrirLink("https://ingresso.ifrs.edu.br/2025-2/provas-e-gabaritos-anteriores/");
            }
        });

        btnSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Clicou em Site", Toast.LENGTH_SHORT).show();
                abrirLink("https://ingresso.ifrs.edu.br/2025-2/");
            }
        });

        btnEditais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Clicou em Editais", Toast.LENGTH_SHORT).show();
                abrirLink("https://ingresso.ifrs.edu.br/2025-2/editais/");
            }
        });

        return view;
    }

    private void abrirLink(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
