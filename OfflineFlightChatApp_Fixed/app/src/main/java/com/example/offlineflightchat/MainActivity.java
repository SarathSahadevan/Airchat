package com.example.offlineflightchat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText pnrInput, interestsInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pnrInput = findViewById(R.id.pnr_input);
        interestsInput = findViewById(R.id.interests_input);
        Button startChatButton = findViewById(R.id.start_chat_button);

        startChatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ChatActivity.class);
                intent.putExtra("PNR", pnrInput.getText().toString());
                intent.putExtra("INTERESTS", interestsInput.getText().toString());
                startActivity(intent);
            }
        });
    }
}