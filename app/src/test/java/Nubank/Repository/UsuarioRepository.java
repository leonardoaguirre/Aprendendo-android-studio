package Nubank.Repository;

import android.util.Log;

import Nubank.Model.Usuario;

public class UsuarioRepository {
    public boolean verificaNome(String email) {
        boolean existe = "a@email.com".equals(email);
        return existe;
    }

    public Usuario cadastrar(Usuario usuario) {
        if (!verificaNome(usuario.getNome())) {
            Log.d(getClass().getName(), "Cadastrou o usuario de email: " + usuario.getNome());
            usuario.setId(1);
            return usuario;
        }
        Log.d(getClass().getName(), "Não cadastrou o usuario " + usuario.getNome());
        return null;
    }
}
