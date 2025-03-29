package com.example.ni1calculadoraimc;

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

public class Obesidade1Activity extends AppCompatActivity {

    private TextView textoMotivacional;

    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_obesidade1);

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
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e isso marca o início de um novo capítulo. Você tem o poder de transformar sua saúde e bem-estar. Não veja isso como um obstáculo, mas como uma oportunidade para se reconectar com seu corpo. O melhor de você está por vir!");
        }
        if (num==1) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e isso não define seu futuro. A verdadeira mudança acontece quando você decide agir. Lembre-se: cada pequeno esforço de hoje é um grande avanço para sua saúde. Tenha paciência consigo mesmo e celebre cada progresso!");

        }
        if (num==2) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", mas isso é apenas uma foto do momento. O que importa é o caminho que você está construindo. Comece com metas pequenas, mas desafiadoras. O importante é continuar, um passo de cada vez, em direção ao seu objetivo!");
        }
        if (num==3) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", mas isso é apenas uma referência para onde você está agora. O foco deve ser a saúde, o bem-estar e a confiança que você está criando em cada escolha. O mais importante é dar um passo positivo a cada dia!");
        }
        if (num==4) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e isso reflete o ponto inicial de um grande potencial para mudanças. O segredo está na consistência. O que você faz todos os dias é o que determina o seu futuro. Concentre-se no que você pode controlar agora e siga em frente!");
        }
        if (num==5) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e esse número não define quem você é ou o que você pode alcançar. As verdadeiras mudanças vêm da consistência e da paciência. Comece onde está, use o que tem e vá até onde puder. Você tem todo o poder para mudar!");
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}