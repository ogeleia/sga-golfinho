/*
 * Matricula.java
 *
 * Created on 25 de Novembro de 2007, 17:04
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
public class Matricula extends org.apache.struts.action.ActionForm {
    
    private int codigo;
    private int codigoaluno;
    private int codigoturma;
    private int codigoplano;
    private char status;
    private double valormensalidade;
    
    /** Creates a new instance of Matricula */
    public Matricula() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoaluno() {
        return codigoaluno;
    }

    public void setCodigoaluno(int codigoaluno) {
        this.codigoaluno = codigoaluno;
    }

    public int getCodigoturma() {
        return codigoturma;
    }

    public void setCodigoturma(int codigoturma) {
        this.codigoturma = codigoturma;
    }

    public int getCodigoplano() {
        return codigoplano;
    }

    public void setCodigoplano(int codigoplano) {
        this.codigoplano = codigoplano;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public double getValormensalidade() {
        return valormensalidade;
    }

    public void setValormensalidade(double valormensalidade) {
        this.valormensalidade = valormensalidade;
    }
    
}
