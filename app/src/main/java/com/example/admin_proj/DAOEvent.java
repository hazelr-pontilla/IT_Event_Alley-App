package com.example.admin_proj;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DAOEvent {

    private DatabaseReference databaseReference;

    public DAOEvent()
    {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Event.class.getSimpleName());
    }

    public Task<Void> add (Event evt)
    {
        return databaseReference.push().setValue(evt);
    }
}
