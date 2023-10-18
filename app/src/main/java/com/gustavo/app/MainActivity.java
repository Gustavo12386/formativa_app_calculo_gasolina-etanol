package com.gustavo.app;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculocombustivel(View view){
        TextView texto = findViewById(R.id.textResultado);
        EditText etanol = findViewById(R.id.editEtanol);
        EditText gasolina = findViewById(R.id.editGasolina);
        String opcao = "";
        int num1, num2, preco;

        num1 = Integer.parseInt(etanol.getText().toString());
        num2 = Integer.parseInt(gasolina.getText().toString());

        preco = (num1/num2)*100;

        if(preco <= 70) {
           opcao = "Etanol";
           texto.setText("É melhor abastecer com:" + opcao);
        } else{
            opcao = "Gasolina";
            texto.setText("É melhor abastecer com:" + opcao);
        }

    }
}