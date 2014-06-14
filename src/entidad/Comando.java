/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import interfaz.IFiltro;
import interfaz.IParametro;
import java.io.Serializable;

/**
 *
 * @author paul
 */
public class Comando implements Serializable{
    private String textoComando;
    private String usuario;
    private String ipCliente;
    private String fechaHora;
    private IParametro parametro;
    private IFiltro filtro;

    public Comando() {
    }

    public Comando(String textoComando, String usuario, String ipCliente, String fechaHora, IParametro parametro, Filtro filtro) {
        this.textoComando = textoComando;
        this.usuario = usuario;
        this.ipCliente = ipCliente;
        this.fechaHora = fechaHora;
        this.parametro = parametro;
        this.filtro = filtro;
    }

    public IFiltro getFiltro() {
        return filtro;
    }

    public void setFiltro(IFiltro filtro) {
        this.filtro = filtro;
    }
    
    /**
     * @return the textoComando
     */
    public String getTextoComando() {
        return textoComando;
    }

    /**
     * @param textoComando the textoComando to set
     */
    public void setTextoComando(String textoComando) {
        this.textoComando = textoComando;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the ipCliente
     */
    public String getIpCliente() {
        return ipCliente;
    }

    /**
     * @param ipCliente the ipCliente to set
     */
    public void setIpCliente(String ipCliente) {
        this.ipCliente = ipCliente;
    }

    /**
     * @return the fechaHora
     */
    public String getFechaHora() {
        return fechaHora;
    }

    /**
     * @param fechaHora the fechaHora to set
     */
    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public IParametro getParametro() {
        return parametro;
    }

    public void setParametro(IParametro parametro) {
        this.parametro = parametro;
    }

    
}
