package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    Button btnA, btnB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        btnA = findViewById(R.id.btnReplaceA);
//        btnB = findViewById(R.id.btnReplaceB);
//        // Quản lý Fragment
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        // Tương tác với Fragment
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        // bắt sự kiện hiển thị Fragment A
//        btnA.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentA fragmentA = new FragmentA();
//                fragmentTransaction.add(R.id.framecontent, fragmentA);
//                fragmentTransaction.commit();
//            }
//        });
//        btnB.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentB fragmentB = new FragmentB();
//                fragmentTransaction.add(R.id.framecontent, fragmentB);
//                fragmentTransaction.commit();
//            }
//        });
    }
    // add FA
    public void addFragmentA(View view){
        // Quản lý Fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        // Tương tác với Fragment
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // Tạo tên để đưa vào ngăn xếp
        fragmentTransaction.addToBackStack("FragA");
        fragmentTransaction.add(R.id.framecontent, new FragmentA(), "FragA");
        //fragmentTransaction.replace(R.id.framecontent, new FragmentA());
        fragmentTransaction.commit();
    }
    // add FB
    public void addFragmentB(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.addToBackStack("FragB");
        fragmentTransaction.add(R.id.framecontent, new FragmentB(), "FragB");
        //fragmentTransaction.replace(R.id.framecontent, new FragmentB());
        fragmentTransaction.commit();
    }
    public void RemoveA(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragmentA = (FragmentA) getSupportFragmentManager().findFragmentByTag("FragA");
        if(fragmentA != null){
            fragmentTransaction.remove(fragmentA);
            fragmentTransaction.commit();
        }
        else {
            Toast.makeText(this, "Fragment không tồn tại", Toast.LENGTH_SHORT ).show();
        }
    }
    public void RemoveB(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragmentB = (FragmentB) getSupportFragmentManager().findFragmentByTag("FragB");
        if(fragmentB != null){
            fragmentTransaction.remove(fragmentB);
            fragmentTransaction.commit();
        }
        else {
            Toast.makeText(this, "Fragment không tồn tại", Toast.LENGTH_SHORT ).show();
        }
    }
    // bắt sự kiện backstack
    public void Back(View view){
        getSupportFragmentManager().popBackStack();
    }
    // bắt sự kiện ấn phím trên thiết bị
    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0){
            getSupportFragmentManager().popBackStack();
        }
        else {
            super.onBackPressed();
        }
    }
}