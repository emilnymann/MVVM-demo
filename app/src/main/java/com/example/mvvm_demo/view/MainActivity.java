package com.example.mvvm_demo.view;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.mvvm_demo.R;
import com.example.mvvm_demo.model.Model;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity implements Observer {

    private Model model = new Model();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        model.addObserver(this);
    }

    public void changeText(View view) {
        EditText editText = findViewById(R.id.edit_text);
        model.setText(editText.getText());
    }

    @Override
    public void update(Observable o, Object arg) {
        TextView textView = findViewById(R.id.text_view);
        textView.setText(model.getText());
    }
}
