/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.Customer;

/**
 *
 * @author George.Pasparakis
 */
public class CustomerDAO implements CustomerDAOInterface {

    private EntityManagerFactory emf;
    
    public CustomerDAO() {
        emf = Persistence.createEntityManagerFactory("com.pcedu_MyJPAEShop_war_1.0-SNAPSHOTPU");
    }
    
    @Override
    public Customer create() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Customer c = new Customer("John", "Doe", "john@doe.com");
        em.persist(c);
        em.getTransaction().commit();
        return(c);
    }

    @Override
    public Customer create(String firstName, String lastName) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.pcedu_MyJPAEShop_war_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Customer c = new Customer(firstName, lastName, "");
        em.persist(c);
        em.getTransaction().commit();
        return(c);
    }

    @Override
    public Customer create(String firstName, String lastName, String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
