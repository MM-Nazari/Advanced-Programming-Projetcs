package sample;


/**
 *
 * @author MMNazari1380
 * @version 1.0
 */
public class Troops {

    private int hp ;
    private int damage ;
    private double hitSpeed ;
    // slow / medium / fast
    private String speed ;
    // ground / air / both
    private String target ;
    // melee / ranged
    private String range ;
    // 0 / 1
    private int areaSplash ;
    private int count ;
    private int cost ;



    public Troops( double hitSpeed , String speed , String target , String range , int areaSplash,int count , int cost){

        this.hitSpeed=hitSpeed;
        this.speed=speed;
        this.target=target;
        this.range=range ;
        this.areaSplash=areaSplash;
        this.count=count;
        this.cost=cost ;

    }

    public void troops2(int hp , int damage){

        this.hp=hp;
        this.damage=damage;
    }



}
