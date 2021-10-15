package Nubank.Atividade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.teste.R;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
    }

    public void botaoLoginClick(View view) {
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(), telaLogin.class);
        startActivity(intent);
    }

    public void botaoCadastroClick(View view) {
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(), TelaCadastro.class);
        startActivity(intent);
    }
}