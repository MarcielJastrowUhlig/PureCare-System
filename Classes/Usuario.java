package Classes;
// Atributos: ID, nome de usuário, senha, email.

public class Usuario {
	private int id;
	private String nomeUsuario;
	private String senhaUsuario;
	private String emailUsuario;

	public Usuario(String nomeUsuario, String senhaUsuario, String emailUsuario) {
		this.nomeUsuario = nomeUsuario;
		this.senhaUsuario = senhaUsuario;
		this.emailUsuario = emailUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [nomeUsuario=" + nomeUsuario + ", senhaUsuario=" + senhaUsuario + ", emailUsuario="
				+ emailUsuario + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
}
