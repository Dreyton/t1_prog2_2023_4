package entities;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private static int qtd = 0;
	private Integer id;
	private String nome;
	private List<Jogador> jogadores = new ArrayList<>();
	private Estadio estadio;
	private Jogador capitao;
	
	public Time(String nome, Estadio estadio) {
		this.id = ++qtd;
		this.nome = nome;
		this.estadio = estadio;
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

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void addJogador(Jogador j) {
		jogadores.add(j);
	}
	
	public void removeJogador(Jogador j) {
		jogadores.remove(j);
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	public Jogador getCapitao() {
		return capitao;
	}

	public void setCapitao(Jogador capitao) {
		this.capitao = capitao;
	}
	
	
	
}