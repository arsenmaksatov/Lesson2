package com.example.lesson14.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.lesson14.R;
import com.example.lesson14.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {
    FragmentFirstBinding binding;
    Animation AnimationFr;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        AnimationFr = AnimationUtils.loadAnimation(requireContext(), R.anim.start_nim);
        binding.firstFragment.setAnimation(AnimationFr);
        data();
    }

    private void data() {
        binding.btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                    }
                }, 3000);
                SecondFragment secondFragment = new SecondFragment();
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.container_fragment,secondFragment).commit();
            }
        });
    }
}