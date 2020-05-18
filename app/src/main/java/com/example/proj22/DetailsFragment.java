package com.example.proj22;

import android.app.Fragment;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.proj22.R;

/**
 * Created by tutlane on 06-08-2017.
 */

public class DetailsFragment extends Fragment {
    TextView name,location;
    ImageView im;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.details_info, container, false);
        name = (TextView)view.findViewById(R.id.Name);
        location = (TextView)view.findViewById(R.id.Location);
        im= (ImageView) view.findViewById(R.id.img);
        return view;
    }
    public void change(String uname, String ulocation , int s1){
        name.setText(uname);
        location.setText(ulocation);
        if(s1==0){
            im.setImageResource(R.drawable.alltypeofcheese);
        }
        else if (s1==1)
            im.setImageResource(R.drawable.calzonespicychicken);
        else if (s1==2)
            im.setImageResource(R.drawable.dessert);
        else if (s1==3)
            im.setImageResource(R.drawable.lotus);
        else if (s1==4)
            im.setImageResource(R.drawable.pastries);
        else if (s1==5)
            im.setImageResource(R.drawable.pizza);

    }
}