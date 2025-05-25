package com.example.ifrs_campusrolante.ui.nucleos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ifrs_campusrolante.R;
import com.example.ifrs_campusrolante.databinding.FragmentAdmejaBinding;
import com.example.ifrs_campusrolante.databinding.FragmentNeabiBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link neabiFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class neabiFragment extends Fragment {

    private FragmentNeabiBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNeabiBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_neabi, container, false);
    }
}