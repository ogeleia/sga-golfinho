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
import java.util.Date;
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
	
	public String listarAlunos() throws Exception {		
		AlunoBussinesDelegate bd = new AlunoBussinesDelegate();
		List alunoList = bd.listar();		 
		request.setAttribute("alunoList", alunoList);		
		return INPUT;
	}
	
	public String buscarAlunos() throws Exception {
		AlunoBussinesDelegate bd = new AlunoBussinesDelegate();
		bd.setBusca(this.request.getParameter("busca"));
		List alunoList = bd.buscar();		 
		request.setAttribute("alunoList", alunoList);		
		return INPUT;
	}
	
	public String editarAluno() throws Exception {
		AlunoBussinesDelegate bd = new AlunoBussinesDelegate();
		bd.setCodigo(Integer.parseInt(this.request.getParameter("cod")));
		List alunoList = bd.editar();		 
		request.setAttribute("alunoList", alunoList);		
		return INPUT;
	}
	
	public String salvarAluno() throws Exception {
		AlunoBussinesDelegate bd = new AlunoBussinesDelegate();
		bd.setCodigo(Integer.parseInt(this.request.getParameter("cod")));		
		bd.setNome(this.request.getParameter("nome"));
        bd.setEndereco(this.request.getParameter("endereco"));
        bd.setTelefone(this.request.getParameter("telefone"));
        bd.setCpf(this.request.getParameter("cpf"));
        bd.setRg(this.request.getParameter("rg"));
        bd.setStatus(this.request.getParameter("status"));
        //faça a coisa certa!!      
        bd.setDatainclusao(new Date());
		String retorno = bd.salvar();		 
		//request.setAttribute("alunoList", alunoList);
		request.setAttribute("resultado", retorno);
		return INPUT;
	}
	
	public String cadastrarAluno() throws Exception {
		AlunoBussinesDelegate bd = new AlunoBussinesDelegate();
		//bd.setCodigo(Integer.parseInt(this.request.getParameter("cod")));		
		bd.setNome(this.request.getParameter("nome"));
        bd.setEndereco(this.request.getParameter("endereco"));
        bd.setTelefone(this.request.getParameter("telefone"));
        bd.setCpf(this.request.getParameter("cpf"));
        bd.setRg(this.request.getParameter("rg"));
        bd.setStatus("0");
        //faça a coisa certa!!      
        bd.setDatainclusao(new Date());
		String retorno = bd.cadastrar();		 
		//request.setAttribute("alunoList", alunoList);
		request.setAttribute("resultado", retorno);
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
