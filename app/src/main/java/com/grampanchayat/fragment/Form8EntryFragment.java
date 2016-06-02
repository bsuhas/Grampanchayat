package com.grampanchayat.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.grampanchayat.R;
import com.grampanchayat.adapter.Form8TopFormAdapter;
import com.grampanchayat.models.PropertyDetailModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SUHAS on 26/05/2016.
 */
public class Form8EntryFragment extends Fragment implements View.OnClickListener {

    private Context mContext;
    private LinearLayout llMalmataMahiti;
//    private LinearLayout llForm8TopHeader1;
//    private LinearLayout llForm8TopHeader2;
//    private LinearLayout llForm8TopHeader3;
    private LinearLayout llMalmataDharakachiMahiti;
    private LinearLayout llKarachiMahiti;
    private TextView txtForm8TopHeader1;
    private TextView txtForm8TopHeader2;
    private TextView txtForm8TopHeader3;
    private RecyclerView rvTopEntryFromList;
    private Form8TopFormAdapter mAdapter;
    private List<PropertyDetailModel> propertyDetailModelList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.form_8_entry_main_fragment_layout, container, false);
        mContext = getActivity();
        getActivity().setTitle(R.string.form8);
        init(view);
        return view;
    }

    private void init(View view) {

        llMalmataMahiti = (LinearLayout) view.findViewById(R.id.ll_malmata_mahiti);
        llMalmataDharakachiMahiti = (LinearLayout) view.findViewById(R.id.ll_malmata_dharakachi_mahiti);
        llKarachiMahiti = (LinearLayout) view.findViewById(R.id.ll_karachi_mahiti);


//        llForm8TopHeader1 = (LinearLayout) view.findViewById(R.id.ll_form8_top_header1);
//        llForm8TopHeader2 = (LinearLayout) view.findViewById(R.id.ll_form8_top_header2);
//        llForm8TopHeader3 = (LinearLayout) view.findViewById(R.id.ll_form8_top_header3);

        txtForm8TopHeader1 = (TextView) view.findViewById(R.id.txt_form8_top_header1);
        txtForm8TopHeader2 = (TextView) view.findViewById(R.id.txt_form8_top_header2);
        txtForm8TopHeader3 = (TextView) view.findViewById(R.id.txt_form8_top_header3);

        txtForm8TopHeader1.setOnClickListener(this);
        txtForm8TopHeader2.setOnClickListener(this);
        txtForm8TopHeader3.setOnClickListener(this);
        prepareMovieData();
        rvTopEntryFromList =(RecyclerView) view.findViewById(R.id.rv_topEntryFromList);
        mAdapter = new Form8TopFormAdapter(propertyDetailModelList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(mContext);
        rvTopEntryFromList.setLayoutManager(mLayoutManager);
        rvTopEntryFromList.setItemAnimator(new DefaultItemAnimator());
        rvTopEntryFromList.setAdapter(mAdapter);


    }

    public void toggle_contents(View v) {

        if (v.isShown()) {
            slide_up(mContext, v);
            v.setVisibility(View.GONE);
        } else {
            v.setVisibility(View.VISIBLE);
            slide_down(mContext, v);
        }
    }

    public void slide_down(Context ctx, View v) {

        Animation a = AnimationUtils.loadAnimation(ctx, R.anim.slide_down);
        if (a != null) {
            a.reset();
            if (v != null) {
                v.clearAnimation();
                v.startAnimation(a);
            }
        }
    }

    public void slide_up(Context ctx, View v) {

        Animation a = AnimationUtils.loadAnimation(ctx, R.anim.slide_up);
        if (a != null) {
            a.reset();
            if (v != null) {
                v.clearAnimation();
                v.startAnimation(a);
            }
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.txt_form8_top_header1:
                toggle_contents(llMalmataMahiti);
                break;

            case R.id.txt_form8_top_header2:
                toggle_contents(llMalmataDharakachiMahiti);
                break;
            case R.id.txt_form8_top_header3:
                toggle_contents(llKarachiMahiti);
                break;
        }
    }
    private void prepareMovieData() {
        PropertyDetailModel propertyDetailModel = new PropertyDetailModel("Mad Max: Fury Road", "Action & Adventure", "2015");
        propertyDetailModelList.add(propertyDetailModel);

        propertyDetailModel = new PropertyDetailModel("Inside Out", "Animation, Kids & Family", "2015");
        propertyDetailModelList.add(propertyDetailModel);

//        propertyDetailModel = new PropertyDetailModel("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
//        propertyDetailModelList.add(propertyDetailModel);
//
//        propertyDetailModel = new PropertyDetailModel("Shaun the Sheep", "Animation", "2015");
//        propertyDetailModelList.add(propertyDetailModel);
//
//        propertyDetailModel = new PropertyDetailModel("The Martian", "Science Fiction & Fantasy", "2015");
//        propertyDetailModelList.add(propertyDetailModel);
//
//        propertyDetailModel = new PropertyDetailModel("Mission: Impossible Rogue Nation", "Action", "2015");
//        propertyDetailModelList.add(propertyDetailModel);
//
//        propertyDetailModel = new PropertyDetailModel("Up", "Animation", "2009");
//        propertyDetailModelList.add(propertyDetailModel);
//
//        propertyDetailModel = new PropertyDetailModel("Star Trek", "Science Fiction", "2009");
//        propertyDetailModelList.add(propertyDetailModel);
//
//        propertyDetailModel = new PropertyDetailModel("The LEGO PropertyDetailModel", "Animation", "2014");
//        propertyDetailModelList.add(propertyDetailModel);
//
//        propertyDetailModel = new PropertyDetailModel("Iron Man", "Action & Adventure", "2008");
//        propertyDetailModelList.add(propertyDetailModel);
//
//        propertyDetailModel = new PropertyDetailModel("Aliens", "Science Fiction", "1986");
//        propertyDetailModelList.add(propertyDetailModel);
//
//        propertyDetailModel = new PropertyDetailModel("Chicken Run", "Animation", "2000");
//        propertyDetailModelList.add(propertyDetailModel);
//
//        propertyDetailModel = new PropertyDetailModel("Back to the Future", "Science Fiction", "1985");
//        propertyDetailModelList.add(propertyDetailModel);
//
//        propertyDetailModel = new PropertyDetailModel("Raiders of the Lost Ark", "Action & Adventure", "1981");
//        propertyDetailModelList.add(propertyDetailModel);
//
//        propertyDetailModel = new PropertyDetailModel("Goldfinger", "Action & Adventure", "1965");
//        propertyDetailModelList.add(propertyDetailModel);
//
//        propertyDetailModel = new PropertyDetailModel("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
//        propertyDetailModelList.add(propertyDetailModel);

//        mAdapter.notifyDataSetChanged();
    }
}
