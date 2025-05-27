package com.example.ifrs_campusrolante.ui.bolsas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ifrs_campusrolante.R;
import com.example.ifrs_campusrolante.databinding.FragmentIndissociaveisBinding;
import com.example.ifrs_campusrolante.databinding.FragmentPesquisaBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link pesquisaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class pesquisaFragment extends Fragment {
    private FragmentPesquisaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPesquisaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pesquisa, container, false);
    }
}