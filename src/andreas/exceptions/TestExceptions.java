package andreas.exceptions;

public class TestExceptions {

    public int divide(int a, int b) throws ArithmeticException{

        if (b == 0){
            throw new ArithmeticException("Erreur de division par zero !!!");
        }

        return a / b;
    }
}
