package com.example.tourguideapp;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tourguideapp.Enum.Category;

import java.util.ArrayList;

public class BishkekActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.institutions);
        final ArrayList<Institution> Institutions = new ArrayList<Institution>();
        Institutions.add(new Institution("АУЦА", "Основанный в 1993 году, АУЦА воспитывает будущих лидеров для демократических преобразований в Центральной Азии. Американский университет в Центральной Азии представляет собой международное, мультидисциплинарное сообщество в лучших традициях американского образования в сфере гуманитарных наук.", "7/6 Aaly Tokombaev Street", "+996312915019", R.drawable.bishkek_auca, Category.UNIVERSITY));
//        Institutions.add(new Institution("two", "otiiko", R.drawable.number_two, R.raw.number_two));
//        Institutions.add(new Institution("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
//        Institutions.add(new Institution("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
//        Institutions.add(new Institution("five", "massokka", R.drawable.number_five, R.raw.number_five));
//        Institutions.add(new Institution("six", "temmokka", R.drawable.number_six, R.raw.number_six));
//        Institutions.add(new Institution("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
//        Institutions.add(new Institution("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
//        Institutions.add(new Institution("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
//        Institutions.add(new Institution("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));
        InstitutionAdapter adapter = new InstitutionAdapter(this, Institutions);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
