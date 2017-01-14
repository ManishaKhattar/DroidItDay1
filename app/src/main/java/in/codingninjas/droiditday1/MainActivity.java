package in.codingninjas.droiditday1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView; // default value is null

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        textView.setText("Droid It !!");

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        EditText editText = (EditText) findViewById(R.id.editText);
        String str =   editText.getText().toString();
        double d = Double.parseDouble(str);
        int i =Integer.parseInt("13");
//
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.button) {

            Toast.makeText(this, "Button 1 Clicked ", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.button2){
            Toast.makeText(this, "Button 2 Clicked ", Toast.LENGTH_SHORT).show();
        }
    }
}
