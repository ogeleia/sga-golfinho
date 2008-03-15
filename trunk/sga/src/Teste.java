/*
 * Teste.java
 *
 * Created on 18 de Novembro de 2007, 14:22
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Hwoarang
 */
import br.com.sga.site.model.HibernateUtil;
//import br.com.sga.site.model.Aluno;
//import br.com.sga.site.model.Pessoa;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;


public class Teste {
    
    /** Creates a new instance of Teste */
    public static void main(String[] args) {
        Session sessao = HibernateUtil.getSession(); // abrindo uma sessao
        Transaction transaction = sessao.beginTransaction(); // Iniciando uma transacao
/*
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ricardo");
        pessoa.setEndereco("Av. Uniminas, 33");
        pessoa.setRgie("MG-12345");
        pessoa.setCpfcnpj(123456789000.0);
        pessoa.setStatus('A');
        pessoa.setTipo('X');
        pessoa.setTelefone("(34)3214-2250");
        pessoa.setDatainclusao(new Date());
        sessao.save(pessoa);
        */
        
        Query select = sessao.createQuery("from Pessoa");
        List objetos = select.list();
      /*  
        Pessoa teste;
        for (int i = 0; i < objetos.size(); i++) {
           teste = (Pessoa) objetos.get(i); 
           System.out.println("\n >> "+teste.getCodigo()+";  "+teste.getStatus()+"; "+teste.getNome());
        }
        */
        
   //     Aluno aluno = new Aluno();
   //     aluno.setStatus('B');
        
        /*
        Query select = sessao.createQuery("from Aluno");
        List objetos = select.list();
        sessao.save(aluno);
         */
        
        /*
        Aluno teste;
        for (int i = 0; i < objetos.size(); i++) {
           teste = (Aluno) objetos.get(i); 
           System.out.println("\n >> "+teste.getStatus());
        }
         */
        
        /*
        Aluno aluno = new Aluno();
        aluno.setStatus('C');
        sessao.save(aluno);
        
        select = sessao.createQuery("from Aluno");
        objetos = select.list();
        
        for (int i = 0; i < objetos.size(); i++) {
           teste = (Aluno) objetos.get(i); 
           System.out.println(" => "+teste.getStatus());
        }
          */ 

        transaction.commit(); // finalizando a transacao
        sessao.close(); // fechando a sessao
        
    }
}
