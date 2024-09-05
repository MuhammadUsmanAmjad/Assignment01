package com.example.smdassignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class SenderDetailsActivity extends AppCompatActivity {

    private EditText emailEditText, fullNameEditText, contactInfoEditText, countryEditText, addressEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender_details);

        // Initialize UI elements
        emailEditText = findViewById(R.id.emailEditText);
        fullNameEditText = findViewById(R.id.fullNameEditText);
        contactInfoEditText = findViewById(R.id.contactInfoEditText);
        countryEditText = findViewById(R.id.countryEditText);
        addressEditText = findViewById(R.id.addressEditText);

        // Set click listener for Next button
        findViewById(R.id.nextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SenderDetailsActivity.this, ReceiverDetailsActivity.class);

                // Pass sender data to the next activity
                intent.putExtra("senderEmail", emailEditText.getText().toString());
                intent.putExtra("senderFullName", fullNameEditText.getText().toString());
                intent.putExtra("senderContactInfo", contactInfoEditText.getText().toString());
                intent.putExtra("senderCountry", countryEditText.getText().toString());
                intent.putExtra("senderAddress", addressEditText.getText().toString());

                startActivity(intent);
            }
        });
    }
}
