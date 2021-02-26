package com.kodilla.hibernate.manytomany.api;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> searchCompany(String param){
        return companyDao.searchCompanyByNameParam("%"+param+"%");
    }

    public List<Employee> searchEmployee(String param){
        return employeeDao.searchEmployeeByNameParam("%"+param+"%");
    }

}
