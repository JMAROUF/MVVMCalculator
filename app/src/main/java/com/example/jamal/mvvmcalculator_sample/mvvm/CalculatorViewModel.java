package com.example.jamal.mvvmcalculator_sample.mvvm;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;
import android.util.Log;
import android.widget.Toast;

import com.example.jamal.mvvmcalculator_sample.activities.MainActivity;
import com.example.jamal.mvvmcalculator_sample.model.Calculator;
import com.example.jamal.mvvmcalculator_sample.utils.Util;

public class CalculatorViewModel extends ViewModel {

    String TAG="viewModel";
    Calculator calculator;
    int val1,val2;
    char operand=' ';
    boolean first=false;
    ObservableField<String> observableValue ;

    public void init (){
        calculator = new Calculator();
        observableValue= new ObservableField<>("0");
    }

    public void onClick(char btn){

        switch(btn){
            case '+' :
                first=true;
               operand='+';
                break;
            case '-' :
                break;
            case '*' :
                operand='*';
                break;
            case '/' :
                operand='/';
                break;
            case '=' : first=false;

                switch (operand){
                    //TODO: implement all operations
                    case '+' :  calculator.add(val1,val2);
                    break;
                    default  : break;
                }
                break;
            case 'c' :
                    observableValue.set("");
                    val1=0;
                    val2=0;
                    first=false;
                    break;
            case '.' :
                val1+=val1/10;
                //TODO: implements decimal  values
                break;
            default :
                if(!first){
                    val1=Util.getVal(val1+String.valueOf(btn));
                    observableValue.set(String.valueOf((int)val1));
                }else{
                    val2=Util.getVal(val2+String.valueOf(btn));
                    observableValue.set(String.valueOf((int)val2));
                }
                break;
        }

    }

    public LiveData<Float> getResult() {
        return calculator.getResult();
    }



    public void showResult(){

        if(calculator.getResult().getValue()!=null) {
            observableValue.set(String.valueOf(calculator.getResult().getValue()));
        }else{
            observableValue.set("");
        }
        Log.d(TAG,"value is "+observableValue.get());

    }

    public ObservableField<String> getObservableValue() {
        return observableValue;
    }

    public void setObservableValue(ObservableField<String> observableValue) {
        this.observableValue = observableValue;
    }
}
