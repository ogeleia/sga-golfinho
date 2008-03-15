/*
 * UsuarioGrupo.java
 *
 * Created on 25 de Novembro de 2007, 17:25
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package br.com.sga.site.bean;

//import java.io.Serializable;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


/**
 *
 * @author Hwoarang
 */
public class UsuarioGrupo extends org.apache.struts.action.ActionForm {
    
    private int codigousuario;
    private int codigogrupo;
    /** Creates a new instance of UsuarioGrupo */
    
    
    public UsuarioGrupo() {
    }

    public int getCodigousuario() {
        return codigousuario;
    }

    public void setCodigousuario(int codigousuario) {
        this.codigousuario = codigousuario;
    }

    public int getCodigogrupo() {
        return codigogrupo;
    }

    public void setCodigogrupo(int codigogrupo) {
        this.codigogrupo = codigogrupo;
    }
    
}
