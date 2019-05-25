package br.com.etechoracio.ProjectEtec.dao;

import br.com.etechoracio.ProjectEtec.model.Cadastro;
import br.com.etechoracio.common.dao.BaseDAO;

public interface CadastroDAO extends BaseDAO<Cadastro> {
	
	public Cadastro findByNomeOrCodigo(String nome, int codigo);

}
