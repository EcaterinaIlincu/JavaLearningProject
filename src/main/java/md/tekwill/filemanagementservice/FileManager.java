package md.tekwill.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {

    public static boolean createTheFileIfItDoesNotExists(File file) throws IOException {
        return file.createNewFile();

    }
    public static void informIfTheFileExists(File file){
        if (file.exists()){
            System.out.println("The file is present");
        } else {
            System.out.println("The file is not present");
        }
    }

    public static void printTheFileName (File file){
        System.out.println(file.getName());
    }
    public static void printTheAbsolutePath (File file){
        System.out.println(file.getAbsolutePath());
    }

    public static void printIfItIsADirectoryOrAFile(File file){
    if(file.isDirectory()){
        System.out.println("It is a directory");
    } else {
        System.out.println("It is a file");
    }
    }
}
