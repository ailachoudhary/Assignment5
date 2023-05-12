package com.example.emptyproject;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.emptyproject.databinding.MainActivityLayoutBinding;
import com.example.emptyproject.databinding.ProfileActivityLayoutBinding;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {


    ProfileActivityLayoutBinding profileActivityLayoutBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        profileActivityLayoutBinding = ProfileActivityLayoutBinding.inflate(getLayoutInflater());
        setContentView(profileActivityLayoutBinding.getRoot());

        profileActivityLayoutBinding.btnBack.setOnClickListener(this);

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    @Override
    public void onClick(View view) {
        if (view == profileActivityLayoutBinding.btnBack)
        {
            onBackPressed();
        }
    }
}
