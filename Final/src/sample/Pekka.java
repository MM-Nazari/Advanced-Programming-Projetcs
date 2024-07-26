package sample;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */
public class Pekka extends Troops{

    Level l = new Level();
    private int level ;
    public Pekka(){

        super(1.8,"fast","ground","melee",0,1,4);
        setLevel(l.getXp());
        if(level == 1)
            troops2(600,325);
        if(level == 2)
            troops2(660,357);
        if(level == 3)
            troops2(726,393);
        if(level == 4)
            troops2(798,432);
        if(level == 5)
            troops2(876,474);
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
