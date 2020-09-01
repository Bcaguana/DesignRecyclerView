package com.example.designrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;

public class SnackBarActivity extends AppCompatActivity {

    private ConstraintLayout parent;
    private Button btnShowSnackbar;
    private MaterialCardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);

        parent = findViewById(R.id.parent);
        btnShowSnackbar = findViewById(R.id.button);
        cardView = findViewById(R.id.cardView);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SnackBarActivity.this, "Card Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btnShowSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnackbar();
            }
        });

    }

    private void showSnackbar(){
        Snackbar this_is_a_snackbar = Snackbar.make(parent, "This is a Snackbar", Snackbar.LENGTH_INDEFINITE);
        this_is_a_snackbar.setAction("Retry", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SnackBarActivity.this, RecycleActivity.class);
                startActivity(intent);
            }
        });
        this_is_a_snackbar.setActionTextColor(Color.RED);
        this_is_a_snackbar.setTextColor(Color.YELLOW);
        this_is_a_snackbar.show();
    }
}