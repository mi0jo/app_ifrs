package com.example.ifrs_campusrolante.ui.oportunidades;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ifrs_campusrolante.R;
import com.example.ifrs_campusrolante.databinding.FragmentAdmejaBinding;
import com.example.ifrs_campusrolante.databinding.FragmentEsportesBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link esportesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class esportesFragment extends Fragment {

    private FragmentEsportesBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEsportesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_esportes, container, false);
    }
}