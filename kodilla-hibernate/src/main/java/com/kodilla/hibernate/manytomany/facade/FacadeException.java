package com.kodilla.hibernate.manytomany.facade;

public class FacadeException extends Exception {

    public static final String ERR_SEARCH_EMPLOYEE_ERROR = "Employees not searched" ;
    public static final String ERR_SEARCH_COMPANY_ERROR = "Companies not searched";

    public FacadeException(String message) {
        super(message);
    }
}