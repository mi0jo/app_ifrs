package com.example.ifrs_campusrolante.ui.cursos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ifrs_campusrolante.R;
import com.example.ifrs_campusrolante.databinding.FragmentCursosBinding;


public class cursosFragment extends Fragment {

    private FragmentCursosBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentCursosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.btnAdm.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_cursos_to_adm)
        );
        binding.btnAdmeja.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_cursos_to_admeja)
        );
        binding.btnAds.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_cursos_to_ads)
        );
        binding.btnAgro.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_cursos_to_agro)
        );
        binding.btnComercio.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_cursos_to_comercio)
        );
        binding.btnInfo.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_cursos_to_info)
        );
        binding.btnTpg.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_cursos_to_tpg)
        );
        return root;
    }
}

