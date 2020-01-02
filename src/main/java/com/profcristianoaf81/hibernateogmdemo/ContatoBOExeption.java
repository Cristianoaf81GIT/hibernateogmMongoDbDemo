package com.profcristianoaf81.hibernateogmdemo;

/**
 *
 * @author cristianoaf81
 */
public class ContatoBOExeption extends Exception{

    private static final long serialVersionUID = -8846588427698562849L;

    public ContatoBOExeption() {
    }

    public ContatoBOExeption(String message) {
        super(message);
    }

    public ContatoBOExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public ContatoBOExeption(Throwable cause) {
        super(cause);
    }

    public ContatoBOExeption(String message,
            Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
