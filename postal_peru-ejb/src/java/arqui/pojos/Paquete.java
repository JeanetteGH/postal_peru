/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arqui.pojos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author CARLOS
 */
@Entity
@Table(name = "paquete")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paquete.findAll", query = "SELECT p FROM Paquete p")
    , @NamedQuery(name = "Paquete.findByCodigoPaquete", query = "SELECT p FROM Paquete p WHERE p.codigoPaquete = :codigoPaquete")
    , @NamedQuery(name = "Paquete.findByDireccionPaquete", query = "SELECT p FROM Paquete p WHERE p.direccionPaquete = :direccionPaquete")
    , @NamedQuery(name = "Paquete.findByPesoPaquete", query = "SELECT p FROM Paquete p WHERE p.pesoPaquete = :pesoPaquete")
    , @NamedQuery(name = "Paquete.findByPrecioenvioPaquete", query = "SELECT p FROM Paquete p WHERE p.precioenvioPaquete = :precioenvioPaquete")
    , @NamedQuery(name = "Paquete.findByRemitentePaquete", query = "SELECT p FROM Paquete p WHERE p.remitentePaquete = :remitentePaquete")
    , @NamedQuery(name = "Paquete.findByDestinatarioPaquete", query = "SELECT p FROM Paquete p WHERE p.destinatarioPaquete = :destinatarioPaquete")})
public class Paquete implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo_paquete")
    private Integer codigoPaquete;
    @Basic(optional = false)
    @Column(name = "direccion_paquete")
    private String direccionPaquete;
    @Basic(optional = false)
    @Column(name = "peso_paquete")
    private float pesoPaquete;
    @Basic(optional = false)
    @Column(name = "precioenvio_paquete")
    private float precioenvioPaquete;
    @Basic(optional = false)
    @Column(name = "remitente_paquete")
    private String remitentePaquete;
    @Basic(optional = false)
    @Column(name = "destinatario_paquete")
    private String destinatarioPaquete;
    @JoinColumn(name = "distritodestino_paquete", referencedColumnName = "codigo_distrito")
    @ManyToOne(optional = false)
    private Distrito distritodestinoPaquete;

    public Paquete() {
    }

    public Paquete(Integer codigoPaquete) {
        this.codigoPaquete = codigoPaquete;
    }

    public Paquete(Integer codigoPaquete, String direccionPaquete, float pesoPaquete, float precioenvioPaquete, String remitentePaquete, String destinatarioPaquete) {
        this.codigoPaquete = codigoPaquete;
        this.direccionPaquete = direccionPaquete;
        this.pesoPaquete = pesoPaquete;
        this.precioenvioPaquete = precioenvioPaquete;
        this.remitentePaquete = remitentePaquete;
        this.destinatarioPaquete = destinatarioPaquete;
    }

    public Integer getCodigoPaquete() {
        return codigoPaquete;
    }

    public void setCodigoPaquete(Integer codigoPaquete) {
        this.codigoPaquete = codigoPaquete;
    }

    public String getDireccionPaquete() {
        return direccionPaquete;
    }

    public void setDireccionPaquete(String direccionPaquete) {
        this.direccionPaquete = direccionPaquete;
    }

    public float getPesoPaquete() {
        return pesoPaquete;
    }

    public void setPesoPaquete(float pesoPaquete) {
        this.pesoPaquete = pesoPaquete;
    }

    public float getPrecioenvioPaquete() {
        return precioenvioPaquete;
    }

    public void setPrecioenvioPaquete(float precioenvioPaquete) {
        this.precioenvioPaquete = precioenvioPaquete;
    }

    public String getRemitentePaquete() {
        return remitentePaquete;
    }

    public void setRemitentePaquete(String remitentePaquete) {
        this.remitentePaquete = remitentePaquete;
    }

    public String getDestinatarioPaquete() {
        return destinatarioPaquete;
    }

    public void setDestinatarioPaquete(String destinatarioPaquete) {
        this.destinatarioPaquete = destinatarioPaquete;
    }

    public Distrito getDistritodestinoPaquete() {
        return distritodestinoPaquete;
    }

    public void setDistritodestinoPaquete(Distrito distritodestinoPaquete) {
        this.distritodestinoPaquete = distritodestinoPaquete;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoPaquete != null ? codigoPaquete.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paquete)) {
            return false;
        }
        Paquete other = (Paquete) object;
        if ((this.codigoPaquete == null && other.codigoPaquete != null) || (this.codigoPaquete != null && !this.codigoPaquete.equals(other.codigoPaquete))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "arqui.pojos.Paquete[ codigoPaquete=" + codigoPaquete + " ]";
    }
    
}
