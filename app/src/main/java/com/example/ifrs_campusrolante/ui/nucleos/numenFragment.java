package com.example.ifrs_campusrolante.ui.nucleos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ifrs_campusrolante.R;
import com.example.ifrs_campusrolante.databinding.FragmentAdmejaBinding;
import com.example.ifrs_campusrolante.databinding.FragmentNumenBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link numenFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class numenFragment extends Fragment {
    private FragmentNumenBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNumenBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_numen, container, false);
    }
}