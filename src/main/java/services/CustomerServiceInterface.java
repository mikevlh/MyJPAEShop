/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.Set;
import models.Customer;

/**
 *
 * @author George.Pasparakis
 */
public interface CustomerServiceInterface {
     // CRUD
    Customer create(); // firstName = John, lastName = Doe, email = john@doe.com
    Customer create(String firstName, String lastName); // email = ""
    Customer create(String firstName, String lastName, String email);
    
    Customer findById(Integer id);
    Set<Customer> findAll();
}
