package Nubank.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import Nubank.Model.Usuario;
import Nubank.Repository.UsuarioRepository;

public class TelaCadastroViewModel extends ViewModel {
    private UsuarioRepository usuarioRepository;
    private MutableLiveData<Integer> menssagemErro = new MutableLiveData<>();

    public TelaCadastroViewModel() {
        usuarioRepository = new UsuarioRepository();
    }

    public void cadastrar(Usuario usuario) {
        usuarioRepository.cadastrar(usuario);
    }

    public void validaCadastro(String nome) {

    }
}
