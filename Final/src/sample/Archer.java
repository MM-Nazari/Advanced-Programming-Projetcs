package sample;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */
public class Archer extends Troops{

    Level l = new Level();
    private int level ;
    public Archer(){

        super(1.2,"medium","both","ranged",0,2,3);
        setLevel(l.getXp());
        // range =5
        if(level == 1)
            troops2(125,33);
        if(level == 2)
            troops2(127,44);
        if(level == 3)
            troops2(151,48);
        if(level == 4)
            troops2(166,53);
        if(level == 5)
            troops2(182,58);
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
