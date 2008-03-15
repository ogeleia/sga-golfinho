/*
 * AlunoAction.java
 *
 * Created on 8 de Novembro de 2007, 21:52
 */

package br.com.sga.site.action;

// import com.myapp.struts.database.AlunoTable;
// import com.myapp.struts.database.DBPool;
import br.com.sga.site.bean.Aluno;
// import br.com.sga.site.form.AlunoForm_old;
import br.com.sga.site.model.HibernateUtil;
import br.com.sga.site.negocio.AlunoBussinesDelegate;

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
 * @author OGeleia
 * @version
 */

public class AlunoAction extends Action {

	/* forward name="success" path="" */
	private final static String SUCCESS = "success";

	/**
	 * This is the action called from the Struts framework.
	 * 
	 * @param mapping
	 *            The ActionMapping used to select this instance.
	 * @param form
	 *            The optional ActionForm bean for this request.
	 * @param request
	 *            The HTTP Request we are processing.
	 * @param response
	 *            The HTTP Response we are processing.
	 * @throws java.lang.Exception
	 * @return
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		AlunoBussinesDelegate bd = new AlunoBussinesDelegate(form, request);
		return mapping.findForward(SUCCESS);

	}

}
