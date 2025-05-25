package com.example.ifrs_campusrolante.ui.rolante;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ifrs_campusrolante.R;
import com.example.ifrs_campusrolante.databinding.FragmentCursosBinding;
import com.example.ifrs_campusrolante.databinding.FragmentRolanteBinding;


public class rolanteFragment extends Fragment {

    private FragmentRolanteBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentRolanteBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rolante, container, false);
    }
}