package com.kryptoblocks.aircanada.fragmentss;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.kryptoblocks.aircanada.BalanceActivity;
import com.kryptoblocks.aircanada.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PayFragment extends Fragment {

Button btn_create_acc;

    public PayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pay, container, false);
 btn_create_acc = view.findViewById(R.id.create_account_btn);
 btn_create_acc.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         Intent i = new Intent(getContext(), BalanceActivity.class);
         startActivity(i);
     }
 });
        return view;

    }

}
