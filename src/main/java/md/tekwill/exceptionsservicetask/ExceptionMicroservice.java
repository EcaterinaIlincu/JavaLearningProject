package md.tekwill.exceptionsservicetask;

public class ExceptionMicroservice {
    public static void main(String[] args) {

        String controlVariable = null;

        System.out.println("The String Length is = " + TextManager.getTheTextLengthWithTryAndCatch(controlVariable));
        System.out.println("The String Length is = " + TextManager.getTheTextLengthWithIf(controlVariable));
        System.out.println("The String Length is = " + TextManager.getTheTextLength("Bamboleo"));

        System.out.println("The division result is = " + ArithmeticOperationService.divideWithoutExceptionHandling(0,2));
        System.out.println("The division result is = " + ArithmeticOperationService.divideWithExceptionHandling(0,0));
        System.out.println("Program continue execution");

    }
}
