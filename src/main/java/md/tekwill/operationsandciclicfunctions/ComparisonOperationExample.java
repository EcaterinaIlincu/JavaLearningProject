package md.tekwill.operationsandciclicfunctions;

public class ComparisonOperationExample {
    public static void main(String[] args) {
        int a = 15;
        int b = 7;

        //Egal cu
        boolean isEqual = a == b;
        System.out.println("a este egal cu b: " + isEqual);

        //Diferit de
        boolean isNotEqual = a != b;
        System.out.println("a nu este egal cu b: " + isNotEqual);

        //Mai mare decit
        boolean isGreaterThan = a > b;
        System.out.println("a este mai mare ca b: " + isGreaterThan);

        //Mai mic decat
        boolean isLessThan = a < b;
        System.out.println("a este mai mic ca b: " + isLessThan);

        //mai mare sau egal
        boolean isGreaterOrEqual = a >= b;
        System.out.println("a este mai mare sau egal ca b: " + isGreaterOrEqual);

        //mai mic sau egal
        boolean isLessOrEqual = a <= b;
        System.out.println("a este mai mic sau egal cu b: " + isLessOrEqual);
    }
}
