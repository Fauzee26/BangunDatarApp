package fauzi.hilmy.bangundatarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SegitigaActivity extends AppCompatActivity {

    EditText etPanjang, etLebar, etA, etB, etC;
    Button btnHitungSegitiga;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        //memanggil id widget
        etPanjang = (EditText)findViewById(R.id.etPanjang);
        etLebar = (EditText)findViewById(R.id.etLebar);
        etA = (EditText)findViewById(R.id.etA);
        etB = (EditText)findViewById(R.id.etB);
        etC = (EditText)findViewById(R.id.etC);
        btnHitungSegitiga = (Button)findViewById(R.id.btnHitungSegitiga);
        txtHasil = (TextView)findViewById(R.id.txtHasil);

        //aksi ketika button di klik
        btnHitungSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambil nilai dari widget editText dan memasukkan ke nilai string
                String nPanjang = etPanjang.getText().toString();
                String nLebar = etLebar.getText().toString();
                String nA = etA.getText().toString();
                String nB = etB.getText().toString();
                String nC = etC.getText().toString();

                //mengecek apakah editText kosong
                //kondisi ketika panjangnya kosong
                if(nPanjang.isEmpty()){
                    //memberi warning berupa error
                    etPanjang.setError("Panjang Tidak Boleh Kosong");
                }else if (nLebar.isEmpty()){
                    //kondisi ktika lebarnya kosong
                    etLebar.setError("Lebar tidak boleh kosong");
                }else if (nA.isEmpty()){
                    //kondisi ktika lebarnya kosong
                    etA.setError("Sisi A tidak boleh kosong");
                }else if (nB.isEmpty()){
                    //kondisi ktika lebarnya kosong
                    etB.setError("Sisi B tidak boleh kosong");
                }else if (nC.isEmpty()){
                    //kondisi ktika lebarnya kosong
                    etC.setError("Sisi C tidak boleh kosong");
                }else{
                    //mengubah nilai dari string k integer
                    int aPanjang = Integer.parseInt(nPanjang);
                    int aLebar = Integer.parseInt(nLebar);
                    int aA = Integer.parseInt(nA);
                    int aB = Integer.parseInt(nB);
                    int aC = Integer.parseInt(nC);

                    //kondisi ktika panjang dan lebarnya tidak kosong
                    int hasilHitungKeliling = aA + aB + aC;
                    int hasilHitungLuas = aPanjang * aLebar / 2;

                    //menampilkan hasil hitung ke widget textView
                    txtHasil.setText("Keliling : " + hasilHitungKeliling + " cm , Luas = " + hasilHitungLuas + " cm");
                }
            }
        });
    }
}
