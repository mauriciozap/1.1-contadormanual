package com.example.mauri.contadormauri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText CampoConteo;
    private Button BotonContar ;
    private Button BotonReiniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CampoConteo = (EditText) findViewById(R.id.campo_conteo);
        BotonContar = (Button) findViewById(R.id.boton_contar);
        BotonReiniciar = (Button) findViewById(R.id.boton_reiniciar);

        BotonContar.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                String c = CampoConteo.getText().toString();
                int cont = Integer.parseInt(c) ;
                int r = cont + 1;
                c = String.valueOf(r);
                CampoConteo.setText(c);

            }
        });
        BotonReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CampoConteo.setText("0");



            }
        });

    }
}