package com.profcristianoaf81.hibernateogmdemo;

import com.profcristianoaf81.hibernateogmdemo.util.DAOFactory;

/**
 *
 * @author cristianoaf81
 */
public class ContatoBO {
    @SuppressWarnings("FieldMayBeFinal")
    private ContatoDAO contatoDAO;

    public ContatoBO() {
       this.contatoDAO = DAOFactory.CriarContatoDAO();
    }
    
    public void Salvar(Contato contato){
        if("".equals(contato.getNome()) || "".equals(contato.getTel()))
        {
            try {
                throw new ContatoBOExeption("Erro o contato deve ter "
                        + "nome e telefone");
            } catch (ContatoBOExeption ex) {
                
            }
        }else{
            this.contatoDAO.salvar(contato);
            this.contatoDAO.fecharConexao();
        }
            
    
    }
    
    public void Atualizar(Contato contato,String nome,String telefone){
         if("".equals(contato.getNome()) || "".equals(contato.getTel()))
        {
            try {
                throw new ContatoBOExeption("Erro o contato deve ter "
                        + "nome e telefone");
            } catch (ContatoBOExeption ex) {
                
            }
        }else{
            contato.setNome(nome);
            contato.setTel(telefone);
            this.contatoDAO.atualizar(contato);
            this.contatoDAO.fecharConexao();
        }
    }
    
    public Contato buscarPorId(int id){
        Contato contato = null;
        if(id > 0)
        {
            contato = this.contatoDAO.buscarContatoPorID(id);
        }else{
             try {
                throw new ContatoBOExeption("Erro o contato deve possuir "
                        + "um código");
            } catch (ContatoBOExeption ex) {
                
            }
        }
        
        return contato;
    }
    
    public void excluir(Contato contato){
        if(contato.getId()>0){
            this.contatoDAO.excluir(contato);
            this.contatoDAO.fecharConexao();
        }
        
    }
}
