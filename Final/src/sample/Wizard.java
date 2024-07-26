package sample;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */
public class Wizard extends Troops{

    Level l = new Level();
    private int level ;
    public Wizard(){

        super(1.7,"medium","both","ranged",1,1,5);
        setLevel(l.getXp());
        // range =5
        if(level == 1)
            troops2(340,130);
        if(level == 2)
            troops2(374,143);
        if(level == 3)
            troops2(411,157);
        if(level == 4)
            troops2(452,172);
        if(level == 5)
            troops2(496,189);
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
