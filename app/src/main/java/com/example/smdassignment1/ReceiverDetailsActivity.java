package com.example.smdassignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class ReceiverDetailsActivity extends AppCompatActivity {

    private EditText receiverEmailEditText, receiverFullNameEditText, receiverContactInfoEditText, receiverCountryEditText, receiverAddressEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver_details);

        // Initialize UI elements
        receiverEmailEditText = findViewById(R.id.receiverEmailEditText);
        receiverFullNameEditText = findViewById(R.id.receiverFullNameEditText);
        receiverContactInfoEditText = findViewById(R.id.receiverContactInfoEditText);
        receiverCountryEditText = findViewById(R.id.receiverCountryEditText);
        receiverAddressEditText = findViewById(R.id.receiverAddressEditText);

        // Set click listener for Next button
        findViewById(R.id.receiverNextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReceiverDetailsActivity.this, DisplayInfoActivity.class);

                // Retrieve sender data from the previous activity
                Intent senderIntent = getIntent();
                intent.putExtra("senderEmail", senderIntent.getStringExtra("senderEmail"));
                intent.putExtra("senderFullName", senderIntent.getStringExtra("senderFullName"));
                intent.putExtra("senderContactInfo", senderIntent.getStringExtra("senderContactInfo"));
                intent.putExtra("senderCountry", senderIntent.getStringExtra("senderCountry"));
                intent.putExtra("senderAddress", senderIntent.getStringExtra("senderAddress"));

                // Pass receiver data to the next activity
                intent.putExtra("receiverEmail", receiverEmailEditText.getText().toString());
                intent.putExtra("receiverFullName", receiverFullNameEditText.getText().toString());
                intent.putExtra("receiverContactInfo", receiverContactInfoEditText.getText().toString());
                intent.putExtra("receiverCountry", receiverCountryEditText.getText().toString());
                intent.putExtra("receiverAddress", receiverAddressEditText.getText().toString());

                startActivity(intent);
            }
        });
    }
}
