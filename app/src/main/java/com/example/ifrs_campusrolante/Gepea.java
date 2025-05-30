package com.example.ifrs_campusrolante;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        // Inflar apenas o layout pronto, sem lógica extra
        return inflater.inflate(R.layout.fragment_gepea, container, false);
    }

}
