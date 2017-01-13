package com.example.studio111.commentist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by robbi on 1/11/2017.
 */

public class FeedAdapter extends ArrayAdapter<FeedItem> {
    public FeedAdapter(Context context, ArrayList<FeedItem> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //get the current movie
        FeedItem currentItem = getItem(position);

        //Check if the existing view is being reused, otherwise inflate the view
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.feed_item, parent, false);
        }


        //attach poster to the gridview
       // ImageView posterIV = (ImageView) gridItemView.findViewById(R.id.posterImage);
        //Picasso.with(getContext()).load(currentMovieObject.getPosterUrl()).into(posterIV);

        TextView titleTV = (TextView) gridItemView.findViewById(R.id.episodeName);
        titleTV.setText(currentItem.getTitle());

        TextView dateTV = (TextView) gridItemView.findViewById(R.id.episodeDate);
        dateTV.setText(currentItem.getPubDate());

        TextView descriptionTV = (TextView) gridItemView.findViewById(R.id.episodeDescription);
        descriptionTV.setText(currentItem.getDescription());

        TextView lengthTV = (TextView) gridItemView.findViewById(R.id.episodeLength);
        lengthTV.setText(currentItem.getLength());

        return gridItemView;
    }
}