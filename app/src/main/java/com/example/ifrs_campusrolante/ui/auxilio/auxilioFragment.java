package com.example.ifrs_campusrolante.ui.auxilio;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ifrs_campusrolante.R;
import com.example.ifrs_campusrolante.databinding.FragmentAuxilioBinding;
import com.example.ifrs_campusrolante.databinding.FragmentPesquisaBinding;

public class auxilioFragment extends Fragment {
    private FragmentAuxilioBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAuxilioBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_auxilio, container, false);
    }
}