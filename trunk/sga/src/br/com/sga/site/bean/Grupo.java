/*
 * Grupo.java
 *
 * Created on 25 de Novembro de 2007, 16:43
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
public class Grupo extends org.apache.struts.action.ActionForm {
    
    private int codigo;
    private String nome;
    private char status;
    
    /** Creates a new instance of Grupo */
    public Grupo() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    
}
