package br.com.fiap.apostila12.exception;

//Uma execeção é uma classe filha de Exception ou RuntimeException
public class SenhaInvalidaException extends RuntimeException{

    public SenhaInvalidaException(String message){
        super(message);
    }
}
