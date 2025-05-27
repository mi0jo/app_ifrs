package com.example.ifrs_campusrolante.ui.bolsas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ifrs_campusrolante.R;
import com.example.ifrs_campusrolante.databinding.FragmentEnsinoBinding;
import com.example.ifrs_campusrolante.databinding.FragmentIndissociaveisBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ensinoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ensinoFragment extends Fragment {

    private FragmentEnsinoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEnsinoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ensino, container, false);
    }
}