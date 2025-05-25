package com.example.ifrs_campusrolante.ui.cursos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ifrs_campusrolante.R;
import com.example.ifrs_campusrolante.databinding.FragmentAdmBinding;
import com.example.ifrs_campusrolante.databinding.FragmentAdsBinding;


public class adsFragment extends Fragment {
    private FragmentAdsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAdsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ads, container, false);
    }
}