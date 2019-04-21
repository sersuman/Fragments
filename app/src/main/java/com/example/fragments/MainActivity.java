package com.example.fragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fragment.First_Fragment;
import fragment.Second_Fragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnLoadFragment;
    private boolean status = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadFragment = findViewById(R.id.btnLoadFragment);
        btnLoadFragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnLoadFragment){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            if (status){
                First_Fragment first_fragment = new First_Fragment();
                fragmentTransaction.replace(R.id.fragmentContainer, first_fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                btnLoadFragment.setText("Load second fragment");
                status=false;

            }else {
                Second_Fragment second_fragment = new Second_Fragment();
                fragmentTransaction.replace(R.id.fragmentContainer, second_fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                btnLoadFragment.setText("load first fragment");
                status= true;
            }

        }
    }
}
