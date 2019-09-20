/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sipad.sena.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "torneo")
@NamedQueries({
    @NamedQuery(name = "Torneo.findAll", query = "SELECT t FROM Torneo t")
    , @NamedQuery(name = "Torneo.findByIdTorneo", query = "SELECT t FROM Torneo t WHERE t.idTorneo = :idTorneo")
    , @NamedQuery(name = "Torneo.findByNombreTorneo", query = "SELECT t FROM Torneo t WHERE t.nombreTorneo = :nombreTorneo")
    , @NamedQuery(name = "Torneo.findByHoraTorneo", query = "SELECT t FROM Torneo t WHERE t.horaTorneo = :horaTorneo")
    , @NamedQuery(name = "Torneo.findByFechaInicio", query = "SELECT t FROM Torneo t WHERE t.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Torneo.findByFechaFinal", query = "SELECT t FROM Torneo t WHERE t.fechaFinal = :fechaFinal")
    , @NamedQuery(name = "Torneo.findByDescripcionTorneo", query = "SELECT t FROM Torneo t WHERE t.descripcionTorneo = :descripcionTorneo")})
public class Torneo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_torneo")
    private Integer idTorneo;
    @Basic(optional = false)
    @Column(name = "Nombre_Torneo")
    private String nombreTorneo;
    @Basic(optional = false)
    @Column(name = "Hora_Torneo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaTorneo;
    @Basic(optional = false)
    @Column(name = "Fecha_Inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @Column(name = "Fecha_Final")
    @Temporal(TemporalType.DATE)
    private Date fechaFinal;
    @Lob
    @Column(name = "imagen_torneo")
    private byte[] imagenTorneo;
    @Column(name = "descripcion_torneo")
    private String descripcionTorneo;
    @JoinColumn(name = "Id_Lugar_Torneo", referencedColumnName = "Id_Lugar_Torneo")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private LugarTorneo idLugarTorneo;
    @JoinColumn(name = "Id_Supervisor", referencedColumnName = "id_Supervisor")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Supervisor idSupervisor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "torneoIdTorneo", fetch = FetchType.EAGER)
    private List<AlumnoHasTorneo> alumnoHasTorneoList;

    public Torneo() {
    }

    public Torneo(Integer idTorneo) {
        this.idTorneo = idTorneo;
    }

    public Torneo(Integer idTorneo, String nombreTorneo, Date horaTorneo, Date fechaInicio, Date fechaFinal) {
        this.idTorneo = idTorneo;
        this.nombreTorneo = nombreTorneo;
        this.horaTorneo = horaTorneo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public Integer getIdTorneo() {
        return idTorneo;
    }

    public void setIdTorneo(Integer idTorneo) {
        this.idTorneo = idTorneo;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public Date getHoraTorneo() {
        return horaTorneo;
    }

    public void setHoraTorneo(Date horaTorneo) {
        this.horaTorneo = horaTorneo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public byte[] getImagenTorneo() {
        return imagenTorneo;
    }

    public void setImagenTorneo(byte[] imagenTorneo) {
        this.imagenTorneo = imagenTorneo;
    }

    public String getDescripcionTorneo() {
        return descripcionTorneo;
    }

    public void setDescripcionTorneo(String descripcionTorneo) {
        this.descripcionTorneo = descripcionTorneo;
    }

    public LugarTorneo getIdLugarTorneo() {
        return idLugarTorneo;
    }

    public void setIdLugarTorneo(LugarTorneo idLugarTorneo) {
        this.idLugarTorneo = idLugarTorneo;
    }

    public Supervisor getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(Supervisor idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public List<AlumnoHasTorneo> getAlumnoHasTorneoList() {
        return alumnoHasTorneoList;
    }

    public void setAlumnoHasTorneoList(List<AlumnoHasTorneo> alumnoHasTorneoList) {
        this.alumnoHasTorneoList = alumnoHasTorneoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTorneo != null ? idTorneo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Torneo)) {
            return false;
        }
        Torneo other = (Torneo) object;
        if ((this.idTorneo == null && other.idTorneo != null) || (this.idTorneo != null && !this.idTorneo.equals(other.idTorneo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sipad.sena.entidades.Torneo[ idTorneo=" + idTorneo + " ]";
    }
    
}
