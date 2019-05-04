package br.com.etechoracio.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.common.model.BaseORM;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TBL_CADASTRO")
public class Cadastro extends BaseORM {
	
	@Id @GeneratedValue
	@Column(name="COD_ETEC")
	private Long id;
	
	@Column(name="NOME_ETEC")
	private String nome;
	
	@Column(name="CEP_ETEC")
	private String cep;
	
	@Column(name="END_ETEC")
	private String endereco;
	
	@Column(name="BAI_ETEC")
	private String bairro;
	
	@Column(name="CID_ETEC")
	private String cidade;
	
	@Column(name="LAT_ETEC")
	private double latitude;
	
	@Column(name="LON_ETEC")
	private double longitude;
	
	@Column(name="DT_CRIA")
	private Date dt_criacao;
	
}
