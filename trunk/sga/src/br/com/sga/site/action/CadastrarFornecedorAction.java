/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sga.site.action;

import br.com.sga.site.bean.Fornecedor;
import br.com.sga.site.model.HibernateUtil;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.Query;

/**
 *
 * @author Hwoarang
 */
public class CadastrarFornecedorAction extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
    private final static String SUCCESS = "success";
    
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    public ActionForward execute(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
      //try{
        //Cria uma sessao e salva o fornecedor
        Session sessao = HibernateUtil.getSession(); // abrindo uma sessao
        Transaction transaction = sessao.beginTransaction(); // Iniciando uma transacao
             
        Fornecedor fornecedor = (Fornecedor) form;
        Date hoje = new java.sql.Date(new java.util.Date().getTime()); 
        fornecedor.setDatainclusao(hoje);          
        sessao.save(fornecedor); 
        transaction.commit();
        sessao.close();
        
        return mapping.findForward(SUCCESS);
        
    }
}