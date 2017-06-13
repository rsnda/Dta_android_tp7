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

        // Recupere l'intent qui a lancer l'activity ainsi que le résultat
        Intent intent = getIntent();
        int result = intent.getIntExtra("result", 0);

        // Affiche le résultat dans une textWiew
        TextView editText = ((TextView) findViewById(R.id.twResult));
        editText.setText("Votre résultat est de " + result + "/10 !");
    }
}
