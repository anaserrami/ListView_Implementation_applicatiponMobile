package ma.enset.app.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import ma.enset.app.R;
import ma.enset.app.models.MyModel;

public class MyAdapter extends ArrayAdapter<MyModel> {
    public MyAdapter(@NonNull Context context, int resource, @NonNull List<MyModel> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null){
            LayoutInflater inflater=LayoutInflater.from(getContext());
            convertView=inflater.inflate(R.layout.list_item,parent,false);
        }
        MyModel myModel=getItem(position);
        TextView textViewTitle=convertView.findViewById(R.id.textViewTitle);
        TextView textViewContent=convertView.findViewById(R.id.textViewContent);
        textViewTitle.setText(myModel.getTitle());
        textViewContent.setText(myModel.getContent());
        return convertView;
    }
}
