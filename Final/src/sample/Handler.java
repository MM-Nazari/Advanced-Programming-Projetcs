package sample;

// ketabkhane ha
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @author MMNazari1380
 * @version 1.0
 */
public class Handler implements Runnable
{
    // field
    private final Socket socket;

    // costructor
    public Handler(Socket socket)
    {

        this.socket=socket;

    }

    /**
     * baraye ejraye har client
     */
    @Override
    public void run()
    {

        try {

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());


            // halghe baraye chap har string ersali dar server va ersale haman reshte be client
            // va hamchenin baraye etmam barname ba  daryafte "over"
            while (true) {

               break;

            }


            // bastan socket va stream ha
            dataInputStream.close();
            dataOutputStream.close();
            socket.close();

        }

        // residegi be estesna
        catch ( IOException e)
        {
            e.printStackTrace();
        }

    }

}