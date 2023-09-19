
//Métodos: Registrar, fazer login, atualizar perfil.

public class VetUsuario {
    private Usuario[] vetorUsuario;
    private int nElem;

    public VetUsuario(int tamanho) {
        this.vetorUsuario = new Usuario[tamanho];
        this.nElem = 0;
    }

    public int getnElem() {
        return nElem;
    }

    public Usuario getUsuario(int pos) {
        if (pos >= 0 && pos < this.nElem) {
            return this.vetorUsuario[pos];
        }
        return null;
    }

    public int pesquisa(String nome) {
        for (int i = 0; i < this.nElem; i++) {
            if (nome.equalsIgnoreCase(this.vetorUsuario[i].getNomeUsuario())) {
                return i;
            }
        }
        return -1;
    }

    public int insere(Usuario novo) {
        if (this.nElem == this.vetorUsuario.length) {
            return -1;
        } else if (pesquisa(novo.getNomeUsuario()) >= 0) {
            return -2;
        } else {
            this.vetorUsuario[this.nElem] = novo;
            this.nElem++;
            return 0;
        }
    }
}
