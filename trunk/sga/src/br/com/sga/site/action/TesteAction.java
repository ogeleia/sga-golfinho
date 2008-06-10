package br.com.sga.site.action;

import javax.naming.InitialContext; 
import javax.naming.NamingException;
//import br.com.sga.site.ejb.Teste;
import com.opensymphony.xwork2.ActionSupport; 

public class TesteAction extends ActionSupport {
    private String mensagem; 

    public String execute() throws NamingException {
        System.out.println("Executando TesteAction.execute"); 
        //InitialContext ctx = new InitialContext(); 
        //Teste t = (Teste) ctx.lookup("TesteBean/local");
        //mensagem = t.getMensagem();
        mensagem = "Teste123";
        return INPUT;
    } 

    public String getMensagem() {
        return mensagem; 
    } 
}
