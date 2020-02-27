package br.ifsc.edu.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {
    EditText editTextinicial, editTextfinal;
    TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    public void sorteia(View view) {
  //     Button button = (Button) view;
//       button.setTect("oi");
      TextView textView = findViewById(R.id.textView);
      EditText editTextInicial = findViewById(R.id.aditTextinicial);
      EditTextFinal = findViewById(R.id.editTextfinal);

      int valorInicial = Integer.parseInt(editTextInicial.getText().toString());
      int valorFinal = integer.parseInt(editTextfinal.getText().toString());

      textView.setText(Integer.toString(numeroSorteado));
    }
}
