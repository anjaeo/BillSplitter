package net.androidbootcamp.courseproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    float billAmt;
    float splits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final EditText amt = (EditText)findViewById(R.id.txtBillAmt);
        final EditText number = (EditText)findViewById(R.id.txtNumber);


        Button button = findViewById(R.id.btnCalculate);
         button.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {


            billAmt = Float.parseFloat(amt.getText().toString());
            splits = Float.parseFloat(number.getText().toString());


            next_page(v);
        }

    });
}

    public void next_page(View v) {
        Intent intent = new Intent(this, Calculate.class);
        Bundle extras = new Bundle();

        extras.putFloat("key1", billAmt);
        extras.putFloat("key2", splits);
        intent.putExtras(extras);
        startActivity(intent);
    }


}
