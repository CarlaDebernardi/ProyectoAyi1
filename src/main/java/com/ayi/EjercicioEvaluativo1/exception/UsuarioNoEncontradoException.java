package com.ayi.EjercicioEvaluativo1.exception;

public class UsuarioNoEncontradoException extends RuntimeException{
    public UsuarioNoEncontradoException(){super ("No existe un usuario registrado con ese nombre.");}

}
