package application;

import java.time.LocalDate;
import java.time.LocalDateTime;

import entities.Campeonato;
import entities.Endereco;
import entities.Estadio;
import entities.Jogador;
import entities.Partida;
import entities.Time;

public class Program {

	public static void main(String[] args) {
		//1 campeonato, 3 times, 4 partidas, 2 jogadore(a)s em cada time
		
		Jogador j1 = new Jogador("João", LocalDate.of(1989, 10, 4), "Masculino", 1.79);
		Jogador j2 = new Jogador("Lucas", LocalDate.of(1999, 4, 14), "Masculino", 1.82);
		
		Endereco e1 = new Endereco("Rua A", 10, "Entre B e C", "Tenoné");
		Estadio es1 = new Estadio("Estádio A", e1);
		Time t1 = new Time("Time A", es1);
		t1.addJogador(j1);
		t1.addJogador(j2);
		t1.setEstadio(es1);
		t1.setCapitao(j1);
		
		Jogador j3 = new Jogador("Zé", LocalDate.of(1978, 11, 2), "Masculino", 1.77);
		Jogador j4 = new Jogador("Tião", LocalDate.of(1977, 6, 18), "Masculino", 1.85);
		
		Endereco e2 = new Endereco("Rua B", 11, "Entre A e C", "Marambaia");
		Estadio es2 = new Estadio("Estádio B", e2);
		Time t2 = new Time("Time B", es2);
		t2.addJogador(j3);
		t2.addJogador(j4);
		t2.setEstadio(es2);
		t2.setCapitao(j4);
		
		Jogador j5 = new Jogador("Astrogildo", LocalDate.of(1981, 12, 12), "Masculino", 1.71);
		Jogador j6 = new Jogador("Popovich", LocalDate.of(1988, 8, 28), "Masculino", 1.89);
		
		Endereco e3 = new Endereco("Rua C", 12, "Entre B e E", "Sousa");
		Estadio es3 = new Estadio("Estádio C", e3);
		Time t3 = new Time("Time C", es3);
		t3.addJogador(j5);
		t3.addJogador(j6);
		t3.setEstadio(es3);
		t3.setCapitao(j5);
		
		Campeonato c1 = new Campeonato(2023, "Copa da várzea");
		c1.addTime(t1);
		c1.addTime(t2);
		c1.addTime(t3);
		
		Partida p1 = new Partida(LocalDateTime.parse("2023-09-01T20:00:00"), t1, t2);
		p1.setPontuacaoMandante(10);
		p1.setPontuacaoVisitante(7);
		
		Partida p2 = new Partida(LocalDateTime.parse("2023-09-05T19:30:00"), t1, t3);
		p2.setPontuacaoMandante(15);
		p2.setPontuacaoVisitante(13);
		
		Partida p3 = new Partida(LocalDateTime.parse("2023-10-02T20:00:00"), t2, t1);
		p3.setPontuacaoMandante(10);
		p3.setPontuacaoVisitante(10);
		
		Partida p4 = new Partida(LocalDateTime.parse("2023-10-16T21:00:00"), t2, t3);
		p4.setPontuacaoMandante(10);
		p4.setPontuacaoVisitante(17);
		
		//Partida p5 = new Partida(LocalDateTime.parse("2023-11-16T21:00:00"), t3, t1);
		Partida p5 = new Partida(LocalDateTime.parse("2023-10-31T21:00:00"), t3, t1);
		p5.setPontuacaoMandante(10);
		p5.setPontuacaoVisitante(7);
		Partida p6 = new Partida(LocalDateTime.parse("2023-11-30T22:00:00"), t3, t2);
		
		c1.addPartida(p1);
		c1.addPartida(p2);
		c1.addPartida(p3);
		c1.addPartida(p4);
		c1.addPartida(p5);
		c1.addPartida(p6);
		
		c1.listarPartidas();
		c1.tabelaCampeonato();
	}

}
