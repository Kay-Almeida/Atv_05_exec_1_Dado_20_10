package kailaine.mobile.atv_05_exec_1_dado_20_10;
/*
 *@author:<Kailaine Almeida de Souza RA: 1110482313026>
 */
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RadioButton rbD4, rbD6, rbD8, rbD10, rbD12, rbD20, rbD100 ;
    private Spinner spQtdDado;
    private Button btnRodar;
    private TextView tvTexto1, tvTexto2 ;
    private TextView tvsaida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rbD4 = findViewById(R.id.rbD4);
        rbD4.setChecked(true);
        rbD6 = findViewById(R.id.rbD6);
        rbD8 = findViewById(R.id.rbD8);
        rbD10 = findViewById(R.id.rbD10);
        rbD12 = findViewById(R.id.rbD12);
        rbD20 = findViewById(R.id.rbD20);
        rbD100 = findViewById(R.id.rbD100);
        tvsaida = findViewById(R.id.tvsaida);
        spQtdDado = findViewById(R.id.spQtdDado);
        btnRodar = findViewById(R.id.btnRodar);
        tvTexto1 = findViewById(R.id.tvTexto1);
        tvTexto2 = findViewById(R.id.tvTexto2);

        preencheSpinner();
        btnRodar.setOnClickListener(op -> rodar());
    }

    private void rodar() {
        StringBuffer buffer = new StringBuffer();
        Integer qtn = (Integer) spQtdDado.getSelectedItem();

        if(rbD4.isChecked()){
            Random random = new Random();
            int i;
            for(i=0; i<qtn; ++i){
                int randomNumber = random.nextInt(4) + 1;
                buffer.append(randomNumber);
                buffer.append(", ");
            }
            tvsaida.setText("Resultado dos Dados jogados: " + buffer.toString());

        } else if (rbD6.isChecked()) {
            Random random = new Random();
            int i;
            for(i=0; i<qtn; ++i){
                int randomNumber = random.nextInt(6) + 1;
                buffer.append(randomNumber);
                buffer.append(", ");
            }
            tvsaida.setText("Resultado dos Dados jogados: " + buffer.toString());


        } else if (rbD8.isChecked()) {
            Random random = new Random();
            int i;
            for(i=0; i<qtn; ++i){
                int randomNumber = random.nextInt(8) + 1;
                buffer.append(randomNumber);
                buffer.append(", ");
            }
            tvsaida.setText("Resultado dos Dados jogados: " + buffer.toString());

        } else if (rbD10.isChecked()) {
            Random random = new Random();
            int i;
            for(i=0; i<qtn; ++i){
                int randomNumber = random.nextInt(10) + 1;
                buffer.append(randomNumber);
                buffer.append(", ");
            }
            tvsaida.setText("Resultado dos Dados jogados: " + buffer.toString());

        } else if (rbD12.isChecked()) {
            Random random = new Random();
            int i;
            for(i=0; i<qtn; ++i){
                int randomNumber = random.nextInt(12) + 1;
                buffer.append(randomNumber);
                buffer.append(", ");
            }
            tvsaida.setText("Resultado dos Dados jogados: " + buffer.toString());


        } else if (rbD20.isChecked()) {
            Random random = new Random();
            int i;
            for(i=0; i<qtn; ++i){
                int randomNumber = random.nextInt(20) + 1;
                buffer.append(randomNumber);
                buffer.append(", ");
            }
            tvsaida.setText("Resultado dos Dados jogados: " + buffer.toString());


        } else if (rbD100.isChecked()) {
            Random random = new Random();
            int i;
            for(i=0; i<qtn; ++i){
                int randomNumber = random.nextInt(100) + 1;
                buffer.append(randomNumber);
                buffer.append(", ");
            }
            tvsaida.setText("Resultado dos Dados jogados: " + buffer.toString());

        }
    }

    private void preencheSpinner (){
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,lista);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spQtdDado.setAdapter(adapter);

    }
}