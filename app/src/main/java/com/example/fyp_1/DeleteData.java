package com.example.fyp_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DeleteData extends AppCompatActivity {
    DatabaseReference reference;
    Button removeUser;
    EditText userName = findViewById(R.id.userName);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_data);

        removeUser.findViewById(R.id.deleteBtn);
        removeUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = userName.getText().toString();
                if(!name.isEmpty()){
                    deleteData(name);
                }else{
                    Toast.makeText(DeleteData.this,"Not Valid User Name",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void deleteData(String name) {
        reference = FirebaseDatabase.getInstance().getReference("Users");
        reference.child(name).removeValue().addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){
                    Toast.makeText(DeleteData.this,"Successfully Removed User",Toast.LENGTH_SHORT).show();
                    userName.setText("");
                }else{
                    Toast.makeText(DeleteData.this,"Failed to remove data",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}