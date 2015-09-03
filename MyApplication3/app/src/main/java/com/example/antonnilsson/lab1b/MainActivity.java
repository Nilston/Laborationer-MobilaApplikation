package com.example.antonnilsson.lab1b;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private EditText etName;
    private EditText etPhone;
    private EditText etMail;
    private TextView tvSummary;
    private Button btnSummary;
    private Button btnColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeButtons();
    }

    private void initializeButtons() {
        etName = (EditText)findViewById(R.id.editText);
        etPhone = (EditText)findViewById(R.id.editText2);
        etMail = (EditText)findViewById(R.id.editText3);
        btnSummary = (Button)findViewById(R.id.button);
        btnColor = (Button)findViewById(R.id.button2);

        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSummary.setTextColor(Color.CYAN);
                if(tvSummary.getCurrentTextColor()==Color.CYAN){
                    tvSummary.setTextColor(Color.RED);
                }else{
                    tvSummary.setTextColor(Color.CYAN);
                }
            }
        });
        btnSummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSummary.setText("1. " + etName.getText().toString() + "2. " + etPhone.getText().toString() + "3. " + etMail.getText().toString());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
