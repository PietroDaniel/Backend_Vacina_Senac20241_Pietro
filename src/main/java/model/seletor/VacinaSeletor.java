package model.seletor;

import java.sql.Date;

public class VacinaSeletor extends BaseSeletor{
	
	private String nomePais;
	private String nomePesquisador;
	private String nomeVacina;
	private Date dataInicioPesquisa;

	public VacinaSeletor(String nomePais, String nomePesquisador, String nomeVacina, Date dataInicioPesquisa) {
		super();
		this.nomePais = nomePais;
		this.nomePesquisador = nomePesquisador;
		this.nomeVacina = nomeVacina;
		this.dataInicioPesquisa = dataInicioPesquisa;
	}

	public String getNomePais() {
		return nomePais;
	}

	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}

	public String getNomePesquisador() {
		return nomePesquisador;
	}

	public void setNomePesquisador(String nomePesquisador) {
		this.nomePesquisador = nomePesquisador;
	}

	public String getNomeVacina() {
		return nomeVacina;
	}

	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}

	public Date getDataInicioPesquisa() {
		return dataInicioPesquisa;
	}

	public void setDataInicioPesquisa(Date dataInicioPesquisa) {
		this.dataInicioPesquisa = dataInicioPesquisa;
	}

	public VacinaSeletor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLimite() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getOffset() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public boolean temPaginação() {
		// TODO Auto-generated method stub
		return false;
	}
}
