package com.grampanchayat.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grampanchayat.R;

/**
 * Created by SUHAS on 05/06/2016.
 */
public class TaxPayFragment extends Fragment {
    private Context mContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tax_pay_layout, container, false);
        mContext = getActivity();
        getActivity().setTitle(R.string.tax_pay);
//        init(view);
        return view;
    }
}
