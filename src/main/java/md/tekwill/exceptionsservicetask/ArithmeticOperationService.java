package md.tekwill.exceptionsservicetask;

public class ArithmeticOperationService {

    public static double divideWithoutExceptionHandling(int a, int b){
        return a / b;
    }

    public static double divideWithExceptionHandling(int a, int b){
        try{
            return a/b;
        } catch (ArithmeticException capturedException){
            System.out.println(capturedException.getMessage());
            System.out.println("This block of code is executed only if there is an exepton in the try section");
            return 0.0;
        } finally {
            System.out.println("This block of code is executed all the time");
        }
    }

}
