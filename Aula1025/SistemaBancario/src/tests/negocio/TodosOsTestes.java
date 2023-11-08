package tests.negocio;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
    {
        GerenciadorClientesTest_Ex01.class, GerenciadorClientesTest_Ex02.class, GerenciadorClientesTest_Ex03.class, 
        GerenciadorClientesTest_Ex04.class, GerenciadorClientesTest_Ex05.class, GerenciadorContasTest_Ex01.class, GerenciadorContasTest_Ex02.class, 
        GerenciadorContasTest_Ex03.class, GerenciadorContasTest_Ex04.class
    }
)

public class TodosOsTestes {}