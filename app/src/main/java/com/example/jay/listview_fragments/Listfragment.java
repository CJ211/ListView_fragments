package com.example.jay.listview_fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class Listfragment extends Fragment {

    private ListView mListView;
    private ArrayList<Integer> mImg;
    private ArrayList<String> mName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_listfragment, container ,false);

        mListView = (ListView) view.findViewById(R.id.fr_list);

        mImg = new ArrayList<>();
        mName = new ArrayList<>();

        mImg.add(R.drawable.youtube);
        mImg.add(R.drawable.gingerbread);
        mImg.add(R.drawable.honeycombbee);
        mImg.add(R.drawable.icecreamsandwich);
        mImg.add(R.drawable.jellybean);
        mImg.add(R.drawable.kitkat);
        mImg.add(R.drawable.lollipop);


        mName.add("youtube");
        mName.add("lollipop");
        mName.add("gingerbread");
        mName.add("honeycomb");
        mName.add("icecreamsandwich");
        mName.add("jellybean");
        mName.add("kitkat");


        mListView.setAdapter(new MyAdapter());




        return view;
    }


    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return mImg.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {

            View view;

            if(convertView != null)
            {
                view=convertView;
            }

            else
            {
                view = getActivity().getLayoutInflater().inflate(R.layout.list_row_view, parent, false);
            }

            ImageView GoogleApi = (ImageView) view.findViewById(R.id.api_list);
            GoogleApi.setImageResource(mImg.get(i));

            TextView phoneno = (TextView) view.findViewById(R.id.name_list);
            phoneno.setText(mName.get(i));

            return view;
        }
    }


}

