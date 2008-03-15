/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sga.site.action;

import br.com.sga.site.bean.Modulo;
import br.com.sga.site.model.HibernateUtil;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Hwoarang
 */
public class EditarModuloAction extends Action {
    
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
     
    Session sessao = HibernateUtil.getSession(); // abrindo uma sessao
     Transaction transaction = sessao.beginTransaction(); // Iniciando uma transacao
     
     try{
         //busca o objeto
         Modulo modulo = (Modulo) sessao.get(Modulo.class, new Integer(Integer.parseInt(request.getParameter("cod"))));     
         Modulo modulof = (Modulo) form;
         
         modulo.setNome(modulof.getNome());
         modulo.setStatus(modulof.getStatus());
         
         transaction.commit();
         sessao.close();
       
     }catch(Exception e){
        //return mapping.findForward(FAILURE);
     }
     return mapping.findForward(SUCCESS);
        
    }
}
