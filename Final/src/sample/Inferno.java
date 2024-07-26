package sample;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */
public class Inferno extends Buildings{

    Level l = new Level();
    private int level ;
    public Inferno(){

        super(0.4,"both",6,40,5);
        setLevel(l.getXp());
        if(level==1){
            buildings2(800,20);// 20 - 400

        }

        if(level==2)
            buildings2(880,22);// 22 - 440
        if(level==3)
            buildings2(968,24);// 24 - 484
        if(level==4)
            buildings2(1064,26);// 26 - 532
        if(level==5)
            buildings2(1168,28);// 28 - 584
    }

    // taeene level ba tavajoh be xp
    public void setLevel(int xp){
        xp = l.getXp();
        if(xp <= 300)
            level=1;
        else if(xp<=500)
            level=2;
        else if(xp<=900)
            level =3 ;
        else if(xp<= 1700)
            level =4;
        else
            level=5;
    }


}
