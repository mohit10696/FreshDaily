package com.example.freshdaily;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zoho.salesiqembed.ZohoSalesIQ;

public class chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        //ZohoSalesIQ.init(this, "your app key", "your access key");
        ZohoSalesIQ.init(getApplication() , "45xrGyIS2DrHrSx8LPVYaefKyTIzb8ApgFTT6rbYnyJOhOhAkZQdt2uYKKrBFIAb_in", "VXYedrQX8Skkl8hBUChWx%2FThmma%2FSCn9zV4pxPsw3Vyl91l4IjM8fpwgsYjLNXW8BZS2ind7lJppFjtNO685sskC%2B7h%2Fw%2FZUuMUmoCX%2BuTAiUtoObo%2BxyK4o5sR%2BW23AuOYA1YNKpgCrqkBaCMosdxvJqLssWmb4vAoMmiENoA4%3D");

    }
}
