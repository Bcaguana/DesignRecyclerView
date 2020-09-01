package com.example.designrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class RecycleActivity extends AppCompatActivity {

    private RecyclerView contactRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        contactRecView = findViewById(R.id.contactsRecView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Martha Stewart", "mstew@aol.com", "https://image.shutterstock.com/image-photo/portrait-cheerful-beautiful-woman-trendy-260nw-648907024.jpg"));
        contacts.add(new Contact("Laura Low", "lalo@aol.com", "https://image.shutterstock.com/image-photo/portrait-cheerful-beautiful-woman-trendy-260nw-648907024.jpg"));
        contacts.add(new Contact("Thomas Brain", "tbrain@aol.com", "https://image.shutterstock.com/image-photo/portrait-cheerful-beautiful-woman-trendy-260nw-648907024.jpg"));
        contacts.add(new Contact("Jack Jacky", "jjack@aol.com", "https://image.shutterstock.com/image-photo/portrait-cheerful-beautiful-woman-trendy-260nw-648907024.jpg"));
        contacts.add(new Contact("Angelica Jones", "ajones@aol.com", "https://image.shutterstock.com/image-photo/portrait-cheerful-beautiful-woman-trendy-260nw-648907024.jpg"));

        ContactViewAdapter adapter = new ContactViewAdapter(this);
        adapter.setContacts(contacts);

        contactRecView.setAdapter(adapter);
        //LinearLayoutManager defaults to vertical, this is how to set to horizontal
        //contactRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        //Grid Layout, requires you to make the item XML set to "wrap content". The second arg is for # of columns
        //contactRecView.setLayoutManager(new GridLayoutManager(this, 2));
        contactRecView.setLayoutManager(new LinearLayoutManager(this));

    }
}