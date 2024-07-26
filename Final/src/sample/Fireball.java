package sample;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */
public class Fireball {

    Level l = new Level();
    private double radius = 2.5;
    private int cost = 4 ;
    private int areaDamage ;
    private int level ;

    public Fireball(){

        setLevel(l.getXp());
        if(level==1)
            areaDamage=325;
        if(level==2)
            areaDamage=357;
        if(level==3)
            areaDamage=393;
        if(level==4)
            areaDamage=432;
        if(level==5)
            areaDamage=474;
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
