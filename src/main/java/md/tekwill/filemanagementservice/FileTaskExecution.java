package md.tekwill.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileTaskExecution {
    public static void main(String[] args) throws IOException {
        File fileObject = new File("src/main/java/md/tekwill/filemanagementservice/file.txt");

        System.out.println(FileManager.createTheFileIfItDoesNotExists(fileObject));
        FileManager.informIfTheFileExists(fileObject);
        FileManager.printTheFileName(fileObject);
        FileManager.printTheAbsolutePath(fileObject);
        FileManager.printIfItIsADirectoryOrAFile(fileObject);

        OutputFileManager.writeInformationIntoAFileUsingFileWriter(fileObject.getPath(), "Content");
        OutputFileManager.writeInformationIntoAFileUsingFileWriter(fileObject.getPath(), "Something else");
        OutputFileManager.writeInformationIntoAFileByUsingBufferedWriter(fileObject, "Value Free 2");
        InputFileReaderManager.printDataOnTheConsoleUsingFileReader(fileObject);
        System.out.println();
        InputFileReaderManager.printDataFromAFileUsingBufferedReader(fileObject);
        InputFileReaderManager.printDataUsingTheEasiestWay(fileObject);




    }

}
