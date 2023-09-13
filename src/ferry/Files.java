package ferry;

import java.io.File;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {

        File file = new File("C://Users/dell/Desktop/page.php");

        if (!file.exists()){

            try{
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
