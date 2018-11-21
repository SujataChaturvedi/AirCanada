package com.kryptoblocks.aircanada.fragmentss;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import com.kryptoblocks.aircanada.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoyaltyFragment extends Fragment {

    TabLayout tabs;

    public void PayFragment() {
        PayFragment payFragment = new PayFragment();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.loyalty_frame, payFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    public LoyaltyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_loyalty, container, false);
         tabs = view.findViewById(R.id.tabLayout);

         PayFragment();

//for tablayout
        //Tablayout
        tabs.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabs.setTabMode(TabLayout.MODE_SCROLLABLE);

        tabs.addTab(tabs.newTab().setText("Loyalty"));
        tabs.addTab(tabs.newTab().setText("Offers"));
        tabs.addTab(tabs.newTab().setText("Gifts"));

        tabs.setTabGravity(TabLayout.GRAVITY_FILL);

        //Adding onTabSelectedListener to swipe views

        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
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
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.loyalty_frame, fragment);
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

        return view;
    }

}
