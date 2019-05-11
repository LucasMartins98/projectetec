package br.com.etechoracio.ProjectEtec.business;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.etechoracio.ProjectEtec.dao.CadastroDAO;
import br.com.etechoracio.ProjectEtec.model.Cadastro;
import br.com.etechoracio.common.business.BaseSB;

@Service
public class CadastroSB extends BaseSB {

	private CadastroDAO cadastroDAO;
	
	@Override
	protected void postConstructImpl() {
		cadastroDAO = getDAO(CadastroDAO.class);
		
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void save(Cadastro cadastro) {
		cadastroDAO.save(cadastro);
	}
}
