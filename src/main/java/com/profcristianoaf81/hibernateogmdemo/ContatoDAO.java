/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.profcristianoaf81.hibernateogmdemo;

/**
 *
 * @author cristianoaf81
 */
public interface ContatoDAO {
    public void salvar(Contato contato);
    public void excluir(Contato contato);
    public void atualizar(Contato contato);
    public Contato buscarContatoPorID(int id);
    public void fecharConexao();
}
