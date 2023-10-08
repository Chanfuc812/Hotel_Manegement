package com.example.hotelstars.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.provider.Settings;
import android.net.Uri;
import com.example.hotelstars.R;

import java.util.Objects;

public class RoomService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide(); //This Line hides the action bar
        setContentView(R.layout.activity_room_service);
    }

    public void onHomePageClick(View view) {
        Intent intent = new Intent(RoomService.this, HomePageActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }

    public void onProfilePage(View view) {
        Intent intent = new Intent(RoomService.this, UserProfile.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }

    public void checkin_button(View view) {
        Intent intent = new Intent(RoomService.this, Checkin.class);
        startActivity(intent);
        finish();
    }

    public void onWifiSettingsClick(View view) {
        Intent wifiSettingsIntent = new Intent(Settings.ACTION_WIFI_SETTINGS);
        startActivity(wifiSettingsIntent);
    }

    public void onCallClick(View view) {
        String phoneNumber = "0926547935";
        Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null));
        startActivity(callIntent);
    }

    //public void onSendMessageClick(View view) {
        //String phoneNumber = "0926547935";
        //Intent messageIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + phoneNumber));
        //startActivity(messageIntent);}

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(RoomService.this, UserMenu.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
}