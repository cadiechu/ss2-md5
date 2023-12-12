//package com.example.demo.advice;
//
//import org.springframework.data.crossstore.ChangeSetPersister;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//@RestControllerAdvice
//public class AdviceControllerApi {
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    @ExceptionHandler(ChangeSetPersister.NotFoundException.class)
//    public String handle(){
//        return "templates/views/home.html";
//    }
//}
