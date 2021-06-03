 package com.example.orderfast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;


 public class Location extends AppCompatActivity {
    public static int deliveryTime;
     CharSequence text = "Your order is confirmed";
     int t = Toast.LENGTH_SHORT;
    Intent intent;
     public  static ArrayList<delivaries> delivaries = new ArrayList<>();
     public  static ArrayList<order> orders = new ArrayList<>();

    public static int n=0;
   // public order []ob ;
    //public  delivaries []ob2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);




    }
    public void clickNewTower(View view)
    {
        deliveryTime=7;
        //deliveryTime= deliveryTime*2;
       // CharSequence text = "Your order is confirmed";
       // ob[n]= new order(Menu.orderName,Menu.preparationTime);
       // ob2[n]= new delivaries(deliveryTime);
        orders.add(new order(Menu.orderName,Menu.preparationTime) );
        delivaries.add(new delivaries(deliveryTime));
        n=n+1;
        Toast toast = Toast.makeText(this,text,t);
        toast.show();

    }
    public void clickOldTower(View view)
    {
        deliveryTime=10;
        //deliveryTime= deliveryTime*2;
       // ob[n]= new order(Menu.orderName,Menu.preparationTime);
      //  ob2[n]= new delivaries(deliveryTime);
        orders.add(new order(Menu.orderName,Menu.preparationTime) );
        delivaries.add(new delivaries(deliveryTime));

        n=n+1;
        Toast toast = Toast.makeText(this,text,t);
        toast.show();



    }
    public void clickGirlsHostel(View view)
    {

       deliveryTime = 12;
        //deliveryTime= deliveryTime*2;
        //ob[n]= new order(Menu.orderName,Menu.preparationTime);
        //ob2[n]= new delivaries(deliveryTime);
        orders.add(new order(Menu.orderName,Menu.preparationTime) );
        delivaries.add(new delivaries(deliveryTime));
        n=n+1;
        Toast toast = Toast.makeText(this,text,t);
        toast.show();
    }
    public void clickApartmant(View view)
    {
        deliveryTime = 14;
        //deliveryTime= deliveryTime*2;
        //ob[n]= new order(Menu.orderName,Menu.preparationTime);
        //ob2[n]= new delivaries(deliveryTime);
        orders.add(new order(Menu.orderName,Menu.preparationTime) );
        delivaries.add(new delivaries(deliveryTime));
        n=n+1;
        Toast toast = Toast.makeText(this,text,t);
        toast.show();

    }

    public void getResult(View view)
    {
       int []result= OrderDelivary.calculate();
       String []orderName= new String[n];
       for(int k=0;k<n;k++)
       {
           orderName[k]=orders.get(k).orderName1;
       }

        intent = new Intent(this,Result.class);
        intent.putExtra("result",result);
        intent.putExtra("name",orderName);
        startActivity(intent);
    }
    public void clickBack(View view)
    {
        intent = new Intent(this,Menu.class);

        startActivity(intent);
    }

}
