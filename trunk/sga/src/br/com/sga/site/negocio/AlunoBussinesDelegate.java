/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sga.site.negocio;

import java.util.Date;
import java.util.List;

import javax.naming.Context;

import br.com.sga.site.ejb.AlunoLocal;
import br.com.sga.site.entidades.Aluno;
import br.com.sga.site.model.DAOAluno;

public class AlunoBussinesDelegate {

	//private ActionForm form;
	//private HttpServletRequest request
	
	private String busca;
	private int codigo;
	
    private String status;    
    private String nome;
    private String endereco;
    private String cpf;
    private String rg;
    private String telefone;
    private Date datainclusao;
	/*
	public AlunoBussinesDelegate(ActionForm form, HttpServletRequest request) {
		this.form = form;
		this.request = request;
	}*/

	public List listar() {		
		List<Aluno> lista = null;
		try {            
	 		Context jndiContext = getInitialContext();
	        Object ref = jndiContext.lookup("AlunoBean/remote");
	        AlunoLocal aluno = (AlunoLocal)ref;
				 
			//List<Aluno>
			lista = aluno.listar();			
					
	         } catch (javax.naming.NamingException ne){
	        	 ne.printStackTrace();
	         }
	         return lista;			
	}
	
	public List buscar() {		
		List<Aluno> lista = null;
		try {            
	 		Context jndiContext = getInitialContext();
	        Object ref = jndiContext.lookup("AlunoBean/remote");
	        AlunoLocal aluno = (AlunoLocal)ref;
				 
			//List<Aluno>	       
			lista = aluno.buscar(busca);			
					
	         } catch (javax.naming.NamingException ne){
	        	 ne.printStackTrace();
	         }
	         return lista;			
	}

	public List editar() {		
		List<Aluno> lista = null;
		try {            
	 		Context jndiContext = getInitialContext();
	        Object ref = jndiContext.lookup("AlunoBean/remote");
	        AlunoLocal aluno = (AlunoLocal)ref;
				 
			//List<Aluno>	       
			lista = aluno.editar(codigo);			
					
	         } catch (javax.naming.NamingException ne){
	        	 ne.printStackTrace();
	         }
	         return lista;			
	}
	public String salvar(){
		//List<Aluno> lista = null;
		String resultado = "";
		try {            
	 		Context jndiContext = getInitialContext();
	        Object ref = jndiContext.lookup("AlunoBean/remote");
	        AlunoLocal alunoL = (AlunoLocal)ref;
			Aluno a = new Aluno();
	        a.setCodigo(codigo);	        
	        a.setNome(nome);
	        a.setEndereco(endereco);
	        a.setTelefone(telefone);
	        a.setCpf(cpf);
	        a.setRg(rg);
	        a.setStatus(status);
	        a.setDatainclusao(datainclusao);
	
	        resultado = alunoL.salvar(a);
			//List<Aluno>	       
			//lista = aluno.editar(codigo);			
					
	         } catch (javax.naming.NamingException ne){
	        	 ne.printStackTrace();
	         }		
	
		return resultado;
	}
	
	public String cadastrar(){
		//List<Aluno> lista = null;
		String resultado = "";
		try {            
	 		Context jndiContext = getInitialContext();
	        Object ref = jndiContext.lookup("AlunoBean/remote");
	        AlunoLocal alunoL = (AlunoLocal)ref;
			Aluno a = new Aluno();
	        a.setCodigo(codigo);	        
	        a.setNome(nome);
	        a.setEndereco(endereco);
	        a.setTelefone(telefone);
	        a.setCpf(cpf);
	        a.setRg(rg);
	        a.setStatus(status);
	        a.setDatainclusao(datainclusao);
	
	        resultado = alunoL.cadastrar(a);
			//List<Aluno>	       
			//lista = aluno.editar(codigo);			
					
	         } catch (javax.naming.NamingException ne){
	        	 ne.printStackTrace();
	         }		
	
		return resultado;
	}

	
	public static Context getInitialContext() throws javax.naming.NamingException  {		
		return new javax.naming.InitialContext();  
	}

	public void setBusca(String busca) {
		this.busca = busca;
	}

	public String getBusca() {
		return busca;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDatainclusao() {
        return datainclusao;
    }

    public void setDatainclusao(Date datainclusao) {
        this.datainclusao = datainclusao;
    }

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
