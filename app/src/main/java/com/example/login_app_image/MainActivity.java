package com.example.login_app_image;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txtUsername, txtpassword;
    private EditText edtUsername, edtPassword;
    private Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin = findViewById(R.id.btnlogin);
        txtUsername = findViewById(R.id.txtUsername);
        txtpassword = findViewById(R.id.txtPassword);
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);

        btnlogin.setOnClickListener(new btnLoginClickListener());

    }

    private class btnLoginClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if(edtUsername.getText().toString().equals("rohit") && edtPassword.getText().toString().equals("rohit")){
                Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_LONG).show();
                //intent home activity
                Intent homeactivityintent = new Intent(MainActivity.this, HomeActivity.class);

                homeactivityintent.putExtra("username", edtUsername.getText().toString());
                homeactivityintent.putExtra("age", 21);

                startActivity(homeactivityintent);

                finish();
            }
            else {
                Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_LONG).show();
            }
        }
    }
}