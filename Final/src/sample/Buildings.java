package sample;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */
public class Buildings {

    private int hp ;
    private int damage ;
    private double hitSpeed ;
    private String target ;
    private double range ;
    private int lifeTime ;
    private int cost ;

    public Buildings(double hitSpeed ,String target ,double range , int lifeTime , int cost  ){
        this.cost=cost;
        this.lifeTime=lifeTime;
        this.range=range;
        this.target=target;
        this.hitSpeed=hitSpeed;
    }

    public void buildings2(int hp , int damage){

        this.hp=hp;
        this.damage=damage;
    }

    public int getDamage(){
        return damage;
    }
}
