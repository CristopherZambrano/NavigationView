package com.example.navigationview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        TextView txtuser = (TextView) findViewById(R.id.userdetail);
        TextView txttipo = (TextView) findViewById(R.id.tipouser);
        Bundle binterno = this.getIntent().getExtras();

        final DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);

        findViewById(R.id.imageMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
                //txtuser.setText(binterno.getString("user").toString());
                //txttipo.setText(binterno.getString("tipouser").toString());
            }
        });
    }
}