package sample;

// ketabkhane ha
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.media.*;
import javafx.stage.Stage;
import java.io.*;
import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */

//implement kardan baraye enteghal bein safhe ast
public class LoginController implements Initializable {

    // file baraye negahdarie username va password ha
    String name = " logins " ;
    // sakhte shey az kelas fileutils baraye kar ba file
    FileUtils file = new FileUtils();

    @FXML
    private Button registerButton ;
    @FXML
    private Button loginButton ;
    @FXML
    private Button clearallButton ;
    @FXML
    private TextField textFieldUsername ;
    @FXML
    private TextField textFieldPassword ;
    @FXML
    private TextField textFieldInfo ;
    @FXML
    private Label loginLable ;
    @FXML
    private Label usernameLable ;
    @FXML
    private Label passwordLable ;


    @FXML
    public void onClickButtonRegister (ActionEvent e) throws Exception {

        // aggar ke username va password tekrari bashad
        if(!file.fileReader(name, textFieldUsername.getText()) || !file.fileReader(name, textFieldPassword.getText())){
            textFieldInfo.setText(" username ya password tekrari ast");

        }

        else {
            // ezafe kardan be file logins
            file.fileWriter(name, textFieldUsername.getText());
            file.fileWriter(name, textFieldPassword.getText());

          }

    }

    @FXML
    public void onClickButtonLogin (ActionEvent e) throws Exception {

        // dar soorate register nashode boodan
        if(file.fileReader(name, textFieldUsername.getText()) || file.fileReader(name, textFieldPassword.getText()))
            textFieldInfo.setText(" shoma register nakardid");

        else {
            // taeen .fxml morede nazar baraye enteghal
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
            fxmlLoader.setController(new MenuController());
            Parent x = fxmlLoader.load();
            /// Scene a = new Scene(x);
            // taeen stage
            Stage window = (Stage)((Node) e.getSource()).getScene().getWindow();
            // Stage window = (Stage) ((Node)e.getSource()).getScene().getWindow();
            // taeene scene
            window.setScene(new Scene(x, 600, 400));
            //  window.setScene(a);
            window.show();
        }

    }

    @FXML
    public void onClickButtonClearall (ActionEvent e) {
        textFieldUsername.setText("");
        textFieldPassword.setText("");
        textFieldInfo.setText("");

    }
    // talashe na moafagh baraye avaz kardane safhe ha
   // public void changeScreen(ActionEvent event ) throws IOException{
   //     Parent x = FXMLLoader.load(getClass().getResource("login.fxml"));
    //    Scene a = new Scene(x);
    //    Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    //    window.setScene(a);
     //   window.show();
   // }

    @Override
    // az youtube didam kare daghighesho nemidoonam baraye enteghale beine safhe ast
    public void initialize(URL ur, ResourceBundle rb){}


}
