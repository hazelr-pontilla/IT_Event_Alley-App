package com.example.admin_proj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class manage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage);

        final EditText edit_theme = findViewById(R.id.edit_theme);
        final EditText edit_desc = findViewById(R.id.edit_desc);
        final EditText edit_org = findViewById(R.id.edit_org);
        final EditText edit_time = findViewById(R.id.edit_time);
        Button bt_submit = findViewById(R.id.bt_submit);

        DAOEvent dao = new DAOEvent();

        bt_submit.setOnClickListener(v ->
        {
            Event evt = new Event(edit_theme.getText().toString(), edit_desc.getText().toString(),edit_org.getText().toString(),edit_time.getText().toString());
            dao.add(evt).addOnSuccessListener(suc->

            {
                Toast.makeText(this, "Event added successfully.", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er->
                    {
                        Toast.makeText(this, ""+er.getMessage(), Toast.LENGTH_SHORT).show();
                    });

        });
    }
}