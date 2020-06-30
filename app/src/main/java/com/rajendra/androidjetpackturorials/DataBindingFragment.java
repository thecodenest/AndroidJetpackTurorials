package com.rajendra.androidjetpackturorials;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rajendra.androidjetpackturorials.databinding.DataBindingFragmentBinding;
import com.rajendra.androidjetpackturorials.databinding.UserData;


public class DataBindingFragment extends Fragment {

    private DataBindingFragmentBinding dataBindingFragmentBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       dataBindingFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.data_binding_fragment, container, false);
       View view = dataBindingFragmentBinding.getRoot();

      // dataBindingFragmentBinding.name.setText("Rajendra");
       //dataBindingFragmentBinding.email.setText("xyz@gmail.com");
        dataBindingFragmentBinding.setUserData(new UserData("Raj","abc@gmail.com"));
       return view;
    }
}