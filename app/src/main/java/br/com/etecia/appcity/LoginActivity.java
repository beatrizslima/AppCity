package br.com.etecia.appcity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText senha, usuario;
    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);


        senha = findViewById(R.id.senha);
        usuario = findViewById(R.id.usuario);
        btnEntrar = findViewById(R.id.btnEntrar);

    }
}