package com.grampanchayat.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.grampanchayat.R;
import com.grampanchayat.models.PropertyOwnerDetailModel;

import java.util.List;

/**
 * @ Firstcry
 * Created by suhasbachewar on 2/6/16.
 */
public class Form8EntryPropertyOwnerDetailAdapter extends RecyclerView.Adapter<Form8EntryPropertyOwnerDetailAdapter.MyViewHolder> {

    private List<PropertyOwnerDetailModel> PropertyOwnerDetailModelList;


    public Form8EntryPropertyOwnerDetailAdapter(List<PropertyOwnerDetailModel> PropertyOwnerDetailModelList) {
        this.PropertyOwnerDetailModelList = PropertyOwnerDetailModelList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.form8_entry_property_owner_detail_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        PropertyOwnerDetailModel propertyOwnerDetailModel = PropertyOwnerDetailModelList.get(position);
        holder.txtKhatedar.setText(propertyOwnerDetailModel.getKhatedar());
        holder.txtName.setText(propertyOwnerDetailModel.getName());
        holder.txtAddr.setText(propertyOwnerDetailModel.getAddr());
        holder.txtWifeName.setText(propertyOwnerDetailModel.getWifeName());
        holder.txtMobileNum.setText(propertyOwnerDetailModel.getMobileNum());
    }

    @Override
    public int getItemCount() {
        return PropertyOwnerDetailModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public Button btnDelete;
        public TextView txtKhatedar, txtName, txtAddr,txtWifeName,txtMobileNum;
        public MyViewHolder(View view) {
            super(view);
            txtKhatedar = (TextView) view.findViewById(R.id.txt_khatedar);
            txtName = (TextView) view.findViewById(R.id.txt_name);
            txtAddr = (TextView) view.findViewById(R.id.txt_addr);
            txtWifeName = (TextView) view.findViewById(R.id.txt_wifename);
            txtMobileNum = (TextView) view.findViewById(R.id.txt_mobile_num);
            btnDelete = (Button) view.findViewById(R.id.btn_delete);
        }
    }
}
