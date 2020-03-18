package com.example.mvvm_demo;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeText(View view) {
        TextView textView = findViewById(R.id.text_view);
        EditText editText = findViewById(R.id.edit_text);

        CharSequence text = editText.getText();
        textView.setText(text);
    }
}
