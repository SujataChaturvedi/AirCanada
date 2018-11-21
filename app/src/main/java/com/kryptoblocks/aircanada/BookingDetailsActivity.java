package com.kryptoblocks.aircanada;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class BookingDetailsActivity extends AppCompatActivity {

   Toolbar tool_booking_details;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_details);

        tool_booking_details = findViewById(R.id.toolbar_booking_details);

        initToolBar();
        tool_booking_details.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        tool_booking_details.setNavigationOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent i = new Intent(getApplication(), MainActivity.class);
                        startActivity(i);
                    }
                }
        );

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void initToolBar() {
        //wishlist_toolbar = (Toolbar) findViewById(R.id.toolbar_mens_clothing);
        tool_booking_details.setTitle(R.string.toolbar_for_booking_details);
        tool_booking_details.setTitleTextColor(0xFFFFFFFF);
        setSupportActionBar(tool_booking_details);

    }
}
