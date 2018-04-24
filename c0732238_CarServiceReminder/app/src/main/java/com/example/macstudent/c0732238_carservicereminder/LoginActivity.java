package com.example.macstudent.c0732238_carservicereminder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edtUserId;
    EditText edtPassword;
    Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUserId = (EditText) findViewById(R.id.edtUserName);

        edtPassword = (EditText) findViewById(R.id.edtPassword);

        btnSignIn = (Button)findViewById(R.id.btnSignIn);


        btnSignIn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(TextUtils.isEmpty(edtUserId.getText()) || edtUserId.getText().toString().length() == 0)
                {
                    edtUserId.setError("Please Enter User Name");
                }
                else {

                    if (edtUserId.getText().toString().equals("admin") && edtPassword.getText().toString().equals("admin")) {
                        Toast.makeText(LoginActivity.this, "User Successfully logged in ", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                        startActivity(intent);
                        Toast.makeText(LoginActivity.this, "UserID/passwords invalid", Toast.LENGTH_LONG).show();

                    }
                }
            }
        });
    }
}
