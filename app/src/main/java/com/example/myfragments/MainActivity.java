package com.example.myfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button android, java, kotlin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android = findViewById(R.id.android);
        java = findViewById(R.id.java);
        kotlin = findViewById(R.id.kotlin);


        java.setOnClickListener(this);
        android.setOnClickListener(this);
        kotlin.setOnClickListener(this);

//        android.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AndroidFragment androidFragment= new AndroidFragment();
//                FragmentManager fragmentManager = getSupportFragmentManager();
//                fragmentManager.beginTransaction().replace(R.id.layout,androidFragment,androidFragment.getTag()).commit();
//            }
//        });
//

        kotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.android:
                AndroidFragment androidFragment= new AndroidFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.layout,androidFragment,androidFragment.getTag()).commit();

            break;

            case R.id.java:
                JavaFragment javaFragment = new JavaFragment();
                FragmentManager fragmentManager1 = getSupportFragmentManager();
                fragmentManager1.beginTransaction().replace(R.id.layout,javaFragment,javaFragment.getTag()).commit();
                break;

            case R.id.kotlin:
                KotlinFragment kotlinFragment = new KotlinFragment();
                FragmentManager fragmentManager2  = getSupportFragmentManager();
                fragmentManager2.beginTransaction().replace(R.id.layout,kotlinFragment,kotlinFragment.getTag()).commit();
                break;

    }
}
}
