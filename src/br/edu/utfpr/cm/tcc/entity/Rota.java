package br.edu.utfpr.cm.tcc.entity;

public class Rota {

	private Long id;
	private Estacao estacaoOrigem;
	private Estacao estacaoDestino;
	private double distancia;
	private double tempoViagem;

	public Rota() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Estacao getEstacaoOrigem() {
		return estacaoOrigem;
	}

	public void setEstacaoOrigem(Estacao estacaoOrigem) {
		this.estacaoOrigem = estacaoOrigem;
	}

	public Estacao getEstacaoDestino() {
		return estacaoDestino;
	}

	public void setEstacaoDestino(Estacao estacaoDestino) {
		this.estacaoDestino = estacaoDestino;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double getTempoViagem() {
		return tempoViagem;
	}

	public void setTempoViagem(double tempoViagem) {
		this.tempoViagem = tempoViagem;
	}

}
