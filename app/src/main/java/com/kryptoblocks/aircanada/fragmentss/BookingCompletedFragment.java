package com.kryptoblocks.aircanada.fragmentss;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kryptoblocks.aircanada.BookingDetailsActivity;
import com.kryptoblocks.aircanada.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BookingCompletedFragment extends Fragment {

    CardView card_click;

    public BookingCompletedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_booking_completed, container, false);

        card_click = view.findViewById(R.id.cardview1);

        card_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), BookingDetailsActivity.class);
                startActivity(i);
            }
        });

        return view;
    }

}
