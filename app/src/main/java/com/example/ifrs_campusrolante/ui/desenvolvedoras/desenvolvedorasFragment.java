package com.example.ifrs_campusrolante.ui.desenvolvedoras;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ifrs_campusrolante.R;
import com.example.ifrs_campusrolante.databinding.FragmentCursosBinding;
import com.example.ifrs_campusrolante.databinding.FragmentDesenvolvedorasBinding;


public class desenvolvedorasFragment extends Fragment {
    private FragmentDesenvolvedorasBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentDesenvolvedorasBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_desenvolvedoras, container, false);
    }

}