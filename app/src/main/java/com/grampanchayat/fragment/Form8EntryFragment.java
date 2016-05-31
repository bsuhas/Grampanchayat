package com.grampanchayat.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.grampanchayat.R;

/**
 * Created by SUHAS on 26/05/2016.
 */
public class Form8EntryFragment extends Fragment implements View.OnClickListener {

    private Context mContext;
    private LinearLayout llMalmataMahiti;
    private LinearLayout llForm8TopHeader1;
    private LinearLayout llForm8TopHeader2;
    private LinearLayout llForm8TopHeader3;
    private LinearLayout llMalmataDharakachiMahiti;
    private LinearLayout llKarachiMahiti;

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


        llForm8TopHeader1 = (LinearLayout) view.findViewById(R.id.ll_form8_top_header1);
        llForm8TopHeader2 = (LinearLayout) view.findViewById(R.id.ll_form8_top_header2);
        llForm8TopHeader3 = (LinearLayout) view.findViewById(R.id.ll_form8_top_header3);

        llForm8TopHeader1.setOnClickListener(this);
        llForm8TopHeader2.setOnClickListener(this);
        llForm8TopHeader3.setOnClickListener(this);
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
            case R.id.ll_form8_top_header1:
                toggle_contents(llMalmataMahiti);
                break;

            case R.id.ll_form8_top_header2:
                toggle_contents(llMalmataDharakachiMahiti);
                break;
            case R.id.ll_form8_top_header3:
                toggle_contents(llKarachiMahiti);
                break;
        }
    }
}
