package sample;

// ketabkhane ha
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */

//implement kardan baraye enteghal bein safhe ast
public class BattleController implements Initializable {
    // sakhte file baraye negahdarie nataiej
    String name = " battle " ;
    // shey az kelass fileutils baraye kar ba file
    FileUtils file = new FileUtils();
    // sakhte shey az elixir
    // va hamchenin baraye progressbar
    Elixir elixir = new Elixir();
    // building ha
    Shah shah = new Shah();
    ShahDokht shahdokht1 = new ShahDokht();
    ShahDokht shahdokht2 = new ShahDokht();
    // baraye akse deck
    DeckController deck = new DeckController();



    @FXML
    private Label battleLabel1 ;

    @FXML
    private Label battleLabel2 ;

    @FXML
    private Label progressbarLabel ;

    @FXML
    private TextField scoreTextField1 ;

    @FXML
    private TextField scoreTextField2 ;

    @FXML
    private ProgressBar battleProgressbar ;

    @FXML
    private ComboBox<Integer> minuteTimer ;

    @FXML
    private ComboBox<Integer> secondTimer ;

    @FXML
    private ImageView battleImage1 ;

    @FXML
    private ImageView battleImage2 ;

    @FXML
    private ImageView battleImage3 ;

    @FXML
    private ImageView battleImage4 ;

    @FXML
    private ImageView battleImage5 ;


    //code haye anjam bazi

   public void main(String[] args){
       file.fileWriter(name,battleLabel1.getText());
       file.fileWriter(name,scoreTextField1.getText());
       file.fileWriter(name,scoreTextField2.getText());
       file.fileWriter(name,battleLabel2.getText());
   }

    // estefade az kelas haye timer va timer task baraye gozashtane timer dar bazi
    Timer timer = new Timer() ;
    TimerTask task = new TimerTask() {
        @Override
        public void run() {

        }
    };

    public void start(){

        for(int k =2 ; k>=0 ; k--) {
            for (int i = 59; i >= 0; i--) {
                if(k>=1){
                    elixir.start();
                    timer.scheduleAtFixedRate(task, 1000, 0);
                    minuteTimer.setAccessibleText("0"+ k);
                    if(i>=10)
                        secondTimer.setAccessibleText(""+i);
                    else
                        secondTimer.setAccessibleText("0"+i);
                }
                else {
                    elixir.start2();
                    timer.scheduleAtFixedRate(task, 1000, 0);
                    minuteTimer.setAccessibleText("0"+ k);
                    if(i>=10)
                        secondTimer.setAccessibleText(""+i);
                    else
                        secondTimer.setAccessibleText("0"+i);
                }



            }
        }

    }
    @Override
    // az youtube didam kare daghighesho nemidoonam baraye enteghale beine safhe ast
    public void initialize(URL ur, ResourceBundle rb){}

