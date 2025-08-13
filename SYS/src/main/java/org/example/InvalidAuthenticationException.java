package org.example;

public class InvalidAuthenticationException extends Exception{
    public InvalidAuthenticationException(String message){
        super(message);
    }
}
