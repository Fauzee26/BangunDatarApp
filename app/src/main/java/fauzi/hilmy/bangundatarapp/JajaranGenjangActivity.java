package fauzi.hilmy.bangundatarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class JajaranGenjangActivity extends AppCompatActivity {

    EditText etAlas, etTinggi, etMiring;
    Button btnHitungJajar;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajaran_genjang);

        //memanggil id widget
        etAlas = (EditText)findViewById(R.id.etAlas);
        etTinggi = (EditText)findViewById(R.id.etTinggi);
        etMiring = (EditText)findViewById(R.id.etMiring);
        btnHitungJajar = (Button)findViewById(R.id.btnHitungJajar);
        txtHasil = (TextView)findViewById(R.id.txtHasil);

        //aksi ketika button di klik
        btnHitungJajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambil nilai dari widget editText dan memasukkan ke nilai string
                String nAlas = etAlas.getText().toString();
                String nTinggi = etTinggi.getText().toString();
                String nMiring = etMiring.getText().toString();

                //mengecek apakah editText kosong
                //kondisi ketika panjangnya kosong
                if(nAlas.isEmpty()){
                    //memberi warning berupa error
                    etAlas.setError("Alas Tidak Boleh Kosong");
                }else if (nTinggi.isEmpty()){
                    //kondisi ktika lebarnya kosong
                    etTinggi.setError("Tinggi tidak boleh kosong");
                }else if (nMiring.isEmpty()){
                    //kondisi ktika lebarnya kosong
                    etMiring.setError("Sisi Miring tidak boleh kosong");
                }else{
                    //mengubah nilai dari string k integer
                    int aAlas = Integer.parseInt(nAlas);
                    int aTinggi = Integer.parseInt(nTinggi);
                    int aMiring = Integer.parseInt(nMiring);

                    //kondisi ktika panjang dan lebarnya tidak kosong
                    int hasilHitungKeliling = 2 * (aAlas + aMiring);
                    int hasilHitungLuas = aAlas * aTinggi;

                    //menampilkan hasil hitung ke widget textView
                    txtHasil.setText("Keliling : " + hasilHitungKeliling + " cm , Luas = " + hasilHitungLuas + " cm2");
                }
            }
        });
    }
}
