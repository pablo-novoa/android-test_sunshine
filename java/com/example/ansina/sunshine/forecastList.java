package com.example.ansina.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;


/**
 * A simple {@link Fragment} subclass.
 */
public class forecastList extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    //private static final String ARG_PARAM1 = "param1";
    //private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    //private String mParam1;
    //private String mParam2;


    public forecastList() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }*/
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_forecast_list, container, false);

        String[] forecastDataArray = {
                "11111111",
                "2222222",
                "33333333",
                "44444444",
                "5555555555",
                "33333333",
                "44444444",
                "5555555555",
                "33333333",
                "44444444",
                "5555555555",
                "33333333",
                "44444444",
                "5555555555",
                "33333333",
                "44444444",
                "5555555555",
                "666666666"
        };

        ArrayAdapter<String> flAdapter = new ArrayAdapter<String>(getActivity(), R.layout.forecast_list_item, R.id.list_item_forecast_textView, forecastDataArray);

        ListView forecastListView = (ListView) rootView.findViewById(R.id.list_item_forecast);
        forecastListView.setAdapter(flAdapter);

        return rootView;
    }


}
