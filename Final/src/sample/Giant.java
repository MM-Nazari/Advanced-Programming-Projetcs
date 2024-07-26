package sample;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */
public class Giant extends Troops{

    Level l = new Level();
    private int level ;
    public Giant(){

        super(1.5,"slow","ground","melee",0,1,5);
        setLevel(l.getXp());
        if(level == 1)
            troops2(2000,126);
        if(level == 2)
            troops2(2200,138);
        if(level == 3)
            troops2(2420,152);
        if(level == 4)
            troops2(2660,167);
        if(level == 5)
            troops2(2920,183);
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
