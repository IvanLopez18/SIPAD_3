/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sipad.sena.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sipad.sena.entidades.CategoriaDeportiva;

/**
 *
 * @author ASUS
 */
@Stateless
public class CategoriaDeportivaFacade extends AbstractFacade<CategoriaDeportiva> implements CategoriaDeportivaFacadeLocal {

    @PersistenceContext(unitName = "SIPAD_3PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategoriaDeportivaFacade() {
        super(CategoriaDeportiva.class);
    }
    
}
