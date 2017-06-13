package com.example.admin.dta_android_tp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityPage3 extends AppCompatActivity {

    int n;
    int res;

    private VraiFaux[] questions = new VraiFaux[]{
            new VraiFaux("Il n’y a pas de faute dans : « Les arborigènes du Canada ont toujours eu un respect sacré pour les arbres. »", false),
            new VraiFaux("Dans l’extrait « au cours de la Seconde Guerre mondiale », les règles de la majuscule sont respectées.", true),
            new VraiFaux("La phrase « le petit caniche de mon voisin aboie sans arrêt » est juste.", false),
            new VraiFaux("La phrase « heureusement, mon téléviseur était encore sur la garantie » est juste.", false),
            new VraiFaux("Les homophones sont corrects dans : « Il va s’en dire que le vampire qui fait attention à sa ligne doit boire du sang sans sucre. »", false),
            new VraiFaux("Le déterminant « le » est bien placé dans : « L’élection a eu lieu dimanche le 3 décembre. »", false),
            new VraiFaux("Le mot cru est bien écrit dans : « J’ai toujours cru qu’il était préférable de manger des tomates crues qui ont crû dans mon potager. »", true),
            new VraiFaux("Cette phrase est juste : « J’en ai ras le bol du ras-le-bol généralisé. »", true),
            new VraiFaux("Il y a une faute grammaticale dans : « Le gouvernement a sabré dans les dépenses en aide sociale. »", true),
            new VraiFaux("Ces phrases ne contiennent pas de faute : « Mon fils est grossier. Il laisse traîner des écailles de noix partout sur le plancher. »", false),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        // Recupere l'intent qui a lancer l'activity ainsi que le resultat actuelle est le nombre de question
        Intent intent = getIntent();
        n = intent.getIntExtra("int", 0);
        res = intent.getIntExtra("res", 0);

        Log.d("NUMERO", "N = " + n);
        Log.d("NUMERO", "res = " + res);


        // Affiche la question dans une tewt view
        TextView editText = ((TextView) findViewById(R.id.textView4));
        editText.setText(questions[n].getQuestion());


        Button bouton2 = (Button) findViewById(R.id.button_false);

        bouton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                * On écoute le bouton faux, si la reponse est juste, on augemente le resultat,
                * sinon on le laisse tel quel
                 */
                Log.d("BOUTTON", "Bouton 2");

                if(n == 9){
                    // si la derniere question a été posé, on lance l'activité de resultat
                    Log.d("BOUTTON", "Bouton 2 IF");
                    Intent intent = new Intent(ActivityPage3.this, ActivityPageResult.class);
                    intent.putExtra("result", res);
                    startActivity(intent);
                    return;
                }

                Intent intent = new Intent(ActivityPage3.this, ActivityPage3.class);

                intent.putExtra("int", n + 1);
                if (!questions[n].isReponse()){
                    intent.putExtra("res", res + 1);
                }else {
                    intent.putExtra("res", res);
                }
                startActivity(intent);
            }

        });
    }

    public void button_true(View view) {
        /*
                * On écoute le bouton vrai, si la reponse est juste, on augemente le resultat,
                * sinon on le laisse tel quel
                 */
        Log.d("BUTTON", "Bouton 1");

        if(n == 9){
            // si la derniere question a été posé, on lance l'activité de resultat
            Log.d("BOUTTON", "Bouton 1 IF");
            Intent intent = new Intent(ActivityPage3.this, ActivityPageResult.class);
            intent.putExtra("result", res);
            startActivity(intent);
            return;
        }

        Intent intent = new Intent(ActivityPage3.this, ActivityPage3.class);
        intent.putExtra("int", n + 1);

        if (questions[n].isReponse()){
            intent.putExtra("res", res + 1);
        }else {
            intent.putExtra("res", res);
        }

        startActivity(intent);
    }
}