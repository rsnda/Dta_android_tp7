package com.example.admin.dta_android_tp7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityPage3 extends AppCompatActivity {

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
    }
}
