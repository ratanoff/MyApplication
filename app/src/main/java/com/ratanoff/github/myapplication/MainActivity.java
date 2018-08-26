package com.ratanoff.github.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.github.ratanoff.sdklib.annotation.CVV;
import com.github.ratanoff.sdklib.annotation.CardHolder;
import com.github.ratanoff.sdklib.annotation.CardNumber;
import com.github.ratanoff.sdklib.annotation.ExpDate;
import com.github.ratanoff.sdklib.annotation.PayButton;
import com.github.ratanoff.sdklib.validator.Validator;

public class MainActivity extends AppCompatActivity {

    @CardNumber
    EditText cardNumber;

    @ExpDate
    EditText expDate;

    @CVV
    EditText cvv;

    @CardHolder
    EditText cardHolder;

    @PayButton
    Button payButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardNumber = findViewById(R.id.card_number_input);
        expDate = findViewById(R.id.exp_date_input);
        cvv = findViewById(R.id.cvv_input);
        cardHolder = findViewById(R.id.card_holder_input);
        payButton = findViewById(R.id.pay_button);

        new Validator().init(this);
    }
}
