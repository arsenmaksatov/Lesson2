package com.example.lesson14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lesson14.Fragments.FirstFragment;
import com.example.lesson14.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container_fragment, FirstFragment.class,null).commit();

        }

    }
}