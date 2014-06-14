/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author paul
 */
public class Respuesta implements Serializable{
    private String textoRespuesta;
    private String textoError;
    private ArrayList listaRespuesta;

    public Respuesta() {
    }

    public Respuesta(String textoRespuesta, String textoError, ArrayList listaRespuesta) {
        this.textoRespuesta = textoRespuesta;
        this.textoError = textoError;
        this.listaRespuesta = listaRespuesta;
    }

    /**
     * @return the textoRespuesta
     */
    public String getTextoRespuesta() {
        return textoRespuesta;
    }

    /**
     * @param textoRespuesta the textoRespuesta to set
     */
    public void setTextoRespuesta(String textoRespuesta) {
        this.textoRespuesta = textoRespuesta;
    }

    /**
     * @return the textoError
     */
    public String getTextoError() {
        return textoError;
    }

    /**
     * @param textoError the textoError to set
     */
    public void setTextoError(String textoError) {
        this.textoError = textoError;
    }

    /**
     * @return the listaRespuesta
     */
    public ArrayList getListaRespuesta() {
        return listaRespuesta;
    }

    /**
     * @param listaRespuesta the listaRespuesta to set
     */
    public void setListaRespuesta(ArrayList listaRespuesta) {
        this.listaRespuesta = listaRespuesta;
    }

   
    
}
