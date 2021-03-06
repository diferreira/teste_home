package br.com.fiap.teste_home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_formulario, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
                Intent intentForm = new Intent(PrincipalActivity.this, PrincipalActivity.class);
                startActivity(intentForm);
                closeOptionsMenu();

                Intent intentFechar = new Intent(PrincipalActivity.this, PrincipalActivity.class);
                startActivity(intentFechar);
                closeOptionsMenu();


        return super.onOptionsItemSelected(item);
    }

}
