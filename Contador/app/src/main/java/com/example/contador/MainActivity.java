package com.example.contador;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador=0;
    }


    public void  IncrementarContador(View vista){
        contador++;
        mostarResultado();
    }

    public void resetearContador(View vista){

        contador=0;
        mostarResultado();

    }

    public  void desecrementacontador(View vista){
        contador--;
        mostarResultado();
    }

    public void mostarResultado(){
        TextView textoResultado=(TextView) findViewById(R.id.ContadorPulsacion);

        textoResultado.setText("Contador: "+contador);

    }


}


