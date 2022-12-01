package com.example.androidpagemanagement;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidpagemanagement.databinding.FragmentPageABinding;
import com.example.androidpagemanagement.databinding.FragmentPageBBinding;


public class PageBFragment extends Fragment {

    private FragmentPageBBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPageBBinding.inflate(inflater,container,false);
        binding.buttonPageY.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.goPageY1);
        });


        return binding.getRoot();
    }
}