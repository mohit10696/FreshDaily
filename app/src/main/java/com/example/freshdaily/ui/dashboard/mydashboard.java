package com.example.freshdaily.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.freshdaily.R;
import com.example.freshdaily.chat;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.zoho.salesiqembed.ZohoSalesIQ;

public class mydashboard extends Fragment {
    BottomNavigationView BottomNavigation;
    Button btn;
    View root;
    EditText search;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       root  = inflater.inflate(R.layout.fragment_maindashboard, container, false);
        BottomNavigation = root.findViewById(R.id.navigation);
        BottomNavigation.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        openFragment(HomeFragment.newInstance("", ""));
        btn = root.findViewById(R.id.b);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"je" , Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getActivity(), chat.class);
                startActivity(intent);

            }
        });
        return root;


    }
    public void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    switch (menuItem.getItemId()) {
                        case R.id.home:
                            openFragment(HomeFragment.newInstance("", ""));
                            return true;

                        case R.id.wallets:
                            openFragment(walletFragment.newInstance("", ""));
                            return true;

                        /*case R.id.b:
                            Toast.makeText(getContext(),"je" , Toast.LENGTH_LONG).show();
                            //ZohoSalesIQ.init(this , "45xrGyIS2DrHrSx8LPVYaefKyTIzb8ApgFTT6rbYnyJOhOhAkZQdt2uYKKrBFIAb_in", "VXYedrQX8Skkl8hBUChWx%2FThmma%2FSCn9zV4pxPsw3Vyl91l4IjM8fpwgsYjLNXW8BZS2ind7lJppFjtNO685sskC%2B7h%2Fw%2FZUuMUmoCX%2BuTAiUtoObo%2BxyK4o5sR%2BW23AuOYA1YNKpgCrqkBaCMosdxvJqLssWmb4vAoMmiENoA4%3D");
                            Intent intent = new Intent(getActivity(), chat.class);
                            startActivity(intent);*/
                    }
                    return false;
                }
            };
}
