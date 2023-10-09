package md.tekwill.filemanagementservice;

import java.io.*;
import java.nio.file.Files;

public class InputFileReaderManager {
    public static void printDataOnTheConsoleUsingFileReader(File file){
        FileReader fileReaderObj = null;

        try {
            fileReaderObj = new FileReader(file);
            int charNumberInAsciiSystem;
            while ((charNumberInAsciiSystem = fileReaderObj.read()) != -1 ){
                System.out.print((char)charNumberInAsciiSystem);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found. The procedure was aborted");
        } catch (IOException e) {
           e.printStackTrace();
            System.out.println("There is a problem with read process");
        } finally {
            try {
                fileReaderObj.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void printDataFromAFileUsingBufferedReader(File file){
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Exception has occurred, skipp the reading");
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void printDataUsingTheEasiestWay(File file){
        try {
            String content = Files.readString(file.toPath());
            System.out.println(content);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
