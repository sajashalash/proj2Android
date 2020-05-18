package com.example.proj22;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class ListMenuFragment extends ListFragment {
    String[] name = new String[] { "Plain Eggs","Meshulash","Nutella","Lots"," pastries","Pizza" };
    String[] price = new String[]{"50","20","20","30","50","20"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.listitems_info, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, name);
        setListAdapter(adapter);
        return view;
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        DetailsFragment txt = (DetailsFragment) getFragmentManager().findFragmentById(R.id.fragment2);
        txt.change("Name: "+ name[position],"Price : "+ price[position],position);

    }
}