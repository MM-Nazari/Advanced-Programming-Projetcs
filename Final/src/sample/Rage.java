package sample;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */
public class Rage extends Spells{

    Level l = new Level();
    private int level ;
    public Rage(){

        super(5,3);
        setLevel(l.getXp());
        if(level == 1)
           spells2(6);
        if(level == 2)
           spells2(6.5);
        if(level == 3)
           spells2(7);
        if(level == 4)
           spells2(7.5);
        if(level == 5)
           spells2(8);
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
    // karkarde spell
    public void spell(int damage , int hitSpeed , int speed){
        damage *= 1.4 ;
        speed *= 1.4 ;
        hitSpeed *= 1.4 ;
    }
}
