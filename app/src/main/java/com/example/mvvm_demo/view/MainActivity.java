package com.example.mvvm_demo.view;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.mvvm_demo.R;
import com.example.mvvm_demo.model.Model;

public class MainActivity extends AppCompatActivity {

    Model model = new Model();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeText(View view) {
        EditText editText = findViewById(R.id.edit_text);
        TextView textView = findViewById(R.id.text_view);

        model.setText(editText.getText());
        textView.setText(model.getText());
    }
}
