package fauzi.hilmy.bangundatarapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //deklarasi widget button
    Button btnPersegi, btnSegitiga, btnLingkaran, btnJajarGenjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPersegi = (Button)findViewById(R.id.btnPersegi);
        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menambah intent agar bisa pindah k activity lain
                Intent a1 = new Intent(getApplicationContext(), PersegiActivity.class);
                //agar bisa pindah activity maka kita harus nambahin startActivity
                startActivity(a1);
            }
        });
        btnSegitiga = (Button)findViewById(R.id.btnSegitiga);
        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menambah intent agar bisa pindah k activity lain
                Intent a2 = new Intent(getApplicationContext(), SegitigaActivity.class);
                //agar bisa pindah activity maka kita harus nambahin startActivity
                startActivity(a2);
            }
        });
        btnLingkaran = (Button)findViewById(R.id.btnLingkaran);
        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menambah intent agar bisa pindah k activity lain
                Intent a3 = new Intent(getApplicationContext(), LingkaranActivity.class);
                //agar bisa pindah activity maka kita harus nambahin startActivity
                startActivity(a3);
            }
        });
        btnJajarGenjang = (Button)findViewById(R.id.btnJajarGenjang);
        btnJajarGenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menambah intent agar bisa pindah k activity lain
                Intent a4 = new Intent(getApplicationContext(), JajaranGenjangActivity.class);
                //agar bisa pindah activity maka kita harus nambahin startActivity
                startActivity(a4);
            }
        });
    }
}
