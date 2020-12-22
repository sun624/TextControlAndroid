package com.yichun.Textcontrol;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//region AutoCompleteTextView
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> aa = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line,
                new String[]{"ENTD322 Android Application Development"});

        autoCompleteTextView.setAdapter(aa);
//endregion

// region MultiAutoCompleteTextView

        MultiAutoCompleteTextView multiAutoCompleteTextView = findViewById(R.id.multiAutoCompleteTextView);
        ArrayAdapter<String> aa2 = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line,new String[]{"Bonk","Peter"});

        multiAutoCompleteTextView.setAdapter(aa2);

        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
// endregion
    }
}

