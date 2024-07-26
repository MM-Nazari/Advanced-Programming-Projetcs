package sample;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */
public class Valkyrie extends Troops{

    Level l = new Level();
    private int level ;
    public Valkyrie(){

        super(1.5,"medium","ground","melee",1,1,4);
        setLevel(l.getXp());
        // range = 1
        if(level == 1)
            troops2(880,120);
        if(level == 2)
            troops2(968,132);
        if(level == 3)
            troops2(1064,145);
        if(level == 4)
            troops2(1170,159);
        if(level == 5)
            troops2(1284,175);
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
