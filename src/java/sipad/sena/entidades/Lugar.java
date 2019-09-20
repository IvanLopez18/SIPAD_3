/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sipad.sena.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "lugar")
@NamedQueries({
    @NamedQuery(name = "Lugar.findAll", query = "SELECT l FROM Lugar l")
    , @NamedQuery(name = "Lugar.findByIdLugar", query = "SELECT l FROM Lugar l WHERE l.idLugar = :idLugar")
    , @NamedQuery(name = "Lugar.findByNombreLugar", query = "SELECT l FROM Lugar l WHERE l.nombreLugar = :nombreLugar")})
public class Lugar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Lugar")
    private Integer idLugar;
    @Size(max = 30)
    @Column(name = "Nombre_Lugar")
    private String nombreLugar;
    @Lob
    @Column(name = "foto_lugar")
    private byte[] fotoLugar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lugarIdLugar", fetch = FetchType.EAGER)
    private List<Nivel> nivelList;

    public Lugar() {
    }

    public Lugar(Integer idLugar) {
        this.idLugar = idLugar;
    }

    public Integer getIdLugar() {
        return idLugar;
    }

    public void setIdLugar(Integer idLugar) {
        this.idLugar = idLugar;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public byte[] getFotoLugar() {
        return fotoLugar;
    }

    public void setFotoLugar(byte[] fotoLugar) {
        this.fotoLugar = fotoLugar;
    }

    public List<Nivel> getNivelList() {
        return nivelList;
    }

    public void setNivelList(List<Nivel> nivelList) {
        this.nivelList = nivelList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLugar != null ? idLugar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lugar)) {
            return false;
        }
        Lugar other = (Lugar) object;
        if ((this.idLugar == null && other.idLugar != null) || (this.idLugar != null && !this.idLugar.equals(other.idLugar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sipad.sena.entidades.Lugar[ idLugar=" + idLugar + " ]";
    }
    
}
