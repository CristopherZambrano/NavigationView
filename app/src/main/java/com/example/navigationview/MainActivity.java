package com.example.navigationview;

import com.example.navigationview.usuarios;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user, pass;
    Button login;
    usuarios users = new usuarios();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        pass = findViewById(R.id.password);
        login = findViewById(R.id.button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.getText().toString().equals(users.getUser1())||user.getText().toString().equals(users.getUser2())){
                    if (pass.getText().toString().equals(users.getPassword1())){
                        Intent intent = new Intent(MainActivity.this,inicio.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(MainActivity.this,"Contraseña incorrecta para "+user.getText(), Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this,"Usuario incorrecto", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}