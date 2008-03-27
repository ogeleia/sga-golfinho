/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sga.site.negocio;

import java.util.List;
import br.com.sga.site.model.DAOAluno;

public class AlunoBussinesDelegate {

	//private ActionForm form;
	//private HttpServletRequest request;
	/*
	public AlunoBussinesDelegate(ActionForm form, HttpServletRequest request) {
		this.form = form;
		this.request = request;
	}*/

	public List listAll() {		
		DAOAluno dao = new DAOAluno();
		List lista = dao.listAll();
		return lista;		
	}

}
