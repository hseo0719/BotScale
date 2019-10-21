package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;

public class managesysteminventory extends AppCompatActivity {

    private static EditText userId, itemId, itemName, itemDescription, unitOfMeasure, SKU;
    private Button Scanner, addItem, manualInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_managesysteminventory);

        addItem = findViewById(R.id.btn_add_inventory_items);


        addItem.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(managesysteminventory.this, add_inventory.class);
                startActivity(i);
                //finish();
            }
        });

    }

}
