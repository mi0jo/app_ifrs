package com.example.ifrs_campusrolante.ui.transporte;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ifrs_campusrolante.R;
import com.example.ifrs_campusrolante.databinding.FragmentTransporteBinding;

public class transporteFragment extends Fragment {

    private FragmentTransporteBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentTransporteBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_transporte, container, false);
    }
}