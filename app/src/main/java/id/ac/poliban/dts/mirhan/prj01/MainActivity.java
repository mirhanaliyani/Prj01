package id.ac.poliban.dts.mirhan.prj01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //deklarasikan variabel
    EditText TextNama;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //panggil variabel berdasarkan id
        TextNama=(EditText)findViewById(R.id.TxtNama);
        Hasil=(TextView)findViewById(R.id.Lb1_Nama);
    }
    //buat method TampilNama sesuai dengan property onclick pada button
    public void TampilNama(View v){
        Hasil.setText("Nama Anda: "+TextNama.getText());
    }
}
