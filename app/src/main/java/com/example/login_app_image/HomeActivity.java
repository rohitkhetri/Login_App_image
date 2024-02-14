package com.example.login_app_image;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class HomeActivity extends Activity {
    private TextView txtname;
    private ImageView imgUser;
    private String username;
    private int age;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        txtname = findViewById(R.id.txtname);
        imgUser = findViewById(R.id.imguser);

        Intent intent = getIntent();
        Bundle inputBundle = intent.getExtras();
        username = inputBundle.getString("username");
        age = inputBundle.getInt("22");

        txtname.setText("Welcome " + username + " (" + age + ")");

        imgUser.setOnClickListener(new btnimguser());
    }

    private class btnimguser implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent imagesactivityintent = new Intent(HomeActivity.this, imagesactivity.class);
            startActivityForResult(imagesactivityintent, 1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(data != null) {
            int imageId = data.getExtras().getInt("image_id");
            imgUser.setImageResource(imageId);
        }
    }
}