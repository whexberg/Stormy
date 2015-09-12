package com.whexberg.stormy.UI;

import android.app.ListActivity;
import android.os.Bundle;

import com.whexberg.stormy.R;
import com.whexberg.stormy.adapters.DayAdapter;
import com.whexberg.stormy.weather.Day;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        DayAdapter adapter = new DayAdapter(this, mDays);
    }


}
