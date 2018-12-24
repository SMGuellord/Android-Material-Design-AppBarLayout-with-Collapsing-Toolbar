package com.example.smgue.appbarlayoutwithcollapsingtoolbar;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private CollapsingToolbarLayout mCollapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle("Toolbar title");

        mCollapsingToolbarLayout = findViewById(R.id.collapsingToolbar);
        mCollapsingToolbarLayout.setTitle("Collapsing Toolbar");
    }
}
