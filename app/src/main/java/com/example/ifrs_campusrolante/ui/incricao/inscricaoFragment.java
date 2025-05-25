package com.example.ifrs_campusrolante.ui.incricao;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ifrs_campusrolante.R;

import com.example.ifrs_campusrolante.databinding.FragmentInscricaoBinding;


public class inscricaoFragment extends Fragment {
    private FragmentInscricaoBinding binding;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentInscricaoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inscricao, container, false);
    }
}