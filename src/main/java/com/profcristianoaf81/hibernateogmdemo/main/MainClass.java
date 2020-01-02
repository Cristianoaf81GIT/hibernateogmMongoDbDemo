package com.profcristianoaf81.hibernateogmdemo.main;


import com.profcristianoaf81.hibernateogmdemo.Contato;
import com.profcristianoaf81.hibernateogmdemo.ContatoBO;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

/**
 *
 * @author cristianoaf81
 */
public class MainClass {
    public static void main(String[] args) throws NotSupportedException,
            SystemException,
            RollbackException,
            HeuristicMixedException,
            HeuristicRollbackException {
        
              
        ContatoBO bo = new ContatoBO();
        Contato contato = bo.buscarPorId(3);
        if(contato != null){
            System.out.println(contato.getNome()+"-"+contato.getTel());
            bo.Atualizar(contato, "Edna G. Leite", "(35)98458-9502");
            System.out.println("contato atualizado com sucesso!!!");
        }
        
        bo = new ContatoBO();
        Contato contato2 = bo.buscarPorId(2);
        if(contato != null){
            System.out.println(contato2.getNome()+"-"+contato2.getTel());
            // excluir
            bo.excluir(contato2);
            System.out.println("removido com sucesso!!!");
        }
        
        //EntityManagerFactory emf = Persistence
        //        .createEntityManagerFactory("ogm-mongodb");
        
       //com.arjuna.ats.jta.TransactionManager.transactionManager().begin();   
       /*EntityManager em = emf.createEntityManager();
       em.persist(contato);
       em.close();*/
       //com.arjuna.ats.jta.TransactionManager.transactionManager().commit();
       
    }
}
