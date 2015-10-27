package trabalho;

public class Cliente {

	private int id;
	private String nome;
	private String telefone;
	private String cidade;
	private Estado estado;
	private String email;
	private Genero genero;

	//Todos os get e set dos atributos acima
	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private String getTelefone() {
		return telefone;
	}
	private void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	private String getCidade() {
		return cidade;
	}
	private void setCidade(String cidade) {
		this.cidade = cidade;
	}
	private Estado getEstado() {
		return estado;
	}
	private void setEstado(Estado estado) {
		this.estado = estado;
	}
	private String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	private Genero getGenero() {
		return genero;
	}
	private void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
}
