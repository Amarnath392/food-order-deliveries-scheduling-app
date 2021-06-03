package com.example.orderfast;

import android.content.Intent;
import android.os.Bundle;

//import com.google.android.material.floatingactionbutton.FloatingActionButton;
//import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class Menu extends AppCompatActivity {
    public static String orderName;
    public static int preparationTime ;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


    }
    public void clickChicken(View view)
    {
        orderName="TawaPaneer";
        preparationTime=18;
        intent = new Intent(this,Location.class);
        startActivity(intent);
    }
    public void clickFriedRice(View view)
    {
        orderName="ChickenSukka";
        preparationTime=15;
        intent = new Intent(this,Location.class);
        startActivity(intent);
    }
    public void clickPizza(View view)
    {
        orderName="PrawnBalls";
        preparationTime=10;
        intent = new Intent(this,Location.class);
        startActivity(intent);
    }
    public void clickFrenchFries(View view)
    {
        orderName="ChickenFry";
        preparationTime=13;
        intent = new Intent(this,Location.class);
        startActivity(intent);
    }
    public void clickNoodles(View view)
    {
        orderName="MasalaMacaroni";
        preparationTime=18;
        intent = new Intent(this,Location.class);
        startActivity(intent);
    }
    public void clickCrispy(View view)
    {
        orderName="CrispyChicken";
        preparationTime=20;
        intent = new Intent(this,Location.class);
        startActivity(intent);
    }
    public void clickPaneer(View view)
    {
        orderName="PaneerPopcorn";
        preparationTime=25;
        intent = new Intent(this,Location.class);
        startActivity(intent);
    }



}
