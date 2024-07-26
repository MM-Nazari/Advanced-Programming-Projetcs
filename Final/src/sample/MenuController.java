package sample;

// ketabkhane ha
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 *
 *
 * @author MMNazari1380
 * @version 1.0
 */

//implement kardan baraye enteghal bein safhe ast
public class MenuController implements Initializable {

    @FXML
    private javafx.scene.control.Button profileButton ;
    @FXML
    private Button campButton ;
    @FXML
    private Button historyButton ;
    @FXML
    private Button deckButton ;
    @FXML
    private Button logoutButton ;
    @FXML
    private Button button1v1 ;
    @FXML
    private Button button2v2;

    @FXML
    public void onClickButtonProfile(ActionEvent e) throws IOException {
        // taeene .fxml morede nazar
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("profile.fxml"));
        fxmlLoader.setController(new ProfileController());
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
    public void onClickButtonDeck(ActionEvent e) throws IOException {
        // taeene .fxml morede nazar
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("deck.fxml"));
        fxmlLoader.setController(new DeckController());
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
    public void onClickButtonHistory(ActionEvent e) throws IOException {
        // taeene .fxml morede nazar
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("history.fxml"));
        fxmlLoader.setController(new HistoryController());
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
    public void onClickButtonCamp(ActionEvent e) throws IOException {
        // taeene .fxml morede nazar
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("camp.fxml"));
        fxmlLoader.setController(new CampController());
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
    public void onClickButton1v1(ActionEvent e) throws IOException {
      Server a = new Server();
      a.run();
      Client b = new Client();
      b.run();
    }
    @FXML
    public void onClickButton2v2(ActionEvent e) throws IOException {
        // code darepit
        button1v1.setLabel("xxx");
    }
    @FXML
    public void onClickButtonLogout(ActionEvent e) throws IOException {
        // taeen .fxml morede nazar baraye enteghal
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
        fxmlLoader.setController(new LoginController());
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
