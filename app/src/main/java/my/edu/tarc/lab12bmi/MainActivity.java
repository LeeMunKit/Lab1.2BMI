package my.edu.tarc.lab12bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    TextView textViewBMI;
    EditText editTextHeight;
    EditText editTextWeight;
    ImageView imageView;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewBMI = (TextView) findViewById(R.id.textViewBMI);
        editTextHeight = (EditText) findViewById(R.id.editTextHeight);
        editTextWeight = (EditText) findViewById(R.id.editTextWeight);
        imageView = (ImageView) findViewById(R.id.imageView);
    }


    public void displayBMI(View v){




        double height =  Double.parseDouble(editTextHeight.getText().toString());
        double weight =  Double.parseDouble(editTextWeight.getText().toString());
        double bmi = weight/ (height*height);
        if(bmi <= 18.5){
            imageView.setImageResource(R.drawable.under);
            textViewBMI.setText("You are under weight");
        }else if(bmi>=25){
            imageView.setImageResource(R.drawable.over);
            textViewBMI.setText("You are over weight");
        }else{
            imageView.setImageResource(R.drawable.normal);
            textViewBMI.setText("You are normal");
        }

    }

    public void clearText(View v){


        imageView.setImageResource(R.drawable.empty);
        textViewBMI.setText(" ");
        editTextHeight.setText("");
        editTextWeight.setText("");

    }
}
