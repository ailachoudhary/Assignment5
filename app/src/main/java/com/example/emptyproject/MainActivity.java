package com.example.emptyproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.emptyproject.databinding.MainActivityLayoutBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    MainActivityLayoutBinding mainActivityLayoutBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivityLayoutBinding = MainActivityLayoutBinding.inflate(getLayoutInflater());
        setContentView(mainActivityLayoutBinding.getRoot());


        mainActivityLayoutBinding.btnLogin.setOnClickListener(this);
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
        if (view == mainActivityLayoutBinding.btnLogin){
            String username = mainActivityLayoutBinding.username.getText().toString();
            String password = mainActivityLayoutBinding.password.getText().toString();

            if (validateUsername(username)){
                if (validatePassword(password)){
                    Intent intent = new Intent(this, ProfileActivity.class);
                    startActivity(intent);
                }else {
                    mainActivityLayoutBinding.password.setError("The password is invalid!");
                }
            }else {
                mainActivityLayoutBinding.username.setError("Username is invalid!");
            }


        }
    }

    private boolean validateUsername(String username){
        if (username.isEmpty())
            return false;
        else if (!username.contains("@"))
            return false;
        else if (username.contains("\""))
            return false;

        return  true;
    }

    private boolean validatePassword(String password){
        if (password.isEmpty())
            return false;
        else if(password.length() <= 6)
            return false;

        return true;
    }
}
