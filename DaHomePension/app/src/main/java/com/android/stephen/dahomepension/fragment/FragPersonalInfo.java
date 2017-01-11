package com.android.stephen.dahomepension.fragment;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.stephen.dahomepension.R;
import com.android.stephen.dahomepension.callback.FragmentCallback;
import com.android.stephen.dahomepension.databinding.FragmentPersonalInfoBinding;
import com.android.stephen.dahomepension.databinding.FragmentSearchResultBinding;

public class FragPersonalInfo extends Fragment {
    private FragmentCallback fragmentCallback;
    FragmentPersonalInfoBinding fragPersonalInfoBinding;

    public FragPersonalInfo() {
        // Required empty public constructor
    }

    public static FragPersonalInfo newInstance(String param1, String param2) {
        FragPersonalInfo fragment = new FragPersonalInfo();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragPersonalInfoBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_personal_info,
                container, false);
        getActivity().setTitle("11 Jan - 12 Jan" + "\n" + "4 guests");
        return fragPersonalInfoBinding.getRoot();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        fragmentCallback = (FragmentCallback) context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
