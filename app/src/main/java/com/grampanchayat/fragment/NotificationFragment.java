package com.grampanchayat.fragment;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.grampanchayat.R;
import com.grampanchayat.utils.Constants;

/**
 * Created by SUHAS on 26/05/2016.
 */
public class NotificationFragment extends Fragment {

    private Context mContext;
    private RecyclerView cardList;
    private RelativeLayout rlEmpty;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.notification_fragment_layout, container, false);
        mContext = getActivity();
        getActivity().setTitle(R.string.notification);
        init(view);
        return view;
    }
    private void init(View view) {
        cardList = (RecyclerView) view.findViewById(R.id.cardList);
        rlEmpty =(RelativeLayout) view.findViewById(R.id.rl_empty);
        cardList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(mContext);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        cardList.setLayoutManager(llm);
    }
}
