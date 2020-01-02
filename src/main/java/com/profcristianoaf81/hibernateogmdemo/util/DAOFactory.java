package com.profcristianoaf81.hibernateogmdemo.util;
import com.profcristianoaf81.hibernateogmdemo.ContatoDAO;
import com.profcristianoaf81.hibernateogmdemo.ContatoDAOImpl;
/**
 *
 * @author cristianoaf81
 */
public class DAOFactory {
    public static ContatoDAO CriarContatoDAO(){
       ContatoDAOImpl  contato  = new ContatoDAOImpl();
       contato.setEm(HibernateJPAUTIL.getEntityManagerFactory());
       return contato;       
    }
}
