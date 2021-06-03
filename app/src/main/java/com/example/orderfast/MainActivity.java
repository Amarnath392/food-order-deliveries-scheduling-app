package com.example.orderfast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static String orderName;
    public static int preparationTime, delivaryTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void dhaba(View view)
    {
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
}
