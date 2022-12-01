package com.example.androidpagemanagement;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidpagemanagement.databinding.FragmentPageABinding;


public class PageAFragment extends Fragment {

    private FragmentPageABinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPageABinding.inflate(inflater,container,false);
        binding.buttonPageB.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.goPageB);
        });
        return binding.getRoot();
    }
}