package com.yur0k.task3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

import static android.provider.Telephony.Mms.Part.TEXT;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button_OK);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.city_Name);
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra(TEXT, editText.getText().toString());
                startActivity(intent);
            }
        });
    }
}
