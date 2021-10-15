package Nubank.Atividade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.teste.R;

public class telaLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);
    }

    public void botaoCancelarClick(View view) {
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(), TelaPrincipal.class);
        startActivity(intent);
    }
}