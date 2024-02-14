package com.example.login_app_image;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class imagesactivity extends Activity {
    private ImageView img1, img2, img3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.images_activity);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);

        img1.setOnClickListener(new img1());
        img2.setOnClickListener(new img2());
        img3.setOnClickListener(new img3());

    }

    private class img1 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent resultIntent = new Intent();
            resultIntent.putExtra("image_id", R.drawable.calculatoricon);
            setResult(1, resultIntent);
            finish();
        }
    }

    private class img2 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent resultIntent = new Intent();
            resultIntent.putExtra("image_id", R.drawable.stock);
            setResult(1, resultIntent);
            finish();
        }
    }

    private class img3 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent resultIntent = new Intent();
            resultIntent.putExtra("image_id", R.drawable.cctv);
            setResult(1, resultIntent);
            finish();
        }
    }
}
