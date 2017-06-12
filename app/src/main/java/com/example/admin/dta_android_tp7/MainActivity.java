package com.example.admin.dta_android_tp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bouton2 = (Button) findViewById(R.id.button2);
        bouton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("BOUTTON", "Bouton 2");
                Intent intent = new Intent(MainActivity.this, ActivityPage2.class);
                intent.putExtra("param", "Je viens du bouton 2");
                startActivity(intent);
            }
        });

    }

    public void button1(View view) {
        Log.d("BUTTON", "Bouton 1");
        Intent intent = new Intent(MainActivity.this, ActivityPage2.class);
        intent.putExtra("param", "Je viens du bouton 1");
        startActivity(intent);
    }

}
