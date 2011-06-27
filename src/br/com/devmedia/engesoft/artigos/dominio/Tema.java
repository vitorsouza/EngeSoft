package br.com.devmedia.engesoft.artigos.dominio;

public class Tema {
	private Long id;
	
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long theId) {
		this.id = theId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}