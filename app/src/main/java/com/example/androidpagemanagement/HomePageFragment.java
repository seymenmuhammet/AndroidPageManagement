package com.example.androidpagemanagement;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidpagemanagement.databinding.FragmentHomePageBinding;


public class HomePageFragment extends Fragment {

    private FragmentHomePageBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomePageBinding.inflate(inflater,container,false);
        binding.buttonPageA.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.goPageA);
        });

        binding.buttonPageX.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.goPageX);
        });

        return binding.getRoot();
    }
}