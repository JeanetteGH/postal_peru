/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arqui.beans;

import arqui.pojos.Paquete;
import arqui.services.DistritoFacadeLocal;
import arqui.services.PaqueteFacadeLocal;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

/**
 *
 * @author CARLOS
 */
@Named(value = "paqueteBean")
@RequestScoped
public class PaqueteBean {

    @EJB
    private DistritoFacadeLocal distritoFacade;
    @EJB
    private PaqueteFacadeLocal paqueteFacade;
    
    private Integer codigo;
    private String direccion;
    private float peso;
    private float precio;
    private String remitente;
    private String destinatario;
    private int codigoDistrito;
    
    
    public PaqueteBean() {
    }
    
    public List<Paquete> getPaquetes(){
        return paqueteFacade.findAll();
    }
    
    public float crear(){
        
        Paquete p = new Paquete();
        p.setDireccionPaquete(direccion);
        p.setPesoPaquete(peso);
        p.setRemitentePaquete(remitente);
        p.setDestinatarioPaquete(destinatario);
        p.setDistritodestinoPaquete(distritoFacade.find(codigoDistrito));
        
        float precioFinal = p.getDistritodestinoPaquete().getPreciobaseDistrito() + peso / 100;
        
        p.setPrecioenvioPaquete(precioFinal);
        
        paqueteFacade.create(p);
        
       /* try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("recibo.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(PaqueteBean.class.getName()).log(Level.SEVERE, null, ex);
        }
 */
        
        return precioFinal;
    }
    
    public String despachar(Paquete p){

        RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_INFO, "Recibo",    
        String.format("<html><h1>Recibo de despacho a domicilio \"Postal Perú\"</h1></br><h3>Recibió:</h3> %s</br><h3>Envió:</h3> %s</br><h3>Dirección:</h3> %s</br><h3>Peso:</h3> %f </br></br></html>",p.getDestinatarioPaquete(),p.getRemitentePaquete(),p.getDireccionPaquete(),p.getPesoPaquete())));
        //paqueteFacade.remove(paqueteFacade.find(codigo));
        
         paqueteFacade.remove(p);
        return "recibe.xhtml";
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public int getCodigoDistrito() {
        return codigoDistrito;
    }

    public void setCodigoDistrito(int codigoDistrito) {
        this.codigoDistrito = codigoDistrito;
    }
}
