package com.example.android.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] data = {"Sun - Sunny - 20/7",
            "Mon - Sunny - 31/17",
            "Tues - Foggy - 21/8",
            "Weds - Cloudy - 22/17",
            "Thurs - Rainy - 18/11/",
            "Fri - Foggy - 21/10",
            "Sat - Trapped in Weatherstation- 23/18"
        };
        List<String> weekForecast = new ArrayList<>(Arrays.asList(data));
        mForecastAdapter = new ArrayAdapter<String>(getActivity(),
                                                    R.layout.list_item_forecast,
                                                    R.id.list_item_forecast_textview,
                                                    weekForecast);
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // Retrieve a reference to the ListView, and set the adapter.
        ListView listView = (ListView)rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}
