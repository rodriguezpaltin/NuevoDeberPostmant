/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "empleados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e")
    , @NamedQuery(name = "Empleados.findByLegajo", query = "SELECT e FROM Empleados e WHERE e.legajo = :legajo")
    , @NamedQuery(name = "Empleados.findByDocumento", query = "SELECT e FROM Empleados e WHERE e.documento = :documento")
    , @NamedQuery(name = "Empleados.findBySexo", query = "SELECT e FROM Empleados e WHERE e.sexo = :sexo")
    , @NamedQuery(name = "Empleados.findByApellido", query = "SELECT e FROM Empleados e WHERE e.apellido = :apellido")
    , @NamedQuery(name = "Empleados.findByNombre", query = "SELECT e FROM Empleados e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Empleados.findByDomicilio", query = "SELECT e FROM Empleados e WHERE e.domicilio = :domicilio")
    , @NamedQuery(name = "Empleados.findBySeccion", query = "SELECT e FROM Empleados e WHERE e.seccion = :seccion")
    , @NamedQuery(name = "Empleados.findByCantidadhijos", query = "SELECT e FROM Empleados e WHERE e.cantidadhijos = :cantidadhijos")
    , @NamedQuery(name = "Empleados.findByEstadocivil", query = "SELECT e FROM Empleados e WHERE e.estadocivil = :estadocivil")
    , @NamedQuery(name = "Empleados.findByFechaingreso", query = "SELECT e FROM Empleados e WHERE e.fechaingreso = :fechaingreso")})
public class Empleados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "legajo")
    private Integer legajo;
    @Size(max = 8)
    @Column(name = "documento")
    private String documento;
    @Column(name = "sexo")
    private Character sexo;
    @Size(max = 40)
    @Column(name = "apellido")
    private String apellido;
    @Size(max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 30)
    @Column(name = "domicilio")
    private String domicilio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "seccion")
    private int seccion;
    @Column(name = "cantidadhijos")
    private Integer cantidadhijos;
    @Size(max = 10)
    @Column(name = "estadocivil")
    private String estadocivil;
    @Column(name = "fechaingreso")
    @Temporal(TemporalType.DATE)
    private Date fechaingreso;

    public Empleados() {
    }

    public Empleados(Integer legajo) {
        this.legajo = legajo;
    }

    public Empleados(Integer legajo, int seccion) {
        this.legajo = legajo;
        this.seccion = seccion;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public Integer getCantidadhijos() {
        return cantidadhijos;
    }

    public void setCantidadhijos(Integer cantidadhijos) {
        this.cantidadhijos = cantidadhijos;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (legajo != null ? legajo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.legajo == null && other.legajo != null) || (this.legajo != null && !this.legajo.equals(other.legajo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Empleados[ legajo=" + legajo + " ]";
    }
    
}
