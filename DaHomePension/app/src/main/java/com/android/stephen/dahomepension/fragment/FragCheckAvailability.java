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
import com.android.stephen.dahomepension.databinding.FragmentCheckAvailabilityBinding;

public class FragCheckAvailability extends Fragment {
    private FragmentCallback fragmentCallback;
    FragmentCheckAvailabilityBinding fragmentCheckAvailabilityBinding;

    public FragCheckAvailability() {
        // Required empty public constructor
    }

    public static FragCheckAvailability newInstance(String param1, String param2) {
        FragCheckAvailability fragment = new FragCheckAvailability();
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
        fragmentCheckAvailabilityBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_check_availability,
                container, false);
        getActivity().setTitle("Check Availability");
        return fragmentCheckAvailabilityBinding.getRoot();
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
