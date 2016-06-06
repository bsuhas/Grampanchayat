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
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
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
    private EditText edtPropertyNum, edtArea, edtLength, edtWidth, edtAddress, edtWardName, edtOwnerName;
    private EditText edtMalmataDetails, edtYearlyRent, edtHomeNum, edtSurveyNum, edtAnukrmank, edtBandhkam, edtBuildYear;
    private Spinner spHomeType, spBusiness, spUseFor, spCustomer;
    private EditText edtCustName, edtCustAddress, edtWifeName, edtCustMobileNum;
    private Button btnPropertyDetailSave,btnPropertyDetailNew,btnCustDetailSave, btnCustDetailNew;
    private Spinner spHealthTax,spLandInfo,spWaterBill,spElectricityTax,spBhandwaliMulyaPadath;
    private EditText edtJaminichaDrHeactori,edtJaminichaDrPerMeter,edtConcession,edtOldHomeTaxBill,edtRoadName;
    private String[] yesNoArray = {"निवडा", "होय","नाही"};
    private String[] useForArray = {"निवडा", "निवासी","औध्योगिक","वाणिज्यिक"};


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

        txtForm8TopHeader1 = (TextView) view.findViewById(R.id.txt_form8_top_header1);
        txtForm8TopHeader2 = (TextView) view.findViewById(R.id.txt_form8_top_header2);
        txtForm8TopHeader3 = (TextView) view.findViewById(R.id.txt_form8_top_header3);

        edtPropertyNum = (EditText) view.findViewById(R.id.edt_property_num);
        spHomeType = (Spinner) view.findViewById(R.id.sp_home_type);
        edtLength = (EditText) view.findViewById(R.id.edt_length);
        edtWidth = (EditText) view.findViewById(R.id.edt_width);
        edtArea = (EditText) view.findViewById(R.id.edt_area);

        edtAddress = (EditText) view.findViewById(R.id.edt_address);
        edtWardName = (EditText) view.findViewById(R.id.edt_ward_name);
        spBusiness = (Spinner) view.findViewById(R.id.sp_business);
        edtOwnerName = (EditText) view.findViewById(R.id.edt_owner_name);
        edtYearlyRent = (EditText) view.findViewById(R.id.edt_yearly_rent);

        edtMalmataDetails = (EditText) view.findViewById(R.id.edt_malmata_details);
        edtHomeNum = (EditText) view.findViewById(R.id.edt_home_num);
        edtSurveyNum = (EditText) view.findViewById(R.id.edt_sr_num);
        edtAnukrmank = (EditText) view.findViewById(R.id.edt_anukrmank);
        edtBandhkam = (EditText) view.findViewById(R.id.edt_bandhkam);

        edtBuildYear = (EditText) view.findViewById(R.id.edt_build_year);
        spUseFor = (Spinner) view.findViewById(R.id.sp_use_for);

        btnPropertyDetailSave = (Button) view.findViewById(R.id.btn_property_detail_save);
        btnPropertyDetailNew = (Button) view.findViewById(R.id.btn_property_detail_new);

        btnPropertyDetailSave.setOnClickListener(this);
        btnPropertyDetailNew.setOnClickListener(this);

//      Property Detail
        spCustomer = (Spinner) view.findViewById(R.id.sp_customer);
        edtCustName = (EditText) view.findViewById(R.id.edt_cust_name);
        edtCustAddress = (EditText) view.findViewById(R.id.edt_cust_address);
        edtWifeName = (EditText) view.findViewById(R.id.edt_wife_name);
        edtCustMobileNum = (EditText) view.findViewById(R.id.edt_cust_mobile_num);
        btnCustDetailSave = (Button) view.findViewById(R.id.btn_cust_detail_save);
        btnCustDetailNew = (Button) view.findViewById(R.id.btn_cust_detail_new);

        btnCustDetailSave.setOnClickListener(this);
        btnCustDetailNew.setOnClickListener(this);

        //Tax Pay Information
        spHealthTax = (Spinner)view.findViewById(R.id.sp_health_tax);
        spLandInfo = (Spinner)view.findViewById(R.id.sp_land_info);
        spWaterBill = (Spinner)view.findViewById(R.id.sp_water_bill);
        spElectricityTax = (Spinner)view.findViewById(R.id.sp_electricity_tax);
        edtJaminichaDrHeactori = (EditText) view.findViewById(R.id.edt_jaminicha_dr_heactori);
        edtJaminichaDrPerMeter = (EditText) view.findViewById(R.id.edt_jaminicha_dr_per_meter);
        edtConcession = (EditText) view.findViewById(R.id.edt_concession);
        edtOldHomeTaxBill = (EditText) view.findViewById(R.id.edt_old_home_tax_bill);
        edtRoadName = (EditText) view.findViewById(R.id.edt_road_name);
        spBhandwaliMulyaPadath = (Spinner)view.findViewById(R.id.sp_bhandwali_mulya_padath);

        txtForm8TopHeader1.setOnClickListener(this);
        txtForm8TopHeader2.setOnClickListener(this);
        txtForm8TopHeader3.setOnClickListener(this);

        setAdapterToSpinner(spBusiness);
        setAdapterToUseForSpinner(spUseFor);
        setAdapterToSpinner(spCustomer);

//        Property Detail
//        preparePropertyDetailData();
        rvTopEntryFromList = (RecyclerView) view.findViewById(R.id.rv_topEntryFromList);
        mAdapter = new Form8EntryPropertyDetailAdapter(propertyDetailModelList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(mContext);
        rvTopEntryFromList.setLayoutManager(mLayoutManager);
        rvTopEntryFromList.setItemAnimator(new DefaultItemAnimator());
        rvTopEntryFromList.setAdapter(mAdapter);

//        Property Owner Detail
//        preparePropertyOwnerData();
        rvPropertyOwnerDetail = (RecyclerView) view.findViewById(R.id.rv_property_owner_detail);
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
            case R.id.btn_cust_detail_save:
                break;
            case R.id.btn_cust_detail_new:
                break;
        }
    }
    void setAdapterToSpinner(Spinner spinner) {
        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(mContext, android.R.layout.simple_spinner_item, yesNoArray); //selected item will look like a spinner set from XML
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerArrayAdapter);
    }

    void setAdapterToUseForSpinner(Spinner spinner) {
        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(mContext, android.R.layout.simple_spinner_item, useForArray); //selected item will look like a spinner set from XML
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerArrayAdapter);
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
        PropertyOwnerDetailModel propertyDetailOwnerModel = new PropertyOwnerDetailModel("Mad Max: Fury Road", "Action & Adventure", "2015", "Priynaka", "98506586985");
        propertyOwnerDetailModelList.add(propertyDetailOwnerModel);

        propertyDetailOwnerModel = new PropertyOwnerDetailModel("Inside Out", "Animation, Kids & Family", "2015", "Priynaka", "98506586985");
        propertyOwnerDetailModelList.add(propertyDetailOwnerModel);

    }
}
