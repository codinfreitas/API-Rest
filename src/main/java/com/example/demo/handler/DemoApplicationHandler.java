package com.example.demo.handler;

import com.example.demo.handler.exception.NotFoundException;
import com.example.demo.handler.responde.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.logging.Level;
import java.util.logging.Logger;

@ControllerAdvice //controle de exceção (é só um filtro)
//sempre que uma exceção é lançada ele "filtra" e busca o metodo que captura essa exception
public class DemoApplicationHandler {

    private static final Logger LOGGER = Logger.getLogger(DemoApplicationHandler.class.getName());

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse badRequest(MethodArgumentNotValidException exception) {
        LOGGER.log(Level.SEVERE, exception.getMessage());
        return new ErrorResponse(exception.getMessage(), "BAD_REQUEST");
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse notFound(NotFoundException exception) {
        LOGGER.log(Level.SEVERE, exception.getMessage());
        return new ErrorResponse(exception.getMessage(), "NOT_FOUND");
    }

    //MethodArgumentNotValidException é lançada pq usei o @Valid no parametro da minha requisição
    //e na requisição eu passei o campo nulo, vazio ou em branco
    //exemplo: Metodo POST validando o userViews.

}
