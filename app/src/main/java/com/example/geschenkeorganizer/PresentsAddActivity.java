package com.example.geschenkeorganizer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


public class PresentsAddActivity extends AppCompatActivity implements PresentsAddFragment.OnListItemChangedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_presents);
        Intent intent = getIntent();
        if (intent == null) {
            Toast.makeText(this, "Create your new present here!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onListItemChanged() {

    }

}