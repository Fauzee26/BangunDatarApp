package fauzi.hilmy.bangundatarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LingkaranActivity extends AppCompatActivity {

    EditText etJariJari;
    Button btnHitungLingkaran;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        //memanggil id widget
        etJariJari = (EditText)findViewById(R.id.etJariJari);
        btnHitungLingkaran = (Button)findViewById(R.id.btnHitungLingkaran);
        txtHasil = (TextView)findViewById(R.id.txtHasil);

        //aksi ketika button di klik
        btnHitungLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambil nilai dari widget editText dan memasukkan ke nilai string
                String nJariJari = etJariJari.getText().toString();

                //mengecek apakah editText kosong
                //kondisi ketika panjangnya kosong
                if(nJariJari.isEmpty()){
                    //memberi warning berupa error
                    etJariJari.setError("Jari Jari Tidak Boleh Kosong");
                }else{
                    //mengubah nilai dari string k integer
                    int aJariJari = Integer.parseInt(nJariJari);

                    //kondisi ktika panjang dan lebarnya tidak kosong
                    int hasilHitungKeliling = 2 * 22/7 * aJariJari;
                    int hasilHitungLuas = 22/7 * aJariJari * aJariJari;

                    //menampilkan hasil hitung ke widget textView
                    txtHasil.setText("Keliling : " + hasilHitungKeliling + " cm , Luas = " + hasilHitungLuas + " cm2");
                }
            }
        });
    }
}
