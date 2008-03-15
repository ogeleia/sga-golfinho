/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sga.site.bean;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Hwoarang
 */
public class Plano extends org.apache.struts.action.ActionForm {
    
    private int codigo;
    private String descricao;
    private double percentualdesconto;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPercentualdesconto() {
        return percentualdesconto;
    }

    public void setPercentualdesconto(double percentualdesconto) {
        this.percentualdesconto = percentualdesconto;
    }
    

}
