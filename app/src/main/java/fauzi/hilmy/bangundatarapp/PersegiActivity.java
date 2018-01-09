package fauzi.hilmy.bangundatarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiActivity extends AppCompatActivity {

    EditText etPanjang, etLebar;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        //memanggil id widget
        etPanjang = (EditText)findViewById(R.id.etPanjang);
        etLebar = (EditText)findViewById(R.id.etLebar);
        btnHitung = (Button)findViewById(R.id.btnHitungPersegi);
        txtHasil = (TextView)findViewById(R.id.txtHasil);

        //aksi ketika button di klik
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambil nilai dari widget editText dan memasukkan ke nilai string
                String nPanjang = etPanjang.getText().toString();
                String nLebar = etLebar.getText().toString();

                //mengecek apakah editText kosong
                //kondisi ketika panjangnya kosong
                if(nPanjang.isEmpty()){
                    //memberi warning berupa error
                    etPanjang.setError("Panjang Tidak Boleh Kosong");
                }else if (nLebar.isEmpty()){
                    //kondisi ktika lebarnya kosong
                    etLebar.setError("Lebar tidak boleh kosong");
                }else{
                    //mengubah nilai dari string k integer
                    int aPanjang = Integer.parseInt(nPanjang);
                    int aLebar = Integer.parseInt(nLebar);
                    
                    //kondisi ktika panjang dan lebarnya tidak kosong
                    int hasilHitungKeliling = (2 * aPanjang) + (2 * aLebar);
                    int hasilHitungLuas = aPanjang * aLebar;

                    //menampilkan hasil hitung ke widget textView
                    txtHasil.setText("Keliling : " + hasilHitungKeliling + " cm ,Luas = " + hasilHitungLuas + " cm");
                }
            }
        });

    }
}
