package com.rajabhargava.android.ciphernotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PasswordLock extends AppCompatActivity {

    private EditText pass;
    private Button ok;
    private Button skip;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pin_unlock);

        pass = (EditText) findViewById(R.id.pin);
        ok = (Button) findViewById(R.id.ok);
        skip = (Button) findViewById(R.id.skip);

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PasswordLock.this,"Skipped",Toast.LENGTH_SHORT);
                Intent i = new Intent(PasswordLock.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i = new Intent();
//                i.putExtra("pin", pass.getText().toString());
//                setResult(Activity.RESULT_OK, i);
                Toast.makeText(PasswordLock.this,"Password added",Toast.LENGTH_SHORT);

                finish();
            }
        });
    }
}
