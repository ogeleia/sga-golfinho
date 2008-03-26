/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sga.site.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.MatchMode;

import br.com.sga.site.bean.Aluno;

/**
 *código de acesso à camada de dados
 * @author alessandro
 */
public class DAOAluno {
	
	public List busca(String busca) {
		Session sessao = HibernateUtil.getSession(); // abrindo uma sessao
		Transaction transaction = sessao.beginTransaction(); // Iniciando uma										// transacao
		Criterion criton = Expression.like("nome", busca, MatchMode.START);
		Criteria crit = sessao.createCriteria(Aluno.class);
		crit.add(criton);
		// Executa a busca e retorna os dados
		List alunoList = crit.list();
		transaction.commit();
		sessao.close();
		return alunoList;
	}
}
