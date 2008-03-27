package br.com.sga.site.ejb;

import javax.ejb.Stateless; 

@Stateless public class TesteBean implements Teste { 

	public String getMensagem() {
		return "EJB3.0@MouseOver Studio";
    } 

} 
