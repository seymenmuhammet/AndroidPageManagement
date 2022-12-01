package com.example.androidpagemanagement;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidpagemanagement.databinding.FragmentPageYBinding;

public class PageYFragment extends Fragment {
    private FragmentPageYBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPageYBinding.inflate(inflater,container,false);
        binding.buttonPageHome.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.goPageHome);

        });
        return binding.getRoot();
    }
}