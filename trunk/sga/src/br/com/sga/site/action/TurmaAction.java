/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sga.site.action;

import br.com.sga.site.bean.Turma;
import br.com.sga.site.model.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.hibernate.Criteria;
import org.hibernate.criterion.*;
/**
 *
 * @author Hwoarang
 */
public class TurmaAction extends Action {
    
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
     
     //Criando uma sessao e uma transacao        
     Session sessao = HibernateUtil.getSession(); // abrindo uma sessao
     Transaction transaction = sessao.beginTransaction(); // Iniciando uma transacao  
     
     // Recebe os dados do formulario e cria os criterios de busca
     Turma turma = (Turma) form;
     String busca = new String();     
     if(request.getParameter("buscadescricao") != null){
        busca = request.getParameter("buscadescricao") ;
     }
     Criterion criton = Expression.like("descricao",busca,MatchMode.START);
     Criteria crit = sessao.createCriteria(Turma.class);
     crit.add(criton);
     
     //Executa a busca e retorna os dados
     List turmaList = crit.list();        
     request.setAttribute("turmaList", turmaList);           
     request.setAttribute("busca", busca);           
        
     transaction.commit();
     sessao.close();
     return mapping.findForward(SUCCESS);
        
    }
}