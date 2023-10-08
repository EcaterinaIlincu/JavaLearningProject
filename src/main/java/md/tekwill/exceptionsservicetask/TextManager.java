package md.tekwill.exceptionsservicetask;

public class TextManager {

    public static int getTheTextLength(String inputString){
        return inputString.length();
    }
    public static int getTheTextLengthWithTryAndCatch(String inputString){
        try{
            return inputString.length();
        } catch (NullPointerException exceptionFromTheTryBlock){
            //System.out.println(exceptionFromTheTryBlock.getMessage());
            exceptionFromTheTryBlock.printStackTrace();  // to print the execution message but not interrupt the execution of the program
            return 0;
        }
    }
    public static int getTheTextLengthWithIf(String inputText){
        if (inputText == null){
            return 0;
        } else {
            return inputText.length();
        }
    }
}
