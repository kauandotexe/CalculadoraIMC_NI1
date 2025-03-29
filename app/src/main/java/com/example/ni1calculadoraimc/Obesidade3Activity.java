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

public class Obesidade3Activity extends AppCompatActivity {

    private TextView textoMotivacional;

    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_obesidade3);

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
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e embora o caminho pareça difícil agora, lembre-se de que você tem o poder de mudar. O primeiro passo é o mais importante, e com paciência, dedicação e pequenas escolhas diárias, você alcançará a saúde que merece. Vá com calma, você consegue!");
        }
        if (num==1) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e apesar da jornada desafiadora à frente, você está no controle de sua saúde. Comece com um passo de cada vez. Mudanças graduais e consistentes farão a diferença. Acredite no seu potencial para transformar sua vida!");
        }
        if (num==2) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e isso reflete onde você está agora, mas não define quem você será amanhã. A jornada começa com pequenas mudanças. O mais importante é dar o primeiro passo, e com paciência e comprometimento, sua vida pode melhorar a cada dia.");
        }
        if (num==3) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e isso significa que você está em um momento de mudança. Não é um caminho fácil, mas cada escolha positiva, por menor que seja, já é um progresso. Dê o primeiro passo com confiança, e lembre-se: você pode conquistar a saúde que deseja!");
        }
        if (num==4) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e isso não define o seu futuro. O que importa é o seu compromisso com o processo de mudança. A transformação leva tempo, mas com paciência, perseverança e pequenas ações diárias, você tem tudo o que é necessário para alcançar seus objetivos.");
        }
        if (num==5) {
            textoMotivacional.setText(nome + ", seu IMC é de " + result + ", e cada dia é uma nova oportunidade para cuidar de si. A mudança não precisa ser rápida, o importante é seguir em frente. Comece com pequenas vitórias diárias e, com o tempo, você verá um impacto profundo na sua saúde e bem-estar.");
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}