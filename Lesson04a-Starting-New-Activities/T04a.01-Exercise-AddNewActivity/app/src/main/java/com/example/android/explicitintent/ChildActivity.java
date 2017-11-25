package com.example.android.explicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

// COMPLETED (1) Use Android Studio's Activity wizard to create a new Activity called ChildActivity
public class ChildActivity extends AppCompatActivity {

    // COMPLETED (6) Create a TextView field to display your message
    private TextView mDisplayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        // COMPLETED (7) Get a reference to your TextView in Java
        mDisplayTextView = (TextView) findViewById(R.id.tv_display);
    }
}
