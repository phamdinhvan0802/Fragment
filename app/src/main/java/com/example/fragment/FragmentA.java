package com.example.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

@SuppressWarnings("deprecation")
public class FragmentA extends Fragment {
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("AAA", "onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("AAA", "onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("AAA", "onCreateView");
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("AAA", "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("AAA", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("AAA", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("AAA", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("AAA", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("AAA", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("AAA", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("AAA", "onDetach");
    }
}
