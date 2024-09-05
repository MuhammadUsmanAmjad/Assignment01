package com.example.smdassignment1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayInfoActivity extends AppCompatActivity {

    // Declare TextViews for sender and receiver info
    private TextView senderNameTextView, senderCountryTextView, senderAddressTextView, senderContactInfoTextView;
    private TextView receiverNameTextView, receiverCountryTextView, receiverAddressTextView, receiverContactInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);

        // Initialize sender TextViews
        senderNameTextView = findViewById(R.id.senderNameTextView);
        senderCountryTextView = findViewById(R.id.senderCountryTextView);
        senderAddressTextView = findViewById(R.id.senderAddressTextView);
        senderContactInfoTextView = findViewById(R.id.senderContactInfoTextView);

        // Initialize receiver TextViews
        receiverNameTextView = findViewById(R.id.receiverNameTextView);
        receiverCountryTextView = findViewById(R.id.receiverCountryTextView);
        receiverAddressTextView = findViewById(R.id.receiverAddressTextView);
        receiverContactInfoTextView = findViewById(R.id.receiverContactInfoTextView);

        // Retrieve Sender and Receiver data from intent
        Intent intent = getIntent();
        String senderName = intent.getStringExtra("senderFullName");
        String senderCountry = intent.getStringExtra("senderCountry");
        String senderAddress = intent.getStringExtra("senderAddress");
        String senderContactInfo = intent.getStringExtra("senderContactInfo");

        String receiverName = intent.getStringExtra("receiverFullName");
        String receiverCountry = intent.getStringExtra("receiverCountry");
        String receiverAddress = intent.getStringExtra("receiverAddress");
        String receiverContactInfo = intent.getStringExtra("receiverContactInfo");

        // Set the text in Sender TextViews
        senderNameTextView.setText(senderName);
        senderCountryTextView.setText(senderCountry);
        senderAddressTextView.setText(senderAddress);
        senderContactInfoTextView.setText(senderContactInfo);

        // Set the text in Receiver TextViews
        receiverNameTextView.setText(receiverName);
        receiverCountryTextView.setText(receiverCountry);
        receiverAddressTextView.setText(receiverAddress);
        receiverContactInfoTextView.setText(receiverContactInfo);
    }
}
