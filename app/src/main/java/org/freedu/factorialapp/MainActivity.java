package org.freedu.factorialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView factorial;
    private EditText number;
    private Button factbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factorial = findViewById(R.id.factid);
        number = findViewById(R.id.number);
        factbtn = findViewById(R.id.btn);

        factbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(number.getText().toString());
                int result = factorial(num);
                factorial.setText(""+result);
                Toast.makeText(MainActivity.this, "Congrates, your factorial is: "+result, Toast.LENGTH_LONG).show();
            }
        });
    }
    public int factorial(int number){
        int i, fact = 1;
        for(i=1; i<=number; i++){
            fact = fact*i;
        }
        return fact;
    }
}