package com.example.ifrs_campusrolante.ui.oportunidades;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ifrs_campusrolante.R;
import com.example.ifrs_campusrolante.databinding.FragmentAdmejaBinding;
import com.example.ifrs_campusrolante.databinding.FragmentBolsasBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link bolsasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class bolsasFragment extends Fragment {

    private FragmentBolsasBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBolsasBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.btnPesquisa.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_bolsas_to_pesquisa)
        );
        binding.btnEnsino.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_bolsas_to_ensino)
        );
        binding.btnExtensao.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_bolsas_to_extensao)
        );
        binding.btnIndissociaveis.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_bolsas_to_indissociaveis)
        );
        return root;
    }

}