package br.com.etechoracio.business;

import org.springframework.stereotype.Service;

import br.com.etechoracio.common.business.BaseSB;
import br.com.etechoracio.dao.CadastroDAO;
import br.com.etechoracio.model.Cadastro;

@Service
public class CadastroSB extends BaseSB {

	private CadastroDAO cadastroDAO;
	
	@Override
	protected void postConstructImpl() {
		cadastroDAO = getDAO(CadastroDAO.class);
		
	}
	
	public void save(Cadastro cadastro) {
		cadastroDAO.save(cadastro);
	}
	
}
