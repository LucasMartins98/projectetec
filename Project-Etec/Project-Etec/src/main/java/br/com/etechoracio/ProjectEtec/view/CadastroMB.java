package br.com.etechoracio.ProjectEtec.view;



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
	
	
	public void onSave() {
		try {
			cadastroSB.save(edit);
			showInsertMessage();
		} catch (Exception e) {
			showErrorMessage(e.getMessage());
		}
		
	}
	
}
