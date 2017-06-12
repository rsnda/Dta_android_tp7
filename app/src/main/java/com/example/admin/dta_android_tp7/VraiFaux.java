package com.example.admin.dta_android_tp7;

/**
 * Created by admin on 12/06/2017.
 */

public class VraiFaux {

    private String question;

    private String reponse1 = "Vrai";

    private String reponse2 = "Faux";

    private boolean reponse;

    public VraiFaux(String question, boolean reponse) {
        this.question = question;
        this.reponse = reponse;
    }

    public String getQuestion() {
        return question;
    }

    public String getReponse1() {
        return reponse1;
    }

    public String getReponse2() {
        return reponse2;
    }

    public boolean isReponse() {
        return reponse;
    }
}
