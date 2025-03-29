package com.example.ni1calculadoraimc;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class AbaixoDoPesoActivity extends AppCompatActivity {

    private TextView textoMotivacional;

    private Button btnVoltar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_abaixo_do_peso);

        textoMotivacional = findViewById(R.id.textoM);
        btnVoltar = findViewById(R.id.Voltar);

        btnVoltar.setOnClickListener(view->{
            Intent voltar = new Intent(this, MainActivity.class);
            startActivity(voltar);
        });



        //recebimento de dados
        Bundle bundle = getIntent().getExtras();

        String nome = bundle.getString("nome2");
        float result = bundle.getFloat("resultado");

        Random random = new Random();

        int num = random.nextInt(6);

        if (num==0) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", mas não se preocupe! O que importa é sua saúde e bem-estar. Cuide do seu corpo com carinho, alimente-se bem e fortaleça-se a cada dia. Pequenos passos trazem grandes mudanças!");
        }
        if (num==1) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", mas isso não define sua força! Com paciência e bons hábitos, seu corpo responderá no tempo certo. Priorize sua saúde e celebre cada progresso!");
        }
        if (num==2) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e cada corpo tem seu tempo! Com alimentação adequada e hábitos saudáveis, você chegará onde deseja. Sua evolução é um reflexo do seu cuidado consigo mesmo!");
        }
        if (num==3) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", mas isso é apenas um sinal para que você cuide mais de si. Cada mudança que você faz em direção a uma vida mais saudável vai refletir no seu bem-estar. Dê um passo de cada vez e seja constante!");
        }
        if (num==4) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", mas cada mudança no seu estilo de vida vai te levar mais perto dos seus objetivos. Se você se esforçar para melhorar sua alimentação e hábitos, os resultados aparecerão naturalmente!");
        }
        if (num==5) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", mas isso é apenas um ponto de partida. Não tenha pressa, mas seja constante. O caminho para um corpo saudável é feito de pequenas escolhas diárias. Você consegue!");
        }






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}