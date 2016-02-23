package com.example.commet.booker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username_text;
    private EditText pass_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button login_button = (Button) findViewById(R.id.login_button);
        final Button signup_button = (Button) findViewById(R.id.signup_button);
        username_text = (EditText)findViewById(R.id.username);
        pass_text = (EditText)findViewById(R.id.password);

        login_button.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final String username = username_text.getText().toString();
                final String password = String.valueOf(pass_text.getText());
                login(v, username, password);
            }
        });

        signup_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You do not need to signup in this version.",
                        Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void login(View view, String user, String pass){
        if (checkUsername(user) && checkPassword(pass)) {
            Intent intent = new Intent(this, book_list.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(), "Invalid login credentials! Valid email required.",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public boolean checkUsername(String s) {
        if (s.contains(String.valueOf('@')) == false) {
            return false;
        }
        return true;
    }

    public boolean checkPassword(String s) {
        if (s.length() < 8) {
            return false;
        }
        return true;
    }
}
