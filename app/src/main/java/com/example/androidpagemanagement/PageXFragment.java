package com.example.androidpagemanagement;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidpagemanagement.databinding.FragmentPageXBinding;


public class PageXFragment extends Fragment {
    private FragmentPageXBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPageXBinding.inflate(inflater,container,false);
        binding.buttonPageY2.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.goPageY2);
        });
        return binding.getRoot();
    }
}