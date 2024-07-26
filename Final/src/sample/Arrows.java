package sample;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */
public class Arrows {

    Level l = new Level();
    private double radius = 4;
    private int cost = 3 ;
    private int areaDamage ;
    private int level ;

    public Arrows(){

        setLevel(l.getXp());
        if(level==1)
            areaDamage=144;
        if(level==2)
            areaDamage=156;
        if(level==3)
            areaDamage=174;
        if(level==4)
            areaDamage=189;
        if(level==5)
            areaDamage=210;
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
