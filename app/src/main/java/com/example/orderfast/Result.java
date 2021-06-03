
package com.example.orderfast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView t1;
    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        extras = getIntent().getExtras();
        int []receive = extras.getIntArray("result");
        String []names = extras.getStringArray("name");
        int z = receive.length;
        t1= (TextView)findViewById(R.id.R1);
        //t2= (TextView)findViewById(R.id.R2);
        //t3= (TextView)findViewById(R.id.R3);
        //t4= (TextView)findViewById(R.id.R4);
        //t5= (TextView)findViewById(R.id.R5);
        t1.setText("\n\n");

        for(int i=0;i<z;i++)
        {
            t1.setText(t1.getText().toString()+"\t\t\t\t\t"+"Receiving Time of "+names[i]+" order is "+receive[i]+" Minutes\n\n");
        }



    }


}
