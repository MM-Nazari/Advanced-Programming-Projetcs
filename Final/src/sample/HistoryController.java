package sample;

// ketabkhane ha
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */

//implement kardan baraye enteghal bein safhe ast
public class HistoryController implements Initializable {
    // file havi nataiej baziha
    String name = " battle " ;
    // sakhte shey az kelas fileutils baraye kar ba file
    FileUtils file = new FileUtils();

    @FXML
    private ListView<String> historyListView ;

    public void main(String[] args){

        // chape mohataviate file battle
        historyListView.setAccessibleText(file.filePrinter(name));
    }

    @Override
    // az youtube didam kare daghighesho nemidoonam baraye enteghale beine safhe ast
    public void initialize(URL ur, ResourceBundle rb){}


}
