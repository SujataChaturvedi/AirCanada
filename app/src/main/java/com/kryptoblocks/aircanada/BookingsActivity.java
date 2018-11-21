package com.kryptoblocks.aircanada;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TableLayout;

import com.kryptoblocks.aircanada.fragmentss.GiftFragment;
import com.kryptoblocks.aircanada.fragmentss.OffersFragment;
import com.kryptoblocks.aircanada.fragmentss.PayFragment;

public class BookingsActivity extends AppCompatActivity {

    Toolbar tool_bookings;
    TabLayout bookins_tab;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookings);

        bookins_tab =findViewById(R.id.tabLayout_bookings);
        tool_bookings =findViewById(R.id.toolbar_bookings);


        initToolBar();
        tool_bookings.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        tool_bookings.setNavigationOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent i = new Intent(getApplication(), MainActivity.class);
                        startActivity(i);
                    }
                }
        );

        //for tablayout
        //Tablayout
        bookins_tab.setTabGravity(TabLayout.GRAVITY_CENTER);
        bookins_tab.setTabMode(TabLayout.MODE_SCROLLABLE);

        bookins_tab.addTab(bookins_tab.newTab().setText("Completed"));
        bookins_tab.addTab(bookins_tab.newTab().setText("Cancelled"));

        bookins_tab.setTabGravity(TabLayout.GRAVITY_FILL);

        //Adding onTabSelectedListener to swipe views

        bookins_tab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment = null;
                switch (tab.getPosition()) {
                    case 0:
                        fragment = new PayFragment();
                        break;
                    case 1:
                        fragment = new OffersFragment();
                        break;
                    case 2:
                        fragment = new GiftFragment();
                        break;

                }
               /* FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.loyalty_frame, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();*/

            }


            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void initToolBar() {
        //wishlist_toolbar = (Toolbar) findViewById(R.id.toolbar_mens_clothing);
        tool_bookings.setTitle(R.string.toolbar_for_bookings);
        tool_bookings.setTitleTextColor(0xFFFFFFFF);
        setSupportActionBar(tool_bookings);

    }
}
