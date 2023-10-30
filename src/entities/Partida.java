package entities;

import java.time.LocalDateTime;

public class Partida {
	private static int qtd = 0;
	private Integer id;
	private LocalDateTime data;
	private Time mandante;
	private Time visitante;
	private Integer pontuacaoMandante;
	private Integer pontuacaoVisitante;

	public Partida(LocalDateTime data, Time mandante, Time visitante) {
		this.id = ++qtd;
		this.data = data;
		this.mandante = mandante;
		this.visitante = visitante;
	}

	public Integer getId() {
		return id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Time getMandante() {
		return mandante;
	}

	public void setMandante(Time mandante) {
		this.mandante = mandante;
	}

	public Time getVisitante() {
		return visitante;
	}

	public void setVisitante(Time visitante) {
		this.visitante = visitante;
	}

	public Integer getPontuacaoMandante() {
		return pontuacaoMandante;
	}

	public void setPontuacaoMandante(Integer pontuacaoMandante) {
		this.pontuacaoMandante = pontuacaoMandante;
	}

	public Integer getPontuacaoVisitante() {
		return pontuacaoVisitante;
	}

	public void setPontuacaoVisitante(Integer pontuacaoVisitante) {
		this.pontuacaoVisitante = pontuacaoVisitante;
	}

}
