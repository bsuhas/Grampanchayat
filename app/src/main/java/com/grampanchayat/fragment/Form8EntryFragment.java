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
import com.grampanchayat.adapter.Form8EntryPropertyDetailAdapter;
import com.grampanchayat.adapter.Form8EntryPropertyOwnerDetailAdapter;
import com.grampanchayat.models.PropertyDetailModel;
import com.grampanchayat.models.PropertyOwnerDetailModel;

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
    private Form8EntryPropertyDetailAdapter mAdapter;

    private List<PropertyDetailModel> propertyDetailModelList = new ArrayList<>();
    private List<PropertyOwnerDetailModel> propertyOwnerDetailModelList = new ArrayList<>();
    private RecyclerView rvPropertyOwnerDetail;
    private Form8EntryPropertyOwnerDetailAdapter mOwnerDetailAdapter;

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

        // Property Detail
        preparePropertyDetailData();

        rvTopEntryFromList =(RecyclerView) view.findViewById(R.id.rv_topEntryFromList);
        mAdapter = new Form8EntryPropertyDetailAdapter(propertyDetailModelList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(mContext);
        rvTopEntryFromList.setLayoutManager(mLayoutManager);
        rvTopEntryFromList.setItemAnimator(new DefaultItemAnimator());
        rvTopEntryFromList.setAdapter(mAdapter);

        //Property Owner Detail
        preparePropertyOwnerData();

        rvPropertyOwnerDetail =(RecyclerView) view.findViewById(R.id.rv_property_owner_detail);
        mOwnerDetailAdapter = new Form8EntryPropertyOwnerDetailAdapter(propertyOwnerDetailModelList);
        RecyclerView.LayoutManager mLayoutManager1 = new LinearLayoutManager(mContext);
        rvPropertyOwnerDetail.setLayoutManager(mLayoutManager1);
        rvPropertyOwnerDetail.setItemAnimator(new DefaultItemAnimator());
        rvPropertyOwnerDetail.setAdapter(mOwnerDetailAdapter);


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
    private void preparePropertyDetailData() {
        PropertyDetailModel propertyDetailModel = new PropertyDetailModel("Mad Max: Fury Road", "Action & Adventure", "2015");
        propertyDetailModelList.add(propertyDetailModel);

        propertyDetailModel = new PropertyDetailModel("Inside Out", "Animation, Kids & Family", "2015");
        propertyDetailModelList.add(propertyDetailModel);
//
//        mAdapter.notifyDataSetChanged();
    }
    private void preparePropertyOwnerData() {
        PropertyOwnerDetailModel propertyDetailOwnerModel = new PropertyOwnerDetailModel("Mad Max: Fury Road", "Action & Adventure", "2015","Priynaka","98506586985");
        propertyOwnerDetailModelList.add(propertyDetailOwnerModel);

        propertyDetailOwnerModel = new PropertyOwnerDetailModel("Inside Out", "Animation, Kids & Family", "2015","Priynaka","98506586985");
        propertyOwnerDetailModelList.add(propertyDetailOwnerModel);

    }
}
