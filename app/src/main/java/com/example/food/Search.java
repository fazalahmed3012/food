package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ImageButton search = (ImageButton) findViewById(R.id.BackBtnSearch);
        search.setOnClickListener(backToMain);

        ImageButton cart = (ImageButton) findViewById(R.id.CartBtn);
        cart.setOnClickListener(checkout);

        ImageButton home = (ImageButton) findViewById(R.id.HomeBtn);
        home.setOnClickListener(backToMain);
    }

    private View.OnClickListener backToMain = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(view.getContext(), MainActivity.class);
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