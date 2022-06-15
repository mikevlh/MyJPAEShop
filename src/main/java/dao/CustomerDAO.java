/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import models.Customer;

/**
 *
 * @author George.Pasparakis
 */
public class CustomerDAO implements CustomerDAOInterface {

    private final EntityManagerFactory emf;
    
    public CustomerDAO() {
        emf = Persistence.createEntityManagerFactory("com.pcedu_MyJPAEShop_war_1.0-SNAPSHOTPU");
    }

    @Override
    public Customer create(String firstName, String lastName, String email) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Customer c = new Customer(firstName, lastName, email);
        em.persist(c);
        em.getTransaction().commit();
        return(c);
    }

    @Override
    public Customer findById(Integer id) {
        EntityManager em = emf.createEntityManager();
        return(em.find(Customer.class, id));
    }

    @Override
    public Set<Customer> findAll() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT c FROM customers c");
        Set<Customer> customers = new HashSet<>(query.getResultList());
        
        return(customers);
    }
    
}
