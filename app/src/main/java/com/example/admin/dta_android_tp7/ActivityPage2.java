package com.example.admin.dta_android_tp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityPage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        Intent intent = getIntent();
        String texte = intent.getStringExtra("param");

        TextView editText = ((TextView) findViewById(R.id.textView2));
        editText.setText(texte);
        Button bouton2 = (Button) findViewById(R.id.button_false2);
        bouton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("BOUTTON", "Bouton 2");
                Intent intent = new Intent(ActivityPage2.this, ActivityPage3.class);
                intent.putExtra("param", getString(R.string.textButton2));
                startActivity(intent);
            }
        });

    }

    public void button_true2(View view) {
        Log.d("BUTTON", "Bouton 1");
        Intent intent = new Intent(ActivityPage2.this, ActivityPage3.class);
        intent.putExtra("param", "sds");
        startActivity(intent);
    }


}
