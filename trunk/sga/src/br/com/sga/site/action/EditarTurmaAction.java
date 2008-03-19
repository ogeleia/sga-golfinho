/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sga.site.action;

import br.com.sga.site.bean.Turma;
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
public class EditarTurmaAction extends Action {
    
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
         Turma turma = (Turma) sessao.get(Turma.class, new Integer(Integer.parseInt(request.getParameter("cod"))));     
         Turma turmaf = (Turma) form;
         
         turma.setDescricao(turmaf.getDescricao());
         turma.setModalidade(turmaf.getModalidade());
         turma.setClasse(turmaf.getClasse());
         turma.setHorario(turmaf.getHorario());
         turma.setCodigoprofessor(turmaf.getCodigoprofessor());
         turma.setStatus(turmaf.getStatus());
         
         transaction.commit();
         sessao.close();
       
     }catch(Exception e){
        //return mapping.findForward(FAILURE);
     }
     return mapping.findForward(SUCCESS);
        
    }
}