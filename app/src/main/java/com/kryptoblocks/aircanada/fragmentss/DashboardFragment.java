package com.kryptoblocks.aircanada.fragmentss;


import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.PercentFormatter;
import com.kryptoblocks.aircanada.MainActivity;
import com.kryptoblocks.aircanada.R;
import com.numetriclabz.numandroidcharts.ChartData;
import com.numetriclabz.numandroidcharts.SemiCircle;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment {

Toolbar dash_tool;
PieChart pie,pie1,pie2;

    public DashboardFragment() {
        // Required empty public constructor
    }


    @TargetApi(Build.VERSION_CODES.M)
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  view =inflater.inflate(R.layout.fragment_dashboard, container, false);


      //  dash_tool = view.findViewById(R.id.toolbar_dashboard);

//////////////////PieChart 1
         pie = (PieChart) view.findViewById(R.id.piechart);
        pie.setUsePercentValues(true);

        ArrayList<Entry> yvalues = new ArrayList<Entry>();
        yvalues.add(new Entry(25f, 0));
        yvalues.add(new Entry(8f, 1));
        yvalues.add(new Entry(18f, 2));
        yvalues.add(new Entry(13f, 3));


        PieDataSet dataSet = new PieDataSet(yvalues, "");

        ArrayList<String> xVals = new ArrayList<String>();

       xVals.add("Flights");
        xVals.add("Car Rentals");
        xVals.add("Hotels");
        xVals.add("Retail Stores");

        PieData data = new PieData(xVals, dataSet);
        // In Percentage
        data.setValueFormatter(new PercentFormatter());
        // Default value
        //data.setValueFormatter(new DefaultValueFormatter(0));
        pie.setData(data);
     //   pie.setDescription("This is Pie Chart");
        pie.setDrawHoleEnabled(true);
        pie.setTransparentCircleRadius(58f);

        pie.setHoleRadius(58f);
        //pie.setCenterText("1000");
        //pie.setCenterTextColor(R.color.colorAccent);
     //   pie.setCenterText("Redeemed vs Earned");
        dataSet.setColors(ColorTemplate.VORDIPLOM_COLORS);
       //pie.setHoleColor(getContext().getResources().getColor(R.color.colorBlack));
    //    pie.setBackground(getContext().getResources().getDrawable(R.drawable.image_back));

        data.setValueTextSize(13f);
        data.setValueTextColor(Color.BLUE);
///////////////////

       // initToolBar();
        /*dash_tool.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        dash_tool.setNavigationOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent i = new Intent(getContext(), MainActivity.class);
                        startActivity(i);
                    }
                }
        );*/

        //semi circle//////////////////////
        SemiCircle semiChart =  view.findViewById(R.id.semi_circle_chart);
        ChartData values = new ChartData();
      /*  values.setSectorValue(4);
                values.setSectorLabel("hh");
                semiChart.addSector(values);
       values = new ChartData();
                values.setSectorValue(3);
                values.setSectorLabel("k");
                semiChart.addSector(values);*/
       values = new ChartData();
                values.setSectorValue(8);

                values.setSectorLabel("Earned");
                semiChart.addSector(values);
        values = new ChartData();
                values.setSectorValue(5);
                values.setSectorLabel("Redeemed");
                semiChart.addSector(values);
    //semiChart.getForegroundGravity("center");
   // semiChart.setForegroundGravity(100);
///////////////////////////////////

///////PieChart2
        pie1 = (PieChart) view.findViewById(R.id.piechart1);
        pie1.setUsePercentValues(true);

        ArrayList<Entry> yvalues1 = new ArrayList<Entry>();
        yvalues1.add(new Entry(8f, 0));
        yvalues1.add(new Entry(15f, 1));
        yvalues1.add(new Entry(12f, 2));
        yvalues1.add(new Entry(25f, 3));


        PieDataSet dataSet1 = new PieDataSet(yvalues1, "");

        ArrayList<String> xVals1 = new ArrayList<String>();

        xVals1.add("Flights");
        xVals1.add("Car Rentals");
        xVals1.add("Hotels");
        xVals1.add("Retail Stores");

        PieData data_pie1 = new PieData(xVals1, dataSet1);
        // In Percentage
        dataSet1.setValueFormatter(new PercentFormatter());
        // Default value
        //data.setValueFormatter(new DefaultValueFormatter(0));
        pie1.setData(data_pie1);
        //   pie.setDescription("This is Pie Chart");
        pie1.setDrawHoleEnabled(true);
        pie1.setTransparentCircleRadius(58f);

        pie1.setHoleRadius(58f);
        //   pie.setCenterText("Redeemed vs Earned");
        dataSet1.setColors(ColorTemplate.LIBERTY_COLORS);
       // pie1.setHoleColor(getContext().getResources().getColor(R.color.colorBlack));

        dataSet1.setValueTextSize(13f);
        dataSet1.setValueTextColor(Color.BLACK);
        /////////////////////////////////


        ///////////////piechart2
        pie2 = (PieChart) view.findViewById(R.id.piechart2);
        pie1.setUsePercentValues(true);

        ArrayList<Entry> yvalues2 = new ArrayList<Entry>();
        yvalues2.add(new Entry(8f, 0));
        yvalues2.add(new Entry(15f, 1));
        yvalues2.add(new Entry(12f, 2));
        yvalues2.add(new Entry(25f, 3));
        yvalues2.add(new Entry(23f, 4));
        yvalues2.add(new Entry(17f, 5));


        PieDataSet dataSet2 = new PieDataSet(yvalues2, "");

        ArrayList<String> xVals2 = new ArrayList<String>();

        xVals2.add("January");
        xVals2.add("Feburary");
        xVals2.add("March");
        xVals2.add("April");
        xVals2.add("May");
        xVals2.add("June");

        PieData data_pie2 = new PieData(xVals2, dataSet2);
        // In Percentage
        dataSet2.setValueFormatter(new PercentFormatter());
        // Default value
        //data.setValueFormatter(new DefaultValueFormatter(0));
        pie2.setData(data_pie2);
        //   pie.setDescription("This is Pie Chart");
        pie2.setDrawHoleEnabled(true);
        pie2.setTransparentCircleRadius(58f);

        pie2.setHoleRadius(58f);
       // pie2.setHoleColor(getContext().getResources().getColor(R.color.colorBlack));
        //   pie.setCenterText("Redeemed vs Earned");
        dataSet2.setColors(ColorTemplate.COLORFUL_COLORS);

        dataSet2.setValueTextSize(13f);
        dataSet2.setValueTextColor(Color.WHITE);

        return view;
    }




    /*@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void initToolBar() {
        //wishlist_toolbar = (Toolbar) findViewById(R.id.toolbar_mens_clothing);
        dash_tool.setTitle(R.string.toolbar_for_dashboard);
        dash_tool.setTitleTextColor(0xFFFFFFFF);
        ((AppCompatActivity)getActivity()).setSupportActionBar(dash_tool);
    }*/

}
