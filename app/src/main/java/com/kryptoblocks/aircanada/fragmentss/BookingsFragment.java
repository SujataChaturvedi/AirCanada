package com.kryptoblocks.aircanada.fragmentss;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kryptoblocks.aircanada.MainActivity;
import com.kryptoblocks.aircanada.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BookingsFragment extends Fragment {

    Toolbar tool_bookings;
    TabLayout bookins_tab;

    public void BookingCompletedFragment() {
        BookingCompletedFragment bookingCompletedFragment = new BookingCompletedFragment();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.content_frame_bookings, bookingCompletedFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public BookingsFragment() {
        // Required empty public constructor
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_bookings, container, false);


        bookins_tab =view.findViewById(R.id.tabLayout_bookings);
       // tool_bookings =view.findViewById(R.id.toolbar_bookings);


       /* initToolBar();
        tool_bookings.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        tool_bookings.setNavigationOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent i = new Intent(getContext(), MainActivity.class);
                        startActivity(i);
                    }
                }
        );*/

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
                        fragment = new BookingCompletedFragment();
                        break;
                    case 1:
                        fragment = new BookingCancelledFragment();
                        break;
                }
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_frame_bookings, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();

            }


            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        BookingCompletedFragment();

        return view;
    }

   /* @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void initToolBar() {
        //wishlist_toolbar = (Toolbar) findViewById(R.id.toolbar_mens_clothing);
        tool_bookings.setTitle(R.string.toolbar_for_bookings);
        tool_bookings.setTitleTextColor(0xFFFFFFFF);
        ((AppCompatActivity)getActivity()).setSupportActionBar(tool_bookings);

    }*/
}
