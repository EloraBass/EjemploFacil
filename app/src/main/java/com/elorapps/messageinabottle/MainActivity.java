package com.elorapps.messageinabottle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public Button boton;
    public EditText nombre;
    public TextView saludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.button);
        nombre = (EditText) findViewById(R.id.editText);
        saludo = (TextView) findViewById(R.id.textView);

        boton.setOnClickListener(this);
        saludo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button) {
            if (nombre.getText().toString().isEmpty()) {
                saludo.setText("Hola Perraca");
            } else {
                saludo.setText("Hola " + nombre.getText());
            }
        }else if(view.getId() == R.id.textView){
            //Toast.makeText(this, "QUE NO SOY UN BOTÓN QUE SOY UN TEXT", Toast.LENGTH_LONG).show();
            Intent i = new Intent(MainActivity.this, ClaseDos.class);
            startActivity(i);
        }
    }
}
