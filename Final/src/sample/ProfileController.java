package sample;

// ketabkhane ha
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */

//implement kardan baraye enteghal bein safhe ast
public class ProfileController implements Initializable {

    private int level;
    //file deck baraye namaiesh battle deck
    String name = " deck " ;
    // sakhte shey az kelas fileutils baraye kar ba file
    FileUtils file = new FileUtils();
    Level l = new Level();

    @FXML
    private TextField levelTextField ;
    @FXML
    private ListView<String> deckListView ;

    public void main(String[] args){

        file.filePrinter(name);
        deckListView.setAccessibleText(file.filePrinter(name));
        levelTextField.setText(""+ getLevel());
    }

    @Override
    // az youtube didam kare daghighesho nemidoonam baraye enteghale beine safhe ast
    public void initialize(URL ur, ResourceBundle rb){}

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
    public int getLevel(){
        return level;
    }
}
