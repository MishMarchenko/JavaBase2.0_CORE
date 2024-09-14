import java.io.FileInputStream;
import java.io.IOException;

public class TextInOut {
    public static void main(String[] args) {
        String name = "Hello";

        try (FileInputStream fis = new FileInputStream("Text.txt")){

            int i;
            while ((i = fis.read()) != -1){
                System.out.print((char) i);
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
