package br.com.etechoracio.ProjectEtec.view;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.etechoracio.ProjectEtec.business.CadastroSB;
import br.com.etechoracio.ProjectEtec.model.Cadastro;
import br.com.etechoracio.common.view.BaseMB;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Controller
@Scope("view")
public class CadastroMB extends BaseMB {
	
	@Autowired
	private CadastroSB cadastroSB;
	
	
	private List<Cadastro> registros;
	
	private Cadastro edit = new Cadastro();
	
	protected void postConstruct() {
		registros = cadastroSB.findAll();
	}
	
	public void onRemove(Cadastro cadastro) {
		cadastroSB.remove(cadastro);
		registros = cadastroSB.findAll();
		showDeleteMessage();
	}
	
	public void onUpdate(Cadastro cadastro){
		edit = cadastro;
	} 
	
	public void onSave() {
		try {
			cadastroSB.save(edit);
			registros = cadastroSB.findAll();
			showInsertMessage();
		} catch (Exception e) {
			showErrorMessage(e.getMessage());
		}
		
	}
	
}
