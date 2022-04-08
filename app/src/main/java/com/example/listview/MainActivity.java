package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=findViewById(R.id.liste);

        ArrayAdapter<CharSequence> adp = ArrayAdapter.createFromResource(this,R.array.pays, android.R.layout.simple_list_item_1);
        list.setAdapter(adp);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String mot = String.valueOf(list.getItemIdAtPosition(position));
                Toast.makeText(MainActivity.this,mot,Toast.LENGTH_SHORT).show();

            }
        });
    }
}