package id.sch.smktelkom_mlg.tugas01.xirpl3030.pawontlogo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox cbNG, cbAB, cbOA, cbR, cbRA, cbSA, cbS, cbDS, cbSAR, cbRO, cbANG, cbWJ;
    TextView tvHasil;
    EditText nama;
    Spinner spduduk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cbNG = (CheckBox) findViewById(R.id.checkBoxNG);
        cbAB = (CheckBox) findViewById(R.id.checkBoxAB);
        cbOA = (CheckBox) findViewById(R.id.checkBoxOA);
        cbR = (CheckBox) findViewById(R.id.checkBoxRendang);
        cbRA = (CheckBox) findViewById(R.id.checkBoxRawon);
        cbSA = (CheckBox) findViewById(R.id.checkBoxSA);
        cbS = (CheckBox) findViewById(R.id.checkBoxSinom);
        cbDS = (CheckBox) findViewById(R.id.checkBoxDS);
        cbSAR = (CheckBox) findViewById(R.id.checkBoxSaraba);
        cbRO = (CheckBox) findViewById(R.id.checkBoxRonde);
        cbANG = (CheckBox) findViewById(R.id.checkBoxAngsle);
        cbWJ = (CheckBox) findViewById(R.id.checkBoxWJ);
        nama = (EditText) findViewById((R.id.editTextNama));

        spduduk = (Spinner) findViewById(R.id.spinnerDuduk);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        findViewById(R.id.buttonOK).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }
        });
    }

    private void doClick() {

        String kamu = nama.getText().toString();
        String hasil = "Pesanan Anda: \n";
        int startlen = hasil.length();
        if (cbNG.isChecked()) hasil += cbNG.getText() + "\n";
        if (cbAB.isChecked()) hasil += cbAB.getText() + "\n";
        if (cbOA.isChecked()) hasil += cbOA.getText() + "\n";
        if (cbR.isChecked()) hasil += cbR.getText() + "\n";
        if (cbRA.isChecked()) hasil += cbRA.getText() + "\n";
        if (cbSA.isChecked()) hasil += cbSA.getText() + "\n";
        if (cbS.isChecked()) hasil += cbS.getText() + "\n";
        if (cbDS.isChecked()) hasil += cbDS.getText() + "\n";
        if (cbSAR.isChecked()) hasil += cbSAR.getText() + "\n";
        if (cbRO.isChecked()) hasil += cbRO.getText() + "\n";
        if (cbANG.isChecked()) hasil += cbANG.getText() + "\n";
        if (cbWJ.isChecked()) hasil += cbWJ.getText() + "\n";

        if (hasil.length() == startlen) hasil += "Tidak ada pada pilihan";
        tvHasil.setText("Pesanan atas nama : " + kamu + "\n" + hasil + "No Tempat Duduk: " + spduduk.getSelectedItem().toString());

    }
}
