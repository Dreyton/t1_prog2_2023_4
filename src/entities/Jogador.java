package entities;

import java.time.LocalDate;

public class Jogador {
	private static int qtd = 0;
	private Integer id;
	private String nome;
	private LocalDate nascimento;
	private String genero;
	private Double altura;

	public Jogador(String nome, LocalDate nascimento, String genero, Double altura) {
		this.id = ++qtd;
		this.nome = nome;
		this.nascimento = nascimento;
		this.genero = genero;
		this.altura = altura;
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

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

}
