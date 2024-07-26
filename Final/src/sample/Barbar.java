package sample;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */
public class Barbar extends Troops {

    Level l = new Level();
    private int level ;
    public Barbar(){

        super(1.5,"medium","ground","melee",0,4,5);
        setLevel(l.getXp());
        if(level == 1)
            troops2(300,75);
        if(level == 2)
            troops2(330,82);
        if(level == 3)
            troops2(363,90);
        if(level == 4)
            troops2(438,99);
        if(level == 5)
            troops2(480,109);
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
