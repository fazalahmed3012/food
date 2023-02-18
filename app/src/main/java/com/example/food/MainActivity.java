package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton search = (ImageButton) findViewById(R.id.SearchBtn);
        search.setOnClickListener(SearchActivity);
        ImageButton cart = (ImageButton) findViewById(R.id.Cartbtn);
        cart.setOnClickListener(checkout);
        ImageView soup = (ImageView) findViewById(R.id.soup);
        soup.setOnClickListener(ProductPage);

    }

    private View.OnClickListener ProductPage = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(view.getContext(), ProductDetail.class);
            view.getContext().startActivity(intent);

        }
    };

    private View.OnClickListener SearchActivity = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(view.getContext(), Search.class);
            view.getContext().startActivity(intent);

        }
    };

    private View.OnClickListener checkout = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(view.getContext(), Cart.class);
            view.getContext().startActivity(intent);

        }
    };
}