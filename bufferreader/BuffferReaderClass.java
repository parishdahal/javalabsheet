package bufferreader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 



public class BuffferReaderClass {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        try{
            String name = reader.readLine();
            System.out.println("your name is " + name );

            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
}
