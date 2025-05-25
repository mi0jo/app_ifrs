package com.example.ifrs_campusrolante.ui.oportunidades;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.ifrs_campusrolante.R;

import com.example.ifrs_campusrolante.databinding.FragmentOportunidadesBinding;

public class oportunidadesFragment extends Fragment {

    private FragmentOportunidadesBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


            binding = FragmentOportunidadesBinding.inflate(inflater, container, false);
            View root = binding.getRoot();

            binding.btnBolsas.setOnClickListener(v ->
                    Navigation.findNavController(v).navigate(R.id.action_oportunidades_to_bolsas)
            );
        binding.btnEsportes.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_oportunidades_to_esportes)
        );
        binding.btnFeiras.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_oportunidades_to_feiras)
        );
        binding.btnIntercambio.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_oportunidades_to_intercambio)
        );
        binding.btnVisitas.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_oportunidades_to_visitas)
        );
        binding.btnOlimpiadas.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_oportunidades_to_olimpiadas)
        );
        return root;
    }
}