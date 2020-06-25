package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public void save(Company company) {
        companyDao.save(company);
    }

    public void delete(Company company) {
        companyDao.deleteById(company.getId());
    }

    public List<Employee> searchEmployeesByLastName(String s) throws FacadeException {
        List<Employee> employees = employeeDao.retrieveEmployeesByLastName(s);
        if(employees.isEmpty()) {
            throw new FacadeException(FacadeException.ERR_SEARCH_EMPLOYEE_ERROR);
        }
        return employees;
    }
    public List<Employee> searchEmployeesByPhrasePart(String s) throws FacadeException {
        List<Employee> employees = employeeDao.retrieveEmployeesByPhrasePart(s);
        if(employees.isEmpty()) {
            throw new FacadeException(FacadeException.ERR_SEARCH_EMPLOYEE_ERROR);
        }
        return employees;
    }
    public List<Company> searchCompaniesByThreeCharsOfName(String s) throws FacadeException {
        List<Company> companies = companyDao.retrieveCompaniesByThreeCharsOfName(s);
        if (companies.isEmpty()) {
            throw new FacadeException(FacadeException.ERR_SEARCH_COMPANY_ERROR);
        }
        return companies;
    }
    public List<Company> searchCompaniesByPhrasePart(String s) throws FacadeException {
        List<Company> companies = companyDao.retrieveCompaniesByPhrasePart(s);
        if (companies.isEmpty()) {
            throw new FacadeException(FacadeException.ERR_SEARCH_COMPANY_ERROR);
        }
        return companies;
    }
}