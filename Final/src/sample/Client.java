package sample;

// ketabkhane ha
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author MMNazari1380
 * @version 1.0
 */
public class Client
{

    /**
     * methode run baraye ejraye barname
     */
    public void run()
    {

        try
        {


            Socket socket = new Socket( InetAddress.getLocalHost(), 8888 );
            DataInputStream dataInputStream = new DataInputStream( socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            while(true)
            {

              break;

            }

            // bastane socket va stream ha
            dataInputStream.close();
            dataOutputStream.close();
            socket.close();

        }
        // residegi be exception
        catch (IOException ee)
        {

            ee.printStackTrace();

        }

    }

}