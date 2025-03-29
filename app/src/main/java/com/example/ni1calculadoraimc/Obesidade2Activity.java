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

public class Obesidade2Activity extends AppCompatActivity {

    private TextView textoMotivacional;

    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_obesidade2);


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
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e você tem a oportunidade de transformar sua saúde para melhor. Embora o caminho possa parecer longo, lembre-se de que cada passo dado é um avanço. O mais importante é começar, e você tem a força necessária para isso!");
        }
        if (num==1) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e isso não define quem você é nem seu futuro. O que importa agora é a ação. A jornada pode ser difícil, mas com persistência e foco, você alcançará seu objetivo. Dê o primeiro passo hoje e saiba que você não está sozinho!");
        }
        if (num==2) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e isso é apenas um reflexo do momento atual. A mudança é um processo gradual e você tem toda a capacidade de começar a reescrever sua história de saúde. Não tenha pressa, o importante é começar e seguir em frente, passo a passo.");
        }
        if (num==3) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e a mudança começa com uma decisão. Embora a jornada possa ser longa, cada esforço, por menor que seja, faz uma grande diferença no seu corpo e na sua saúde. Com paciência e perseverança, você pode alcançar seus objetivos!");
        }
        if (num==4) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e o que importa agora é o seu compromisso com a mudança. A saúde é uma jornada, não um destino. Acredite no seu potencial para dar passos positivos todos os dias, e com o tempo, verá grandes resultados. Continue firme!");
        }
        if (num==5) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e esse número não define o que você pode alcançar. A verdadeira transformação vem com o esforço contínuo. Comece com escolhas saudáveis todos os dias e lembre-se: a jornada é mais importante que o destino. Você tem tudo para conquistar seu bem-estar!");
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}