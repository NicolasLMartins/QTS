package calculo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
    
    @Test
    public void mustSumTwoValues() {
        //CENÁRIO
        int a = 10;
        int b = 2;

        Calculadora calc = new Calculadora();
    
        //EXECUÇÃO
        int resultado = calc.soma(a, b);
    
        //VERIFICAÇÃO
        assertEquals(12, resultado);
    }
}
