package com.example.jamal.mvvmcalculator_sample.model;

import android.arch.lifecycle.MutableLiveData;

import com.example.jamal.mvvmcalculator_sample.utils.Util;

public class Calculator {

     MutableLiveData<Float> result = new MutableLiveData<>() ;


    public void  add(int a, int  b ){
        result.postValue(Util.addition(a,b));
    }

    public MutableLiveData<Float> getResult() {
        return result;
    }

    public void setResult(MutableLiveData<Float> result) {
        this.result = result;
    }
}
