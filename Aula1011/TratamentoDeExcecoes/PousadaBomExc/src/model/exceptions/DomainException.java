package model.exceptions;

public class DomainException extends Exception{

    private static final long serialVersionUID = 1L;
    
    // Exception: O compilador vai OBRIGAR o Tratamento da exceção.
    // RuntimeException: O compilador NÃO OBRIGA o Tratamento da esceção.
    public DomainException(String msg) {
        super(msg);
    }
}
