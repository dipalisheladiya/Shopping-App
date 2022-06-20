package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class LoremIpsumActivity extends AppCompatActivity {

    TextView edtEmail, edtPassword;
    AppCompatButton btnLorem;
    CheckBox cbRemember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lorem_ipsum);
        initview();
    }

    private void initview() {
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        btnLorem = findViewById(R.id.btnLorem);
        cbRemember = findViewById(R.id.cbRemember);

        btnLorem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Email = edtEmail.getText().toString();
                String Password = edtPassword.getText().toString();


                if (cbRemember.isChecked()) {
                    Intent intent = new Intent(LoremIpsumActivity.this,ProfileActivity.class);
                    startActivity(intent);
                }else if (Email.isEmpty()) {
                    Toast.makeText(LoremIpsumActivity.this, "Please Enter Email", Toast.LENGTH_SHORT).show();
                } else if (Password.isEmpty()) {
                    Toast.makeText(LoremIpsumActivity.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}