package FileIO;

import java.io.*;
import java.util.Objects;

public class TextInOut {
    public static void main(String[] args) {
//        String name = "Hello";
//
//        try (FileInputStream fis = new FileInputStream("Text.txt")){
//
//            int i;
//            while ((i = fis.read()) != -1){
//                System.out.print((char) i);
//            }
//
//        } catch (IOException e){
//            e.printStackTrace();
//        }

        // Запись файла
//        String test = "Hello, my name is Mikho";
//        try(FileOutputStream fos = new FileOutputStream("textNew.txt")){
//            fos.write("Hello, my name is Mikho".getBytes());
//        } catch (IOException e){
//            throw new RuntimeException(e);
//        }
        //  Чтение файла 1й вариант лучше
//        String test = "Hello, my name is Mikho";
//        try(FileInputStream fis = new FileInputStream("textNew.txt")){
//            int i;
//            while ((i = fis.read()) != -1){
//                System.out.print((char) i);
//            }
//        } catch (IOException e){
//            throw new RuntimeException(e);
//        }
//        Второй вариант
//        String test = "Hello, my name is Mikho";
//        try(FileInputStream fis = new FileInputStream("textNew.txt")){
//            byte [] array = fis.readAllBytes();
//            for(int i = 0; i < array.length; i++){
//                System.out.print((char) array[i]);
//            }
//
//        } catch (IOException e){
//            throw new RuntimeException(e);
//        }
        // Запись файла через buffer испульзуем для лучшей скорости
//                String test = "Hello, my name is Mikho";
//        try(FileOutputStream fos = new FileOutputStream("textNew.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos)) {
//            byte [] buffer = test.getBytes();
//            bos.write(buffer);
//        } catch (IOException e){
//            throw new RuntimeException(e);
//        }
//                 чтение через бафер
//        try(FileInputStream fis = new FileInputStream("textNew.txt");
//            BufferedInputStream bis = new BufferedInputStream(fis)) {
//
//            int i;
//            while ((i = bis.read()) != -1){
//                System.out.print((char) i);
//            }
//        } catch (IOException e){
//            throw new RuntimeException(e);
//        }
        String test = "Hello, my name is Mikho";

        try (FileWriter writer = new FileWriter("textNew.txt", false)) {//усли убрать фолс то будет дописывать а не переписывать
            writer.write(test);
            writer.append("!");
        } catch (IOException e){
            throw new RuntimeException(e);
        }

        try (FileReader reader = new FileReader("textNew.txt")) {
//            int i;
//            while ((i = reader.read()) != -1){
//                System.out.print((char) i);
//            }
            for (int i = 0; i < test.length() + 1; i++) {
                System.out.print((char) reader.read());
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
        System.out.println();

        File dir = new File("C:\\Users\\Misha\\Desktop\\JavaTest\\Dir");
        File file = new File("C:\\Users\\Misha\\Desktop\\JavaTest\\Dir\\file.txt");
        if (dir.mkdir()){
            System.out.println("The directory was created");
        }
        boolean createFile = false;
        try{
            createFile = file.createNewFile();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
        if (createFile){
            System.out.println("The file was created");
        }
        if (file.delete()){
            System.out.println("The file was removed");
        }
        if (dir.delete()){
            System.out.println("The directory was removed");
        }
    }
}
