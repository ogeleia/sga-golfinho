/*
 * GrupoModulo.java
 *
 * Created on 25 de Novembro de 2007, 16:53
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package br.com.sga.site.bean;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
/**
 *
 * @author Hwoarang
 */
public class GrupoModulo extends org.apache.struts.action.ActionForm {
    
    private int codigogrupo;
    private int codigousuario;
    
    /** Creates a new instance of GrupoModulo */
    public GrupoModulo() {
    }

    public int getCodigogrupo() {
        return codigogrupo;
    }

    public void setCodigogrupo(int codigogrupo) {
        this.codigogrupo = codigogrupo;
    }

    public int getCodigousuario() {
        return codigousuario;
    }

    public void setCodigousuario(int codigousuario) {
        this.codigousuario = codigousuario;
    }

    
}
