package calculo;

import exceptions.CantDivideByZeroException;

public class Calculadora {

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) throws CantDivideByZeroException {
        if (b == 0) {
            throw new CantDivideByZeroException();
        }
        
        return a / b;
    }

    public int divRemainder(int a, int b) {
        return a % b;
    }
}
