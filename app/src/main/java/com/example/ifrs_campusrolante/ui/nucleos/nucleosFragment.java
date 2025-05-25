package com.example.ifrs_campusrolante.ui.nucleos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ifrs_campusrolante.R;
import com.example.ifrs_campusrolante.databinding.FragmentInscricaoBinding;
import com.example.ifrs_campusrolante.databinding.FragmentNucleosBinding;
import com.example.ifrs_campusrolante.databinding.FragmentOportunidadesBinding;


public class nucleosFragment extends Fragment {


    private FragmentNucleosBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        binding = FragmentNucleosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.btnNumen.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_nucleos_to_numen)
        );
        binding.btnNapne.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_nucleos_to_napne)
        );
        binding.btnNepgs.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_nucleos_to_nepgs)
        );
        binding.btnNeabi.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_nucleos_to_neabi)
        );
        return root;
    }
}
