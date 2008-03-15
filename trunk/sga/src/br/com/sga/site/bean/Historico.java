/*
 * Historico.java
 *
 * Created on 25 de Novembro de 2007, 16:58
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
 * @author Hwoarangc
 */
public class Historico extends org.apache.struts.action.ActionForm {

    private int codigo;
    private int codigohistorico;
    private Date data;
    private char tipo;
    private String ocorrencia;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigohistorico() {
        return codigohistorico;
    }

    public void setCodigohistorico(int codigoHistorico) {
        this.codigohistorico = codigoHistorico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(String ocorrencia) {
        this.ocorrencia = ocorrencia;
    }
    
}
