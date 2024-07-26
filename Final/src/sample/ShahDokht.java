package sample;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */
public class ShahDokht {

    Level l = new Level();
    private int level;
    private int hp;
    private int damage;
    private double range = 7.5;
    private double hitSpeed = 0.8;

    public ShahDokht() {

        setLevel(l.getXp());
        if (level == 1) {
            this.damage = 50;
            this.hp = 1400;
        }
        if (level == 2) {
            this.damage = 54;
            this.hp = 1512;
        }
        if (level == 3) {
            this.damage = 58;
            this.hp = 1624;
        }
        if (level == 4) {
            this.damage = 62;
            this.hp = 1750;
        }
        if (level == 5) {
            this.damage = 69;
            this.hp = 1890;
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
