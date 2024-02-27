package ma.enset.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonAdd = findViewById(R.id.buttonAdd);
        EditText editTextName = findViewById(R.id.editTextName);
        EditText editTextEmail = findViewById(R.id.editTextEmail);
        ListView listView = findViewById(R.id.listView);
        List<String> listData = new ArrayList<>();
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listData);
        listView.setAdapter(adapter);
        buttonAdd.setOnClickListener((view ->{
            String name = editTextName.getText().toString();
            String email = editTextEmail.getText().toString();
            listData.add("Name : " + name + "\n"+
                            "Email : " + email);
            adapter.notifyDataSetChanged();
            editTextName.getText().clear();
            editTextEmail.getText().clear();
        }));
    }
}