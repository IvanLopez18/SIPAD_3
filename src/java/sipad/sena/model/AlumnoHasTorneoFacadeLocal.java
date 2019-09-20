/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sipad.sena.model;

import java.util.List;
import javax.ejb.Local;
import sipad.sena.entidades.AlumnoHasTorneo;

/**
 *
 * @author ASUS
 */
@Local
public interface AlumnoHasTorneoFacadeLocal {

    void create(AlumnoHasTorneo alumnoHasTorneo);

    void edit(AlumnoHasTorneo alumnoHasTorneo);

    void remove(AlumnoHasTorneo alumnoHasTorneo);

    AlumnoHasTorneo find(Object id);

    List<AlumnoHasTorneo> findAll();

    List<AlumnoHasTorneo> findRange(int[] range);

    int count();
    
}
