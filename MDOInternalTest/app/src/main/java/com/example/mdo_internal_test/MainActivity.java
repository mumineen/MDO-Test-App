package com.example.mdo_internal_test;

import androidx.appcompat.app.AppCompatActivity;
import org.mumineen.MdoSalaat;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        double lat = 22.8327;
        double lon = 74.2564;
        double alt = 14.0;

        long mTimes[] = MdoSalaat.getAllTimesRounded(2022, 04, 25, lat, lon, alt);

        SimpleDateFormat fmt = new java.text.SimpleDateFormat("HH:mm:ss");
        String readables[] = new String[10];
        String tsStrings[] = new String[10];
        for (int lcv = 0; lcv < 10; lcv++) {
            readables[lcv] = fmt.format(new Date(mTimes[lcv] * 1000));
            tsStrings[lcv] = String.valueOf(mTimes[lcv]);
        }

        TextView latTV = (TextView) findViewById(R.id.lat);
        TextView lonTV = (TextView) findViewById(R.id.lon);
        TextView altTV = (TextView) findViewById(R.id.alt);

        TextView sihori_tsTV = (TextView) findViewById(R.id.sihori_ts);
        TextView fajr_tsTV = (TextView) findViewById(R.id.fajr_ts);
        TextView sunrise_tsTV = (TextView) findViewById(R.id.sunrise_ts);
        TextView zawaal_tsTV = (TextView) findViewById(R.id.zawaal_ts);
        TextView zohr_tsTV = (TextView) findViewById(R.id.zohr_ts);
        TextView asr_tsTV = (TextView) findViewById(R.id.asr_ts);
        TextView maghrib_tsTV = (TextView) findViewById(R.id.maghrib_ts);
        TextView nisf_tsTV = (TextView) findViewById(R.id.nisf_ts);
        TextView nisfEnd_tsTV = (TextView) findViewById(R.id.nisfEnd_ts);

        TextView sihori_timeTV = (TextView) findViewById(R.id.sihori_time);
        TextView fajr_timeTV = (TextView) findViewById(R.id.fajr_time);
        TextView sunrise_timeTV = (TextView) findViewById(R.id.sunrise_time);
        TextView zawaal_timeTV = (TextView) findViewById(R.id.zawaal_time);
        TextView zohr_timeTV = (TextView) findViewById(R.id.zohr_time);
        TextView asr_timeTV = (TextView) findViewById(R.id.asr_time);
        TextView maghrib_timeTV = (TextView) findViewById(R.id.maghrib_time);
        TextView nisf_timeTV = (TextView) findViewById(R.id.nisf_time);
        TextView nisfEnd_timeTV = (TextView) findViewById(R.id.nisfEnd_time);

        TextView devModel_TV = (TextView) findViewById(R.id.devModel);
        TextView osVer_TV = (TextView) findViewById(R.id.osVersion);

        sihori_timeTV.setText(readables[0]);
        fajr_timeTV.setText(readables[1]);
        sunrise_timeTV.setText(readables[2]);
        zawaal_timeTV.setText(readables[3]);
        zohr_timeTV.setText(readables[4]);
        asr_timeTV.setText(readables[5]);
        maghrib_timeTV.setText(readables[6]);
        nisf_timeTV.setText(readables[8]);
        nisfEnd_timeTV.setText(readables[9]);

        sihori_tsTV.setText(tsStrings[0]);
        fajr_tsTV.setText(tsStrings[1]);
        sunrise_tsTV.setText(tsStrings[2]);
        zawaal_tsTV.setText(tsStrings[3]);
        zohr_tsTV.setText(tsStrings[4]);
        asr_tsTV.setText(tsStrings[5]);
        maghrib_tsTV.setText(tsStrings[6]);
        nisf_tsTV.setText(tsStrings[8]);
        nisfEnd_tsTV.setText(tsStrings[9]);

        latTV.setText(String.valueOf(lat));
        lonTV.setText(String.valueOf(lon));
        altTV.setText(String.valueOf(alt));

        devModel_TV.setText(Build.MANUFACTURER + " " + Build.MODEL);
        osVer_TV.setText(Build.VERSION.RELEASE);
    }
}