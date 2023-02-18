package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        ImageButton Back = (ImageButton) findViewById(R.id.BackBtnCart);
        Back.setOnClickListener(backToMain);

        ImageButton home = (ImageButton) findViewById(R.id.HomeBtn);
        home.setOnClickListener(backToMain);

        ImageButton search = (ImageButton) findViewById(R.id.SearchBtn);
        search.setOnClickListener(SearchActivity);
    }

    private View.OnClickListener backToMain = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(view.getContext(), MainActivity.class);
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
}