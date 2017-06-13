package com.example.admin.dta_android_tp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityPageResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_result);

        Intent intent = getIntent();
        int result = intent.getIntExtra("result", 0);


        TextView editText = ((TextView) findViewById(R.id.twResult));
        editText.setText("Votre résultat est de " + result + "/10 !");
    }
}
