package entities;

public class Estadio {
	private static int qtd = 0;
	private Integer id;
	private String nome;
	private Endereco endereco;
	
	public Estadio(String nome, Endereco endereco) {
		this.id = ++qtd;
		this.nome = nome;
		this.endereco = endereco;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}
