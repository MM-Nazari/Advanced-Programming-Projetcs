package sample;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */
public class Cannon extends Buildings{

    Level l = new Level();
    private int level ;

    public Cannon(){

        super(0.8,"ground",5.5,30,6);
        setLevel(l.getXp());
        if(level==1)
            buildings2(380,60);
        if(level==2)
            buildings2(418,66);
        if(level==3)
            buildings2(459,72);
        if(level==4)
            buildings2(505,79);
        if(level==5)
            buildings2(554,87);
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
