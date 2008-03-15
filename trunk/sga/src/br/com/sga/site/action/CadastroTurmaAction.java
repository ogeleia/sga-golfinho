/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sga.site.action;

import br.com.sga.site.model.HibernateUtil;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;



/**
 *
 * @author OGeleia
 */
public class CadastroTurmaAction extends org.apache.struts.action.Action {
    
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
     
     //Executa a busca e retorna os dados
     try{
        //Modalidade
        Query querymodalidade = sessao.createQuery("from Modalidade");
        List modalidadeList = querymodalidade.list();        
        request.setAttribute("modalidadeList", modalidadeList);           
        
        //Classe
        Query queryclasse = sessao.createQuery("from Classe");
        List classeList = queryclasse.list();        
        request.setAttribute("classeList", classeList);     
        
         //Classe
        Query queryprofessor = sessao.createQuery("from Professor p where p.status = 1");
        List professorList = queryprofessor.list();        
        request.setAttribute("professorList", professorList);
        
     }catch(Exception e){
        return mapping.findForward(SUCCESS);
     }   
     return mapping.findForward(SUCCESS);
        
    }
}