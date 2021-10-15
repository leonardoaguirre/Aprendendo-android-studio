package Nubank.Atividade;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.teste.R;

import Nubank.Model.Usuario;
import Nubank.ViewModel.TelaCadastroViewModel;

public class TelaCadastro extends AppCompatActivity {
    private TelaCadastroViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

        ViewModelProvider vmp = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory());
        viewModel = vmp.get(TelaCadastroViewModel.class);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    public void botaoCancelarClick(View view) {
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(), TelaPrincipal.class);
        startActivity(intent);
    }

    public void botaoCadastrarClick(View view) {
        String nome = ((TextView) findViewById(R.id.txtNomeCompleto)).getText().toString().;
        String senha = ((TextView) findViewById(R.id.txtSenha)).getText().toString();

        Usuario usuario = new Usuario(1, nome, senha);
        viewModel.cadastrar(usuario);
    }
}