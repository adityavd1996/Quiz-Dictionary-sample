package com.example.dell.dictnquiz;

/**
 * Created by Dell on 6/28/2016.
 */
public class ClassfileEuro {
    private int ID;
    private String QUESTION;
    private String OPTA;
    private String OPTB;
    private String OPTC;
    private String ANSWER;

    public ClassfileEuro() {
        ID = 0;
        QUESTION = "";
        OPTA = "";
        OPTB = "";
        OPTC = "";
        ANSWER = "";
    }

    public ClassfileEuro(String qUESTION, String oPTA, String oPTB, String oPTC,
                         String aNSWER) {

        QUESTION = qUESTION;
        OPTA = oPTA;
        OPTB = oPTB;
        OPTC = oPTC;
        ANSWER = aNSWER;
    }

    public int getID() {
        return ID;
    }

    public void setID(int id) {
        ID = id;
    }

    public String getQUESTION() {
        return QUESTION;
    }

    public void setQUESTION(String qUESTION) {
        QUESTION = qUESTION;
    }

    public String getOPTA() {
        return OPTA;
    }

    public void setOPTA(String oPTA) {
        OPTA = oPTA;
    }

    public String getOPTB() {
        return OPTB;
    }

    public void setOPTB(String oPTB) {
        OPTB = oPTB;
    }

    public String getOPTC() {
        return OPTC;
    }

    public void setOPTC(String oPTC) {
        OPTC = oPTC;
    }

    public String getANSWER() {
        return ANSWER;
    }

    public void setANSWER(String aNSWER) {
        ANSWER = aNSWER;
    }
}
