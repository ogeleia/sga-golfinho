/*
 * AlunoAction.java
 *
 * Created on 8 de Novembro de 2007, 21:52
 */

package br.com.sga.site.action;

import com.opensymphony.xwork2.ActionSupport;
import br.com.sga.site.negocio.AlunoBussinesDelegate;
import java.util.List;

public class AlunoAction extends ActionSupport  {

	private static final long serialVersionUID = 1L;	
	//private final static String SUCCESS = "success";
	private final static String SUCCESS = "input";
	
	public String listar() throws Exception {
		AlunoBussinesDelegate bd = new AlunoBussinesDelegate();
		List alunoList = bd.listAll();
		//request.setAttribute("alunoList", alunoList);
		//request.setAtribute("busca", busca);		
		return SUCCESS;
	}

}
