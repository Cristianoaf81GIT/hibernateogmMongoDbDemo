package com.profcristianoaf81.hibernateogmdemo;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author cristianoaf81
 */
public class ContatoDAOImpl implements ContatoDAO {
    
    @Getter @Setter private EntityManager em;
    
    public ContatoDAOImpl(){
        try {
            com.arjuna.ats.jta.TransactionManager.transactionManager().begin();
        } catch (NotSupportedException | SystemException ex) {
            System.out.println("ContatoDAOImpl "+ex.getMessage());
        }
    } 
    
       
    @Override
    public void salvar(Contato contato) {
        this.em.persist(contato);
        
    }

    @Override
    public void excluir(Contato contato) {
        this.em.remove(contato);        
    }

    @Override
    public void atualizar(Contato contato) {
        this.em.persist(contato);
    }

    @Override
    public Contato buscarContatoPorID(int id) {
        Contato contato = null;        
        try{
            contato = (Contato) this.em.find(Contato.class, id);
            return contato;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return contato;
    }

    @Override
    public void fecharConexao() {
        try {
            com.arjuna.ats.jta.TransactionManager.transactionManager().commit();
            this.em.close();
        } catch (RollbackException 
                | HeuristicMixedException 
                | HeuristicRollbackException 
                | SecurityException 
                | IllegalStateException 
                | SystemException ex) {
            System.out.println("fecharConexao "+ex.getMessage());
        }
    }

}
