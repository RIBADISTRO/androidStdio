package com.example.contador;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    //Variable publico
    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializar la variable a cero
        //Para que no guarde ningun datos
        contador=0;
    }


    // Creao loa metodos para realizar las funciones del boton
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
        TextView textoResultado=(TextView) findViewById(R.id.contaodorNumeros);

        textoResultado.setText(" "+contador);

    }


}


