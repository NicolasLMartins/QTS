package calculo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exceptions.CantDivideByZeroException;

public class CalculadoraTest {

    private Calculadora calc;

    @Before
    public void setUp() {
        calc = new Calculadora();
    }

    // Tests if the Calculadora's method sum's result is correct
    @Test
    public void mustSumTwoValues() {
        //CENÁRIO
        int a = 10;
        int b = 2;

        // Calculadora calc = new Calculadora();
    
        //EXECUÇÃO
        int resultado = calc.sum(a, b);
    
        //VERIFICAÇÃO
        assertEquals(12, resultado);
    }

    // Tests if the Calculadora's method subtract's result is correct
    @Test
    public void mustSubtractTwoValues() {
        //CENÁRIO
        int a = 10;
        int b = 2;

        // Calculadora calc = new Calculadora();
    
        //EXECUÇÃO
        int resultado = calc.subtract(a, b);
    
        //VERIFICAÇÃO
        assertEquals(8, resultado);
    }

    // Tests if the Calculadora's method multiply's result is correct
    @Test
    public void mustMultiplyTwoValues() {
        //CENÁRIO
        int a = 10;
        int b = 2;

        // Calculadora calc = new Calculadora();
    
        //EXECUÇÃO
        int resultado = calc.multiply(a, b);
    
        //VERIFICAÇÃO
        assertEquals(20, resultado);
    }

    // Tests if the Calculadora's method divide's result is correct
    @Test
    public void mustDivideTwoValues() throws CantDivideByZeroException {
        //CENÁRIO
        int a = 10;
        int b = 2;

        // Calculadora calc = new Calculadora();
    
        //EXECUÇÃO
        int resultado = calc.divide(a, b);
    
        //VERIFICAÇÃO
        assertEquals(5, resultado);
    }

    // Tests if the Calculadora's method divRemainder's result is correct
    @Test
    public void mustResultDivisionRemainder() {
        //CENÁRIO
        int a = 10;
        int b = 2;

        // Calculadora calc = new Calculadora();
    
        //EXECUÇÃO
        int resultado = calc.divRemainder(a, b);
    
        //VERIFICAÇÃO
        assertEquals(0, resultado);
    }

    @Test(expected = CantDivideByZeroException.class)
    public void mustThrowExceptionDivideByZero() throws CantDivideByZeroException {
        //CENÁRIO
                //CENÁRIO
        int a = 10;
        int b = 0;

        // Calculadora calc = new Calculadora();
    
        //EXECUÇÃO
        int resultado = calc.divide(a, b);
    
        //VERIFICAÇÃO
        assertEquals(5, resultado);
    }
}
