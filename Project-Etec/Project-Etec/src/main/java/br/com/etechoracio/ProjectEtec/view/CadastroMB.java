package br.com.etechoracio.ProjectEtec.view;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.model.DualListModel;
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
	
	private Cadastro edit = new Cadastro();
	
	private DualListModel<Cadastro> cadastros;
	
	
	public void postConstruct() {
		List<Cadastro> source = cadastroSB.findAll();
		cadastros = new DualListModel<Cadastro>(source, new ArrayList<Cadastro>());
	}
	
	
	public void onSave() {	
		if(cadastros.getTarget().size() > 2){
			showErrorMessage("Etec já cadastrada");
		}
		
		cadastroSB.save(edit);
		showInsertMessage();
	}
	
}
