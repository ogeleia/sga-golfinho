/*
 * AlunoAction.java
 *
 * Created on 8 de Novembro de 2007, 21:52
 */

package br.com.sga.site.action;


import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import br.com.sga.site.bean.Aluno;
import br.com.sga.site.model.HibernateUtil;
import br.com.sga.site.negocio.AlunoBussinesDelegate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Criteria;
import org.hibernate.criterion.*;

public class AlunoAction extends ActionSupport implements ServletRequestAware,ServletResponseAware {

	private static final long serialVersionUID = 1L;	
	//private final static String SUCCESS = "success";
	private final static String SUCCESS = "SUCCESS";
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	public String listar() throws Exception {
		/*
		//AlunoBussinesDelegate bd = new AlunoBussinesDelegate();
		//List alunoList = bd.listAll();
		 
		Session sessao = HibernateUtil.getSession(); // abrindo uma sessao
	    Transaction transaction = sessao.beginTransaction(); // Iniciando uma transacao
	    
	  //busca o objeto
        Aluno aluno = (Aluno) sessao.get(Aluno.class, new Integer(Integer.parseInt("1")));     
        transaction.commit();
        sessao.close();
        
        //Retorna os dados
        List alunoList = new  ArrayList();
        alunoList.add(aluno);   
        request.setAttribute("alunoList", alunoList);
        
		//request.setAttribute("alunoList", alunoList);
		//request.setAtribute("busca", busca);	*/	
		 return INPUT;
	}
	
	public void setServletRequest(HttpServletRequest request){
	    this.request = request;
	  }

	  public HttpServletRequest getServletRequest(){
	    return request;
	  }

	  public void setServletResponse(HttpServletResponse response){
	    this.response = response;
	  }

	  public HttpServletResponse getServletResponse(){
	    return response;
	  }

}
