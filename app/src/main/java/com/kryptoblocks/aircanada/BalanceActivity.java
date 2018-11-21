package com.kryptoblocks.aircanada;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class BalanceActivity extends AppCompatActivity {

    Toolbar bal_tool;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance);

        bal_tool = findViewById(R.id.toolbar_balance);


        initToolBar();
        bal_tool.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        bal_tool.setNavigationOnClickListener(
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
        bal_tool.setTitle(R.string.toolbar_for_balance);
        bal_tool.setTitleTextColor(0xFFFFFFFF);
        setSupportActionBar(bal_tool);

    }
}
