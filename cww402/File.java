package cww402;
import java.io.PrintWriter;
public class File {
    public static void main(String[] args) throws Exception {
        File file = new File("scores.txt");
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(0);
        }
        output =  (file);
        output.print("John T Smith");
        output.close();
    }
}
