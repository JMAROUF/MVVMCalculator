package com.example.jamal.mvvmcalculator_sample.activities;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.jamal.mvvmcalculator_sample.databinding.ActivityMainBinding;
import com.example.jamal.mvvmcalculator_sample.R;
import com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel;

public class MainActivity extends AppCompatActivity {

    CalculatorViewModel calculatorViewModel;
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding();
    }
// android:text="@{calculatorViewModel.observableValue}"
    public void initDataBinding(){
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        calculatorViewModel= ViewModelProviders.of(this).get(CalculatorViewModel.class);
        calculatorViewModel.init();
        activityMainBinding.setCalculatorViewModel(calculatorViewModel);
        calculatorViewModel.getResult().observe(this, new Observer<Float>() {
            @Override
            public void onChanged(@Nullable Float aFloat) {
                showResult();
            }
        });
    }


    public void showResult(){
        calculatorViewModel.showResult();
        activityMainBinding.executePendingBindings();
    }
}
