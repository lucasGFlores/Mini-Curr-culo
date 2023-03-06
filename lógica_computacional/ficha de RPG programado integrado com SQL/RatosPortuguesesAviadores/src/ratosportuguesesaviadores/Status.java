/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratosportuguesesaviadores;

/**
 *
 * @author lucas_g_flores
 */
public class Status {
    int id, cha,sab,inte,dex,str,cons;

    public Status(int id,int cha, int sab, int inte, int dex, int str, int cons) {
        this.id = id;
        this.cha = cha;
        this.sab = sab;
        this.inte = inte;
        this.dex = dex;
        this.str = str;
        this.cons = cons;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getCha() {
        return cha;
    }

    public void setCha(int cha) {
        this.cha = cha;
    }

    public int getSab() {
        return sab;
    }

    public void setSab(int sab) {
        this.sab = sab;
    }

    public int getInte() {
        return inte;
    }

    public void setInte(int inte) {
        this.inte = inte;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getCons() {
        return cons;
    }

    public void setCons(int cons) {
        this.cons = cons;
    }
    
}
