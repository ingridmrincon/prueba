/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo.lamejorcocina;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author INGRID RINCON
 */
@Stateless
public class CamareroFacade extends AbstractFacade<Camarero> {
    @PersistenceContext(unitName = "com.mycompany_LaMejorCocina_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CamareroFacade() {
        super(Camarero.class);
    }
    
}
