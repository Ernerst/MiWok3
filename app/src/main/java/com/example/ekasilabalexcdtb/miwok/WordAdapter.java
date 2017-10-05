package com.example.ekasilabalexcdtb.miwok;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    private  int mColorResourceId;
    private List<Word> listOfWords;

    public WordAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Word> objects,int colorResourceId) {
        super(context, 0, objects);

        listOfWords = objects;
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        //view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, null);
        if(convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,null);
        }

        Word word = listOfWords.get(position);

        TextView tvMiwork = (TextView) convertView.findViewById(R.id.miwork_text_view);
        TextView translatedWord = (TextView) convertView.findViewById(R.id.default_text_view);
        ImageView icon = (ImageView) convertView.findViewById(R.id.iconView);

        tvMiwork.setText(word.getmMiwokTranslation());
        translatedWord.setText(word.getmDefaultWord());

        if(word.hasImage()){
            icon.setImageResource(word.getResourceId());
        }
        else{
            icon.setVisibility(View.GONE);
        }


        View textContainer = convertView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        return  convertView;


          /*
          return super.getView(position, convertView, parent);
          User user = getItem(position);
       // Check if an existing view is being reused, otherwise inflate the view
       if (convertView == null) {
          convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
       }
       // Lookup view for data population
       TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
       TextView tvHome = (TextView) convertView.findViewById(R.id.tvHome);
       // Populate the data into the template view using the data object
       tvName.setText(user.name);
       tvHome.setText(user.hometown);
       // Return the completed view to render on screen
       return convertView;*/
    }



}