    public void setBattleImage1(){
        // baraye 5 ta aks boodan
        int x =0 ;
        while(x<5){
            if (!file.fileReader("deck","wizard")){
                battleImage1= deck.getWizardImage();
                x++;
            }
            if (!file.fileReader("deck","archer")){
                battleImage1= deck.getArcherImage();
                x++;
            }
            if (!file.fileReader("deck","arrows")){
                battleImage1= deck.getArrowsImage();
                x++;
            }
            if (!file.fileReader("deck","cannon")){
                battleImage1= deck.getCannonImage();
                x++;
            }
            if (!file.fileReader("deck","inferno")){
                battleImage1= deck.getInfernoImage();
                x++;
            } if (!file.fileReader("deck","rage")){
                battleImage1= deck.getRageImage();
                x++;
            } if (!file.fileReader("deck","giant")){
                battleImage1= deck.getGiantImage();
                x++;
            } if (!file.fileReader("deck","fireball")){
                battleImage1= deck.getFireballImage();
                x++;
            } if (!file.fileReader("deck","pekka")){
                battleImage1= deck.getPekkaImage();
                x++;
            } if (!file.fileReader("deck","dragon")){
                battleImage1= deck.getDragonImage();
                x++;
            } if (!file.fileReader("deck","barbar")){
                battleImage1= deck.getBarbarImage();
                x++;
            } if (!file.fileReader("deck","valkyrie")){
                battleImage1= deck.getValkyrieImage();
                x++;
            }

        }


    }
    public void setBattleImage2(){
        // baraye 5 ta aks boodan
        int x =0 ;
        while(x<5){
            if (!file.fileReader("deck","wizard")){
                battleImage2= deck.getWizardImage();
                x++;
            }
            if (!file.fileReader("deck","archer")){
                battleImage2= deck.getArcherImage();
                x++;
            }
            if (!file.fileReader("deck","arrows")){
                battleImage2= deck.getArrowsImage();
                x++;
            }
            if (!file.fileReader("deck","cannon")){
                battleImage2= deck.getCannonImage();
                x++;
            }
            if (!file.fileReader("deck","inferno")){
                battleImage2= deck.getInfernoImage();
                x++;
            } if (!file.fileReader("deck","rage")){
                battleImage2= deck.getRageImage();
                x++;
            } if (!file.fileReader("deck","giant")){
                battleImage2= deck.getGiantImage();
                x++;
            } if (!file.fileReader("deck","fireball")){
                battleImage2= deck.getFireballImage();
                x++;
            } if (!file.fileReader("deck","pekka")){
                battleImage2= deck.getPekkaImage();
                x++;
            } if (!file.fileReader("deck","dragon")){
                battleImage2= deck.getDragonImage();
                x++;
            } if (!file.fileReader("deck","barbar")){
                battleImage2= deck.getBarbarImage();
                x++;
            } if (!file.fileReader("deck","valkyrie")){
                battleImage2= deck.getValkyrieImage();
                x++;
            }

        }


    }
    public void setBattleImage3(){
        // baraye 5 ta aks boodan
        int x =0 ;
        while(x<5){
            if (!file.fileReader("deck","wizard")){
                battleImage3= deck.getWizardImage();
                x++;
            }
            if (!file.fileReader("deck","archer")){
                battleImage3= deck.getArcherImage();
                x++;
            }
            if (!file.fileReader("deck","arrows")){
                battleImage3= deck.getArrowsImage();
                x++;
            }
            if (!file.fileReader("deck","cannon")){
                battleImage3= deck.getCannonImage();
                x++;
            }
            if (!file.fileReader("deck","inferno")){
                battleImage3= deck.getInfernoImage();
                x++;
            } if (!file.fileReader("deck","rage")){
                battleImage3= deck.getRageImage();
                x++;
            } if (!file.fileReader("deck","giant")){
                battleImage3= deck.getGiantImage();
                x++;
            } if (!file.fileReader("deck","fireball")){
                battleImage3
                        = deck.getFireballImage();
                x++;
            } if (!file.fileReader("deck","pekka")){
                battleImage3= deck.getPekkaImage();
                x++;
            } if (!file.fileReader("deck","dragon")){
                battleImage3= deck.getDragonImage();
                x++;
            } if (!file.fileReader("deck","barbar")){
                battleImage3= deck.getBarbarImage();
                x++;
            } if (!file.fileReader("deck","valkyrie")){
                battleImage3= deck.getValkyrieImage();
                x++;
            }

        }


    }
    public void setBattleImage4(){
        // baraye 5 ta aks boodan
        int x =0 ;
        while(x<5){
            if (!file.fileReader("deck","wizard")){
                battleImage4= deck.getWizardImage();
                x++;
            }
            if (!file.fileReader("deck","archer")){
                battleImage4= deck.getArcherImage();
                x++;
            }
            if (!file.fileReader("deck","arrows")){
                battleImage4= deck.getArrowsImage();
                x++;
            }
            if (!file.fileReader("deck","cannon")){
                battleImage4= deck.getCannonImage();
                x++;
            }
            if (!file.fileReader("deck","inferno")){
                battleImage4= deck.getInfernoImage();
                x++;
            } if (!file.fileReader("deck","rage")){
                battleImage4= deck.getRageImage();
                x++;
            } if (!file.fileReader("deck","giant")){
                battleImage4= deck.getGiantImage();
                x++;
            } if (!file.fileReader("deck","fireball")){
                battleImage4= deck.getFireballImage();
                x++;
            } if (!file.fileReader("deck","pekka")){
                battleImage4= deck.getPekkaImage();
                x++;
            } if (!file.fileReader("deck","dragon")){
                battleImage4= deck.getDragonImage();
                x++;
            } if (!file.fileReader("deck","barbar")){
                battleImage4= deck.getBarbarImage();
                x++;
            } if (!file.fileReader("deck","valkyrie")){
                battleImage4= deck.getValkyrieImage();
                x++;
            }

        }


    }
    public void setBattleImage5(){
        // baraye 5 ta aks boodan
        int x =0 ;
        while(x<5){
            if (!file.fileReader("deck","wizard")){
                battleImage5= deck.getWizardImage();
                x++;
            }
            if (!file.fileReader("deck","archer")){
                battleImage5= deck.getArcherImage();
                x++;
            }
            if (!file.fileReader("deck","arrows")){
                battleImage5= deck.getArrowsImage();
                x++;
            }
            if (!file.fileReader("deck","cannon")){
                battleImage5= deck.getCannonImage();
                x++;
            }
            if (!file.fileReader("deck","inferno")){
                battleImage5= deck.getInfernoImage();
                x++;
            } if (!file.fileReader("deck","rage")){
                battleImage5= deck.getRageImage();
                x++;
            } if (!file.fileReader("deck","giant")){
                battleImage5= deck.getGiantImage();
                x++;
            } if (!file.fileReader("deck","fireball")){
                battleImage5= deck.getFireballImage();
                x++;
            } if (!file.fileReader("deck","pekka")){
                battleImage5= deck.getPekkaImage();
                x++;
            } if (!file.fileReader("deck","dragon")){
                battleImage5= deck.getDragonImage();
                x++;
            } if (!file.fileReader("deck","barbar")){
                battleImage5= deck.getBarbarImage();
                x++;
            } if (!file.fileReader("deck","valkyrie")){
                battleImage5= deck.getValkyrieImage();
                x++;
            }

        }


    }

    public void setBattleProgressbar(){
      // ProgressBar progressBar = new ProgressBar(elixir.getElixir());
        battleProgressbar.setProgress(elixir.getElixir());

    }



}
