/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sipad.sena.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sipad.sena.entidades.HorarioEntrenamiento;

/**
 *
 * @author ASUS
 */
@Stateless
public class HorarioEntrenamientoFacade extends AbstractFacade<HorarioEntrenamiento> implements HorarioEntrenamientoFacadeLocal {

    @PersistenceContext(unitName = "SIPAD_3PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HorarioEntrenamientoFacade() {
        super(HorarioEntrenamiento.class);
    }
    
}
