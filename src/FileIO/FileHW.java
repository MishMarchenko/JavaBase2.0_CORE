package FileIO;

import java.io.*;

public class FileHW {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Misha\\Desktop\\JavaTest\\Test");
        File firstFile = new File("C:\\Users\\Misha\\Desktop\\JavaTest\\Test\\FirstFile.txt");
        File secondFile = new File("C:\\Users\\Misha\\Desktop\\JavaTest\\Test\\SecondFile.txt");
        boolean createFirstFile = false;
        boolean createSecondFile = false;
        if (dir.mkdir()){
            System.out.println("The directory was created");
        }
        try{
            createFirstFile = firstFile.createNewFile();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
        if (createFirstFile){
            System.out.println("The first file was created");
        }
        try{
            createSecondFile = secondFile.createNewFile();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
        if (createSecondFile){
            System.out.println("The second file was created");
        }
        try(FileWriter writer = new FileWriter(firstFile, false)){
            writer.write("Java World");
        } catch (IOException e){
            throw new RuntimeException(e);
        }
        try(FileInputStream fis = new FileInputStream(firstFile);
        FileOutputStream fos = new FileOutputStream(secondFile)){
            byte [] buffer = new byte[fis.available()];
            int count;
            while ((count = fis.read(buffer)) != -1){
                fos. write(buffer, 0, buffer.length);
            }
            }catch (IOException e){
                throw new RuntimeException(e);
        }
        if(firstFile.delete()){
            System.out.println("The first file was removed");
        }
        if(secondFile.delete()){
            System.out.println("The second file was removed");
        }
        if(dir.delete()){
            System.out.println("The directory was removed");
        }

    }
}
