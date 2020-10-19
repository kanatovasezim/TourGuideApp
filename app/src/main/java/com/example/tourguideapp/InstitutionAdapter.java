package com.example.tourguideapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class InstitutionAdapter extends ArrayAdapter<Institution> {

    public <E extends AppCompatActivity> InstitutionAdapter(E activity, ArrayList<Institution> Institutions) {
        super(activity, 0, Institutions);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Institution currentInstitution = getItem(position);
        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentInstitution.getName());
        TextView description = (TextView) listItemView.findViewById(R.id.description);
        description.setText(currentInstitution.getDescription());
        TextView contact = (TextView) listItemView.findViewById(R.id.contact);
        contact.setText(currentInstitution.getContacts());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.inst_image);
        imageView.setImageResource(currentInstitution.getImageID());
        View textContainer = listItemView.findViewById(R.id.text_container);
        return listItemView;
    }

}
