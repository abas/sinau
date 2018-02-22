package io.github.abas.sinaudev;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RegisterActivity extends AppCompatActivity {

    public TextInputLayout name,email,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = (TextInputLayout)findViewById(R.id.til_name);
        email = (TextInputLayout)findViewById(R.id.til_email);
        password =  (TextInputLayout)findViewById(R.id.til_password);

        ButterKnife.bind(this);

        // lanjutkan di SDK @part II menit 11:03


    }
}
