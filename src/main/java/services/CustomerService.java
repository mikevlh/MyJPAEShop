/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.CustomerDAO;
import java.util.Set;
import models.Customer;

/**
 *
 * @author George.Pasparakis
 */
public class CustomerService implements CustomerServiceInterface {
    private final CustomerDAO dao;
    
    public CustomerService() {
        dao = new CustomerDAO();
    }
    
    @Override
    public Customer create() {
        return(dao.create("John", "Doe", "john@doe.com"));
    }

    @Override
    public Customer create(String firstName, String lastName) {
        return(dao.create(firstName, lastName, ""));
    }

    @Override
    public Customer create(String firstName, String lastName, String email) {
        if(firstName.equalsIgnoreCase("") && lastName.equalsIgnoreCase("") && email.equalsIgnoreCase("")) {
           //return(this.create()); 
           return(null);
        }
        return(dao.create(firstName, lastName, email));
    }

    @Override
    public Customer findById(Integer id) {
        return(dao.findById(id));
    }

    @Override
    public Set<Customer> findAll() {
        return(dao.findAll());
    }

    @Override
    public boolean delete(Integer id) {
        return(dao.delete(id));
    }
    
}
