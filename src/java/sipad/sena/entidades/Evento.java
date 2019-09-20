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
@Table(name = "evento")
@NamedQueries({
    @NamedQuery(name = "Evento.findAll", query = "SELECT e FROM Evento e")
    , @NamedQuery(name = "Evento.findByIdEvento", query = "SELECT e FROM Evento e WHERE e.idEvento = :idEvento")
    , @NamedQuery(name = "Evento.findByNombreEvento", query = "SELECT e FROM Evento e WHERE e.nombreEvento = :nombreEvento")
    , @NamedQuery(name = "Evento.findByHorario", query = "SELECT e FROM Evento e WHERE e.horario = :horario")
    , @NamedQuery(name = "Evento.findByInformacion", query = "SELECT e FROM Evento e WHERE e.informacion = :informacion")
    , @NamedQuery(name = "Evento.findByIdLugar", query = "SELECT e FROM Evento e WHERE e.idLugar = :idLugar")})
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_evento")
    private Integer idEvento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Nombre_Evento")
    private String nombreEvento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Horario")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Informacion")
    private String informacion;
    @Lob
    @Column(name = "foto_evento")
    private byte[] fotoEvento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_Lugar")
    private int idLugar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventoIdEvento", fetch = FetchType.EAGER)
    private List<AlumnoHasEvento> alumnoHasEventoList;
    @JoinColumn(name = "Id_Supervisor", referencedColumnName = "id_Supervisor")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Supervisor idSupervisor;

    public Evento() {
    }

    public Evento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public Evento(Integer idEvento, String nombreEvento, Date horario, String informacion, int idLugar) {
        this.idEvento = idEvento;
        this.nombreEvento = nombreEvento;
        this.horario = horario;
        this.informacion = informacion;
        this.idLugar = idLugar;
    }

    public Integer getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public byte[] getFotoEvento() {
        return fotoEvento;
    }

    public void setFotoEvento(byte[] fotoEvento) {
        this.fotoEvento = fotoEvento;
    }

    public int getIdLugar() {
        return idLugar;
    }

    public void setIdLugar(int idLugar) {
        this.idLugar = idLugar;
    }

    public List<AlumnoHasEvento> getAlumnoHasEventoList() {
        return alumnoHasEventoList;
    }

    public void setAlumnoHasEventoList(List<AlumnoHasEvento> alumnoHasEventoList) {
        this.alumnoHasEventoList = alumnoHasEventoList;
    }

    public Supervisor getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(Supervisor idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEvento != null ? idEvento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) object;
        if ((this.idEvento == null && other.idEvento != null) || (this.idEvento != null && !this.idEvento.equals(other.idEvento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sipad.sena.entidades.Evento[ idEvento=" + idEvento + " ]";
    }
    
}
