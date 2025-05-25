package com.example.ifrs_campusrolante.ui.redes;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ifrs_campusrolante.R;
import com.example.ifrs_campusrolante.databinding.FragmentCursosBinding;
import com.example.ifrs_campusrolante.databinding.FragmentRedesBinding;


public class redesFragment extends Fragment {

    private FragmentRedesBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentRedesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_redes, container, false);
    }
}