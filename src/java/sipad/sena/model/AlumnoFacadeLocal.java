/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sipad.sena.model;

import java.util.List;
import javax.ejb.Local;
import sipad.sena.entidades.Alumno;

/**
 *
 * @author ASUS
 */
@Local
public interface AlumnoFacadeLocal {

    void create(Alumno alumno);

    void edit(Alumno alumno);

    void remove(Alumno alumno);

    Alumno find(Object id);

    List<Alumno> findAll();

    List<Alumno> findRange(int[] range);

    int count();
    
}
