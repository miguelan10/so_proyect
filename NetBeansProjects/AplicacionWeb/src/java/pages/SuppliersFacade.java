/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelos.Suppliers;

/**
 *
 * @author miguels
 */
@Stateless
public class SuppliersFacade extends AbstractFacade<Suppliers> {

    @PersistenceContext(unitName = "AplicacionWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SuppliersFacade() {
        super(Suppliers.class);
    }
    
}
