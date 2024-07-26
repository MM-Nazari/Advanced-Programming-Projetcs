package sample;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */
public class Spells {

    private int radius ;
    private int cost ;
    private double duration ;

    public Spells(int radius , int cost){

        this.cost=cost;
        this.radius=radius;
    }

    public void spells2( double duration){

        this.duration=duration;
    }


}
