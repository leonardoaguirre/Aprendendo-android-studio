package Nubank.Model;

public class Usuario {
    private long id;
    private String nome;
    private String senha;

    public Usuario() {
    }

    public Usuario(long id, String email, String senha) {
        this.id = id;
        this.nome = email;
        this.senha = senha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
