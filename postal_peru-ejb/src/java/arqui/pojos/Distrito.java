/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arqui.pojos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author CARLOS
 */
@Entity
@Table(name = "distrito")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Distrito.findAll", query = "SELECT d FROM Distrito d")
    , @NamedQuery(name = "Distrito.findByCodigoDistrito", query = "SELECT d FROM Distrito d WHERE d.codigoDistrito = :codigoDistrito")
    , @NamedQuery(name = "Distrito.findByNombreDistrito", query = "SELECT d FROM Distrito d WHERE d.nombreDistrito = :nombreDistrito")
    , @NamedQuery(name = "Distrito.findByPreciobaseDistrito", query = "SELECT d FROM Distrito d WHERE d.preciobaseDistrito = :preciobaseDistrito")})
public class Distrito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo_distrito")
    private Integer codigoDistrito;
    @Basic(optional = false)
    @Column(name = "nombre_distrito")
    private String nombreDistrito;
    @Basic(optional = false)
    @Column(name = "preciobase_distrito")
    private float preciobaseDistrito;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "distritodestinoPaquete")
    private List<Paquete> paqueteList;

    public Distrito() {
    }

    public Distrito(Integer codigoDistrito) {
        this.codigoDistrito = codigoDistrito;
    }

    public Distrito(Integer codigoDistrito, String nombreDistrito, float preciobaseDistrito) {
        this.codigoDistrito = codigoDistrito;
        this.nombreDistrito = nombreDistrito;
        this.preciobaseDistrito = preciobaseDistrito;
    }

    public Integer getCodigoDistrito() {
        return codigoDistrito;
    }

    public void setCodigoDistrito(Integer codigoDistrito) {
        this.codigoDistrito = codigoDistrito;
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }

    public float getPreciobaseDistrito() {
        return preciobaseDistrito;
    }

    public void setPreciobaseDistrito(float preciobaseDistrito) {
        this.preciobaseDistrito = preciobaseDistrito;
    }

    @XmlTransient
    public List<Paquete> getPaqueteList() {
        return paqueteList;
    }

    public void setPaqueteList(List<Paquete> paqueteList) {
        this.paqueteList = paqueteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoDistrito != null ? codigoDistrito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Distrito)) {
            return false;
        }
        Distrito other = (Distrito) object;
        if ((this.codigoDistrito == null && other.codigoDistrito != null) || (this.codigoDistrito != null && !this.codigoDistrito.equals(other.codigoDistrito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "arqui.pojos.Distrito[ codigoDistrito=" + codigoDistrito + " ]";
    }
    
}
