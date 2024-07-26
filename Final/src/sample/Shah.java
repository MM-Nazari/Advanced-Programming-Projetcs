package sample;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */
public class Shah {

    Level l = new Level();
    private int level;
    private int hp;
    private int damage;
    private int range = 7;
    private int hitSpeed = 1;

    public Shah() {

        setLevel(l.getXp());
        if (level == 1) {
            this.damage = 50;
            this.hp = 2400;
        }
        if (level == 2) {
            this.damage = 53;
            this.hp = 2568;
        }
        if (level == 3) {
            this.damage = 57;
            this.hp = 2736;
        }
        if (level == 4) {
            this.damage = 60;
            this.hp = 2904;
        }
        if (level == 5) {
            this.damage = 64;
            this.hp = 3096;
        }

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