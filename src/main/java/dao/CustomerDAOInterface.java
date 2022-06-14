/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import models.Customer;

/**
 *
 * @author George.Pasparakis
 */
public interface CustomerDAOInterface {
    // CRUD
    Customer create(); // firstName = John, lastName = Doe, email = john@doe.com
    Customer create(String firstName, String lastName); // email = ""
    Customer create(String firstName, String lastName, String email);
    
    void findById(Integer id);
    
}
