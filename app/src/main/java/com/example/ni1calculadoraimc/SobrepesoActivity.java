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

public class SobrepesoActivity extends AppCompatActivity {

    private TextView textoMotivacional;

    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sobrepeso);

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
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e isso é um sinal de que você pode melhorar sua saúde! Lembre-se de que a mudança é um processo gradual e cada escolha saudável que você faz te aproxima mais dos seus objetivos. Confie no seu potencial!");
        }
        if (num==1) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e esse é o momento perfeito para começar a cuidar de si! O importante é dar o primeiro passo e ser constante. Seu esforço de hoje vai refletir no seu corpo e mente amanhã. Vá com calma e não desista!");

        }
        if (num==2) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", mas isso não é o fim da sua jornada. O caminho para um corpo saudável é feito de pequenos passos diários. Comece com ações simples, como uma alimentação equilibrada e exercícios, e logo você verá os resultados!");
        }
        if (num==3) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e você está no controle! Cada mudança que você faz no seu estilo de vida te aproxima da versão mais saudável de si mesmo. Não subestime o poder de pequenos ajustes diários. Você tem toda a capacidade para evoluir!");
        }
        if (num==4) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e isso é apenas um reflexo do seu momento atual. O mais importante é o que você fará a partir de agora. Com empenho e paciência, você conseguirá alcançar seus objetivos de saúde. Dê o primeiro passo hoje!");
        }
        if (num==5) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e você já começou a sua jornada! Mudanças saudáveis são feitas um passo de cada vez. Continue com o foco em cuidar do seu corpo e de sua saúde, e com o tempo você alcançará seu objetivo!");
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}