package com.example.grupo10;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //private Button btn_perfil; //variable para 2da forma funcionalidad boton
    private Activity miActividad; //variable para 2da forma funcionalidad boton

    private Button btn_jugar;
    private Button btn_perfil; //variable para 2da forma funcionalidad boton
    private Button btn_config;
    private Button btn_acerca_de;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2da forma funcionalidad boton ****************************
        miActividad = this;

        btn_jugar = findViewById(R.id.btn_jugar);
        btn_perfil = findViewById(R.id.btn_perfil);//hace relacion entre boton y variable para 2da forma
        btn_config = findViewById(R.id.btn_config);
        btn_acerca_de = findViewById(R.id.btn_acerca_de);

        btn_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("CLICK_MAIN", "Le he dado al boton PERFIL");//captura un mensaje de error
                Toast.makeText(miActividad, "Le he dado al boton PERFIL", Toast.LENGTH_SHORT).show();//1era forma llamado
                //Toast.makeText(MainActivity.this, "Le he dado al boton PERFIL2", Toast.LENGTH_SHORT).show();//2da forma llamado
            }
        });
        //*********************************************************

        //3era forma para dar funcionalidad a boton (la mas indicada)
        btn_jugar.setOnClickListener(this);
        btn_perfil.setOnClickListener(this);
        btn_config.setOnClickListener(this);
        btn_acerca_de.setOnClickListener(this);

    }

    //1era forma para dar funcionalidad a boton
    public void clickjugar(View v) {
        Log.e("CLICK_MAIN", "Le he dado al boton JUGAR");//captura un mensaje de error
        Toast.makeText(this, "Le he dado al boton JUGAR", Toast.LENGTH_SHORT).show();

    }

    //interfaz generada automaticamente para la 3era forma
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_jugar:
                Toast.makeText(this, getString(R.string.txt_jugar), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_perfil:
                Toast.makeText(this, getString(R.string.txt_perfil), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_config:
                Toast.makeText(this, getString(R.string.txt_ajustes), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_acerca_de:
                Toast.makeText(this, getString(R.string.txt_acerca_de), Toast.LENGTH_SHORT).show();
                break;
        }

    }

}