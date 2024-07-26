package sample;

// ketabkhane ha
import java.io.*;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */
public class FileUtils {

    /**
     * @param name write dar file ba name
     * @param text matni ke dar file minevisad
     */
    public void fileWriter(String name, String text) {

        try {

            //baraye dadane adress
            String path = "./" + name + ".txt";
            // sakhte shey az kelase File
            File file =new File(path);
            FileWriter f1 = new FileWriter(file,true);
            // kar ba buffer
            BufferedWriter b1 = new BufferedWriter(f1);
            b1.write(text);
            // raftan be khate baad
            b1.write(System.getProperty( "line.separator" ));
            // bastane file morede nazar
            b1.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param name esme file khande shavande
     * @return vojood ya adame vojood tekrari
     * false baraye vojood
     * true baraye adame vojood
     */
    public boolean fileReader(String name , String x) {

        try {
            //baraye dadane adress
            String path = "./" + name + ".txt";
            FileReader f2 = new FileReader(path);
            // kar ba buffer
            BufferedReader b2 = new BufferedReader(f2);
            // string baraye moghayese string khaste shode ba har khate dar file
            String nextline = "";
            while ((nextline = b2.readLine()) != null) {
                if(nextline.equals(x))
                    return false ;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;

    }

    /**
     *
     * @param name name file morede nazar
     * @return mohtaviate file
     */
    public String filePrinter(String name){
        // string result baraye chape natayej
        StringBuilder result = new StringBuilder();
        try {
            //baraye dadane adress
            String path ="./"+name+".txt";
            FileReader f2 = new FileReader(path);
            // kar ba buffer
            BufferedReader b2 = new BufferedReader(f2);
            //  string baraye khandane har khat
            String nextline="";
            while((nextline=b2.readLine())!= null){
                result.append(nextline);
            }

        } catch (IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }
}
