package com.android.stephen.dahomepension.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.android.stephen.dahomepension.R;
import com.android.stephen.dahomepension.databinding.ActivityBookingPageBinding;
import com.android.stephen.dahomepension.fragment.FragConfirmation;
import com.android.stephen.dahomepension.fragment.FragPersonalInfo;
import com.android.stephen.dahomepension.fragment.FragRoomDetails;
import com.android.stephen.dahomepension.fragment.FragSearchResult;
import com.android.stephen.dahomepension.utils.Helper;

/**
 * Created by Stephen Uy on 1/9/2017.
 */

public class BookingPage extends AppCompatActivity {

    ActivityBookingPageBinding activityBookingPageBinding;
    FragSearchResult fragSearchResult;
    FragRoomDetails fragRoomDetails;
    FragPersonalInfo fragPersonalInfo;
    FragConfirmation fragConfirmation;
    private String tagSearchResult = "search_result";
    private String tagRoomDetails = "room_details";
    private String tagPersonalInfo = "personal_info";
    private String tagConfirmation = "confirmation";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_page);
        setUpToolBar();
        setUpFragments();
    }

    private void setUpFragments() {
        fragSearchResult = new FragSearchResult();
        fragRoomDetails = new FragRoomDetails();
        fragPersonalInfo = new FragPersonalInfo();
        fragConfirmation = new FragConfirmation();
        Helper.addFragment(this, fragSearchResult, R.id.content_frame, tagSearchResult);
    }

    private void setUpToolBar() {
        setSupportActionBar(activityBookingPageBinding.toolbarBookingPage);
    }
}
