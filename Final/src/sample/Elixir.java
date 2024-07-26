package sample;

// ketabkhane ha
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */
public class Elixir {

    private int elixir = 4;

    // estefade az kelas haye timer va timer task baraye gozashtane timer rooye elixir
    Timer timer = new Timer() ;
    TimerTask task = new TimerTask() {
        @Override
        public void run() {

        }
    };

    // baraye afzoodane elixir dar 2daghighe avval
    public void start(){

        while (elixir<=10){
            timer.scheduleAtFixedRate(task,0,2000);
            elixir++;
        }

    }
    // baraye afzoodane elixir dar daghighe akhar

    public void start2(){

        while (elixir<=10){
            timer.scheduleAtFixedRate(task,0,1000);
            elixir++;
        }

    }


    public int getElixir(){
        return elixir;
    }


}
