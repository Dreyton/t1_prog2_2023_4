package entities;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {
	private static int qtd = 0;
	private Integer id;
	private Integer ano;
	private String nome;
	private List<Time> times = new ArrayList<>();
	private List<Partida> partidas = new ArrayList<>();

	public Campeonato(Integer ano, String nome) {
		this.id = ++qtd;
		this.ano = ano;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Time> getTimes() {
		return times;
	}

	public void addTime(Time t) {
		times.add(t);
	}

	public void removeTime(Time t) {
		times.remove(t);
	}

	public List<Partida> getPartidas() {
		return partidas;
	}

	public void addPartida(Partida p) {
		partidas.add(p);
	}

	public void removePartida(Partida p) {
		partidas.remove(p);
	}

	public void tabelaCampeonato() {
		// 1 - saldo de vitorias
		// 2 - saldo de gols
		/*
		 * int n = times.size(); int[] saldoVitorias = new int[n]; int[] saldoGols = new
		 * int[n];
		 */

		for (Partida partida : partidas) {
			if (partida.ocorreuPartida()) {
				Time mandante = partida.getMandante();
				Time visitante = partida.getVisitante();
				int saldoMandante = partida.getPontuacaoMandante() - partida.getPontuacaoVisitante();
				for (Time time : times) {
					if (mandante.getId() == time.getId() && saldoMandante > 0) {
						time.setSaldoGols(time.getSaldoGols() + saldoMandante);
						time.setSaldoVitorias(time.getSaldoVitorias() + 1);
					}
					if (mandante.getId() == time.getId() && saldoMandante < 0) {
						time.setSaldoGols(time.getSaldoGols() + saldoMandante);
						time.setSaldoVitorias(time.getSaldoVitorias() - 1);
					}
					if (visitante.getId() == time.getId() && saldoMandante > 0) {
						time.setSaldoGols(time.getSaldoGols() - saldoMandante);
						time.setSaldoVitorias(time.getSaldoVitorias() - 1);
					}
					if (visitante.getId() == time.getId() && saldoMandante < 0) {
						time.setSaldoGols(time.getSaldoGols() - saldoMandante);
						time.setSaldoVitorias(time.getSaldoVitorias() + 1);
					}
				}
			}
		}
		for (Time time : times) {
			System.out.println("Time " + time.getNome());
			System.out.println("Saldo Vitórias: " + time.getSaldoVitorias());
			System.out.println("Saldo Gols " + time.getSaldoGols());
		}
	}

	public void listarPartidas() {
		for (Partida partida : partidas) {
			if (partida.ocorreuPartida())
				System.out.println("Partida ocorrida:");
			else
				System.out.println("Partida não ocorrida:");
			System.out.println(partida);
		}
	}
}
