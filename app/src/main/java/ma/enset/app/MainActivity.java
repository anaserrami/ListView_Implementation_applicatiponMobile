package ma.enset.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import ma.enset.app.adapters.MyAdapter;
import ma.enset.app.models.MyModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAdd=findViewById(R.id.buttonAdd);

        EditText textViewName=findViewById(R.id.editTextName);
        EditText textViewEmail=findViewById(R.id.editTextEmail);
        ListView listView=findViewById(R.id.listView);

        List<MyModel> myModels =new ArrayList<MyModel>();
        ArrayAdapter adapter=new MyAdapter(this, android.R.layout.simple_list_item_1,myModels);
        listView.setAdapter(adapter);

        buttonAdd.setOnClickListener(view -> {
            String title =textViewName.getText().toString();
            String content =textViewEmail.getText().toString();
            MyModel myModel =new MyModel(title,content);
            adapter.add(myModel);
            adapter.notifyDataSetChanged();
        });
    }
}