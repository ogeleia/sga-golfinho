/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sga.site.negocio;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionForm;
import br.com.sga.site.bean.Aluno;
import br.com.sga.site.model.DAOAluno;
/**
 * 
 * @author alessandro
 */
public class AlunoBussinesDelegate {

	private ActionForm form;
	private HttpServletRequest request;
	public AlunoBussinesDelegate(ActionForm form, HttpServletRequest request) {
		this.form = form;
		this.request = request;
	}

	public void busca() {
		// Recebe os dados do formulario e cria os criterios de busca
		Aluno aluno = (Aluno) form;
		String busca = new String();
		if (request.getParameter("buscanome") != null) {
			busca = request.getParameter("buscanome");
		}
		DAOAluno dao = new DAOAluno();
		List alunoList = dao.busca(busca);
		
		request.setAttribute("alunoList", alunoList);
		request.setAttribute("busca", busca);
	}

}
