/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sga.site.action;

import br.com.sga.site.bean.Usuario;
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
public class EditarUsuarioAction extends Action {
    
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
         Usuario usuario = (Usuario) sessao.get(Usuario.class, new Integer(Integer.parseInt(request.getParameter("cod"))));     
         Usuario usuariof = (Usuario) form;
         
         usuario.setNome(usuariof.getNome());
         usuario.setSenha(usuariof.getSenha());
         usuario.setEndereco(usuariof.getEndereco());
         usuario.setTelefone(usuariof.getTelefone());
         usuario.setCpf(usuariof.getCpf());
         usuario.setRg(usuariof.getRg());
         usuario.setDatainclusao(usuariof.getDatainclusao());
         usuario.setStatus(usuariof.getStatus());
         
         transaction.commit();
         sessao.close();
       
     }catch(Exception e){
        //return mapping.findForward(FAILURE);
     }
     return mapping.findForward(SUCCESS);
        
    }
}
