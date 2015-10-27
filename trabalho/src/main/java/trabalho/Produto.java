package trabalho;

import java.math.BigDecimal;

public class Produto {
	
	private int id;
	private int codigodeBarra;
	private String categoria;
	private String descricao;
	private int qtd;
	private double custo;
	private BigDecimal margemLucro;
	
	//Todos os get e set dos atributos acima
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodigodeBarra() {
		return codigodeBarra;
	}
	public void setCodigodeBarra(int codigodeBarra) {
		this.codigodeBarra = codigodeBarra;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public BigDecimal getMargemLucro() {
		return margemLucro;
	}
	public void setMargemLucro(BigDecimal margemLucro) {
		this.margemLucro = margemLucro;
	}
	
	
	
	
}