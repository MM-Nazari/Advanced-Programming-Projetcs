package sample;

// ketabkhane ha
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */

//implement kardan baraye enteghal bein safhe ast
public class CampController implements Initializable {

    @FXML
    private Button easyButton ;

    @FXML
    private Button normalButton ;

    @FXML
    private Button hardButton ;

    @FXML
    public void onClickButtonEasy(ActionEvent e) throws IOException {
        // taeen .fxml morede nazar baraye enteghal
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("battle.fxml"));
        fxmlLoader.setController(new BattleController());
        Parent x = fxmlLoader.load();
        /// Scene a = new Scene(x);
        // taeen stage
        Stage window = (Stage)((Node) e.getSource()).getScene().getWindow();
        // Stage window = (Stage) ((Node)e.getSource()).getScene().getWindow();
        // taeen scene
        window.setScene(new Scene(x, 600, 400));
        //  window.setScene(a);
        window.show();
    }
    @FXML
    public void onClickButtonNormal(ActionEvent e) throws IOException {
        // taeen .fxml morede nazar baraye enteghal
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("battle.fxml"));
        fxmlLoader.setController(new BattleController());
        Parent x = fxmlLoader.load();
        /// Scene a = new Scene(x);
        // taeen stage
        Stage window = (Stage)((Node) e.getSource()).getScene().getWindow();
        // Stage window = (Stage) ((Node)e.getSource()).getScene().getWindow();
        // taeen scene
        window.setScene(new Scene(x, 600, 400));
        //  window.setScene(a);
        window.show();
    }
    @FXML
    public void onClickButtonHard(ActionEvent e) throws IOException {
        // taeen .fxml morede nazar baraye enteghal
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("battle.fxml"));
        fxmlLoader.setController(new BattleController());
        Parent x = fxmlLoader.load();
        /// Scene a = new Scene(x);
        // taeen stage
        Stage window = (Stage)((Node) e.getSource()).getScene().getWindow();
        // Stage window = (Stage) ((Node)e.getSource()).getScene().getWindow();
        // taeen scene
        window.setScene(new Scene(x, 600, 400));
        //  window.setScene(a);
        window.show();
    }

    @Override
    // az youtube didam kare daghighesho nemidoonam baraye enteghale beine safhe ast
    public void initialize(URL ur, ResourceBundle rb){}
}
