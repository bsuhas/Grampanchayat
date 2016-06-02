package com.grampanchayat.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.grampanchayat.R;
import com.grampanchayat.models.PropertyDetailModel;

import java.util.List;

/**
 * @ Firstcry
 * Created by suhasbachewar on 2/6/16.
 */
public class Form8TopFormAdapter extends RecyclerView.Adapter<Form8TopFormAdapter.MyViewHolder> {

    private List<PropertyDetailModel> moviesList;


    public Form8TopFormAdapter(List<PropertyDetailModel> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.form8_entry_malamata_mahiti_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        PropertyDetailModel propertyDetailModel = moviesList.get(position);
        holder.malmataNum.setText(propertyDetailModel.getMalmataNum());
        holder.homeType.setText(propertyDetailModel.getHomeType());
        holder.homeLength.setText(propertyDetailModel.getHomeLength());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public Button btnDelete;
        public TextView malmataNum, homeType, homeLength,homeWidth,homeArea,txtAddr,txtWardName,txtBusiness;
        public TextView txtOwnerName,txtYearRent,txtMalmataDetails,txtHomeNum,txtSrNum,txtAnukrmank,txtBandhkam,txtBuildYear,txtUseFor;

        public MyViewHolder(View view) {
            super(view);
            malmataNum = (TextView) view.findViewById(R.id.txt_malmata_num);
            homeType  = (TextView) view.findViewById(R.id.txt_home_type);
            homeLength = (TextView) view.findViewById(R.id.txt_length);
            homeWidth = (TextView) view.findViewById(R.id.txt_width);
            homeArea = (TextView) view.findViewById(R.id.txt_area);

            txtAddr = (TextView) view.findViewById(R.id.txt_addr);
            txtWardName = (TextView) view.findViewById(R.id.txt_ward_name);
            txtBusiness = (TextView) view.findViewById(R.id.txt_business);
            txtOwnerName = (TextView) view.findViewById(R.id.txt_owner_name);
            txtYearRent = (TextView) view.findViewById(R.id.txt_year_rent);

            txtMalmataDetails = (TextView) view.findViewById(R.id.txt_malmata_details);
            txtHomeNum = (TextView) view.findViewById(R.id.txt_home_num);
            txtSrNum = (TextView) view.findViewById(R.id.txt_sr_num);
            txtAnukrmank = (TextView) view.findViewById(R.id.txt_anukrmank);
            txtBandhkam = (TextView) view.findViewById(R.id.txt_bandhkam);
            txtBuildYear = (TextView) view.findViewById(R.id.txt_build_year);
            txtUseFor = (TextView) view.findViewById(R.id.txt_use_for);
            btnDelete = (Button) view.findViewById(R.id.btn_delete);
        }
    }
}
