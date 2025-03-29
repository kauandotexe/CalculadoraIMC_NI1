package com.example.ni1calculadoraimc;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalculoIMCActivity extends AppCompatActivity {

    private Button voltar;
    private Button limpar;
    private Button calcular;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculo_imcactivity);

        voltar = findViewById(R.id.back);
        limpar = findViewById(R.id.limpar);
        calcular = findViewById(R.id.calcular);

        EditText altura = findViewById(R.id.altura);
        EditText peso = findViewById(R.id.peso);
        EditText nome = findViewById(R.id.campoNome);


        //código voltar
        voltar.setOnClickListener(view ->{
            finish();
        });

        //código limpar
        limpar.setOnClickListener(view ->{
            altura.setText("");
            peso.setText("");
            nome.setText("");
        });

        //código calcular
        calcular.setOnClickListener(view ->{

            //transformação de string
            String nome1 = nome.getText().toString();
            String altura1 = altura.getText().toString();
            String peso1 = peso.getText().toString();

            float alturaNum = Float.parseFloat(altura1);
            float pesoNum = Float.parseFloat(peso1);

            //resultado
            float result = pesoNum/(alturaNum*alturaNum);

            //falta transferir as informações e mandar o texto motivacional
            //troca de telas

            //abaixo do peso
            if (result < 18.5){
                Intent tela = new Intent(this, AbaixoDoPesoActivity.class);

                tela.putExtra("nome2", nome1);
                tela.putExtra("resultado", result);

                startActivity(tela);
            }

            //peso normal

            else if (result >= 18.5 && result <25){
                Intent tela = new Intent(this, PesoNormalActivity.class);

                tela.putExtra("nome2", nome1);
                tela.putExtra("resultado", result);

                startActivity(tela);
            }

            //sobrepeso

            else if (result >= 25 && result <30){
                Intent tela = new Intent(this, SobrepesoActivity.class);

                tela.putExtra("nome2", nome1);
                tela.putExtra("resultado", result);

                startActivity(tela);
            }

            //obesidade1

            else if (result >= 30 && result <35){
                Intent tela = new Intent(this, Obesidade1Activity.class);

                tela.putExtra("nome2", nome1);
                tela.putExtra("resultado", result);

                startActivity(tela);
            }

            //obesidade2

            else if (result >= 35 && result <40){
                Intent tela = new Intent(this, Obesidade2Activity.class);

                tela.putExtra("nome2", nome1);
                tela.putExtra("resultado", result);

                startActivity(tela);
            }

            //obesidade3

            else if (result >= 40){
                Intent tela = new Intent(this, Obesidade3Activity.class);

                tela.putExtra("nome2", nome1);
                tela.putExtra("resultado", result);

                startActivity(tela);
            }





        });






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}