package seletor;

public class VacinaSeletor {
	
	private String nomePais;
	private String nomePesquisador;
	private String nomeVacina;
	private boolean paginacaoAtiva;
	private int limite; // Número máximo de registros por página
	private int pagina; // Número da página atual

	public VacinaSeletor() {
		// Inicialize com paginação ativa e valores padrão para limite e página
		this.paginacaoAtiva = true;
		this.limite = 10; // valor padrão para o limite
		this.pagina = 1; // valor padrão para a página inicial
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

	public boolean temPaginacao() {
		return paginacaoAtiva;
	}

	public void setPaginacaoAtiva(boolean paginacaoAtiva) {
		this.paginacaoAtiva = paginacaoAtiva;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public int getOffset() {
		// Calcula o offset como (número da página - 1) * limite
		return (pagina - 1) * limite;
	}

	public int getPagina() {
		return pagina;
	}

	public void setPagina(int pagina) {
		this.pagina = pagina;
	}
}
