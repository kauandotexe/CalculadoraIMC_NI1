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

public class PesoNormalActivity extends AppCompatActivity {

    private TextView textoMotivacional;

    private Button btnVoltar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_peso_normal);

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
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e você está no seu peso ideal! Isso é o reflexo do seu esforço e dedicação. Continue cuidando do seu corpo com carinho e alimentando-se bem. Cada passo te aproxima mais do equilíbrio e da saúde plena!");
        }
        if (num==1) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e você chegou onde desejava! Parabéns pelo esforço, dedicação e paciência. Manter-se saudável é um trabalho contínuo, mas você está no caminho certo. Siga firme e com confiança!");
        }
        if (num==2) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e você atingiu o seu peso ideal! Isso mostra a sua perseverança e foco. Continue com esse ritmo e lembre-se de que a verdadeira vitória está em manter o equilíbrio e a saúde todos os dias!");
        }
        if (num==3) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e você alcançou o peso ideal! Seu esforço diário está refletido nesse resultado incrível. Lembre-se de que manter a saúde exige atenção constante, mas com certeza você tem o que é necessário para seguir em frente com confiança!");
        }
        if (num==4) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e você chegou ao peso ideal! Parabéns pela disciplina e pelo esforço para alcançar essa marca. Agora é hora de manter esse equilíbrio e seguir cuidando do seu bem-estar com muito carinho!");
        }
        if (num==5) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e você está no peso perfeito! Isso é o reflexo do seu empenho em cuidar do seu corpo. Continue firme no seu objetivo de manter-se saudável e bem consigo mesmo. Sua jornada é inspiradora!");
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}