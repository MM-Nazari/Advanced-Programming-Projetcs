package sample;

// ketabkhane ha
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */

//implement kardan baraye enteghal bein safhe ast
public class DeckController implements Initializable {

    // sakhte file baraye negahdarie deck entekhab shode
    String name = " deck " ;
    // shey az kelass fileutils baraye kar ba file
    FileUtils file = new FileUtils();
    // mahdood kardan entekhab ha
    ToggleGroup toggleGroup = new ToggleGroup();


    @FXML
    private RadioButton wizardRadioButton ;
    @FXML
    private RadioButton barbarRadioButton ;
    @FXML
    private RadioButton arrowsRadioButton ;
    @FXML
    private RadioButton fireballRadioButton ;
    @FXML
    private RadioButton pekkaRadioButton ;
    @FXML
    private RadioButton archerRadioButton ;
    @FXML
    private RadioButton cannonRadioButton ;
    @FXML
    private RadioButton valkyrieRadioButton ;
    @FXML
    private RadioButton giantRadioButton ;
    @FXML
    private RadioButton rageRadioButton ;
    @FXML
    private RadioButton infernoRadioButton ;
    @FXML
    private RadioButton dragonRadioButton ;
    @FXML
    private ImageView wizardImage ;
    @FXML
    private ImageView barbarImage ;
    @FXML
    private ImageView archerImage ;
    @FXML
    private ImageView infernoImage ;
    @FXML
    private ImageView fireballImage ;
    @FXML
    private ImageView giantImage ;
    @FXML
    private ImageView rageImage ;
    @FXML
    private ImageView arrowsImage ;
    @FXML
    private ImageView cannonImage ;
    @FXML
    private ImageView pekkaImage ;
    @FXML
    private ImageView dragonImage ;
    @FXML
    private ImageView valkyrieImage ;







    @FXML
    public void onClickRadioButtonWizard (ActionEvent e){
        file.fileWriter(name,wizardRadioButton.getText());
        wizardRadioButton.setToggleGroup(toggleGroup);
    }
    @FXML
    public void onClickRadioButtonBarbar (ActionEvent e){

        file.fileWriter(name,barbarRadioButton.getText());
        barbarRadioButton.setToggleGroup(toggleGroup);
    }
    @FXML
    public void onClickRadioButtonArrows (ActionEvent e){
        file.fileWriter(name,arrowsRadioButton.getText());
        arrowsRadioButton.setToggleGroup(toggleGroup);
    }
    @FXML
    public void onClickRadioButtonFireball (ActionEvent e){
        file.fileWriter(name,fireballRadioButton.getText());
        fireballRadioButton.setToggleGroup(toggleGroup);
    }
    @FXML
    public void onClickRadioButtonPekka (ActionEvent e){
        file.fileWriter(name,pekkaRadioButton.getText());
        pekkaRadioButton.setToggleGroup(toggleGroup);
    }
    @FXML
    public void onClickRadioButtonArcher (ActionEvent e){
        file.fileWriter(name,archerRadioButton.getText());
        archerRadioButton.setToggleGroup(toggleGroup);
    }
    @FXML
    public void onClickRadioButtonCannon (ActionEvent e){
        file.fileWriter(name,cannonRadioButton.getText());
        cannonRadioButton.setToggleGroup(toggleGroup);
    }
    @FXML
    public void onClickRadioButtonValkyrie (ActionEvent e){
        file.fileWriter(name,valkyrieRadioButton.getText());
        valkyrieRadioButton.setToggleGroup(toggleGroup);
    }
    @FXML
    public void onClickRadioButtonGiant (ActionEvent e){
        file.fileWriter(name,giantRadioButton.getText());
        giantRadioButton.setToggleGroup(toggleGroup);
    }
    @FXML
    public void onClickRadioButtonRage (ActionEvent e){
        file.fileWriter(name,rageRadioButton.getText());
        rageRadioButton.setToggleGroup(toggleGroup);
    }
    @FXML
    public void onClickRadioButtonInferno (ActionEvent e){
        file.fileWriter(name,infernoRadioButton.getText());
        infernoRadioButton.setToggleGroup(toggleGroup);
    }
    @FXML
    public void onClickRadioButtonDragon (ActionEvent e){
        file.fileWriter(name,dragonRadioButton.getText());
        dragonRadioButton.setToggleGroup(toggleGroup);
    }

    @Override
    // az youtube didam kare daghighesho nemidoonam baraye enteghale beine safhe ast
    public void initialize(URL ur, ResourceBundle rb){}
    // tabe baraye mahdood kardane toggle group be 8 ta
    public void main(){


    }

    public ImageView getWizardImage() {
        return wizardImage;
    }

    public ImageView getArcherImage() {
        return archerImage;
    }

    public ImageView getArrowsImage() {
        return arrowsImage;
    }

    public ImageView getBarbarImage() {
        return barbarImage;
    }

    public ImageView getCannonImage() {
        return cannonImage;
    }

    public ImageView getFireballImage() {
        return fireballImage;
    }

    public ImageView getPekkaImage() {
        return pekkaImage;
    }

    public ImageView getDragonImage() {
        return dragonImage;
    }

    public ImageView getRageImage() {
        return rageImage;
    }

    public ImageView getGiantImage() {
        return giantImage;
    }

    public ImageView getInfernoImage() {
        return infernoImage;
    }

    public ImageView getValkyrieImage() {
        return valkyrieImage;
    }

}
