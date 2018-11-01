package com.example.jamal.mvvmcalculator_sample.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.Guideline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final Button btnClear;

  @NonNull
  public final Button btnDivide;

  @NonNull
  public final Button btnDot;

  @NonNull
  public final Button btnEight;

  @NonNull
  public final Button btnEqual;

  @NonNull
  public final Button btnFive;

  @NonNull
  public final Button btnFour;

  @NonNull
  public final Button btnMinus;

  @NonNull
  public final Button btnMultiplication;

  @NonNull
  public final Button btnNine;

  @NonNull
  public final Button btnOne;

  @NonNull
  public final Button btnPlus;

  @NonNull
  public final Button btnSeven;

  @NonNull
  public final Button btnSix;

  @NonNull
  public final Button btnThree;

  @NonNull
  public final Button btnTwo;

  @NonNull
  public final Button btnZero;

  @NonNull
  public final Guideline guidelineHorizontal05;

  @NonNull
  public final Guideline guidelineHorizontal35;

  @NonNull
  public final Guideline guidelineHorizontal95;

  @NonNull
  public final Guideline guidelineVertical05;

  @NonNull
  public final Guideline guidelineVertical25;

  @NonNull
  public final Guideline guidelineVertical50;

  @NonNull
  public final Guideline guidelineVertical75;

  @NonNull
  public final Guideline guidelineVertical95;

  @NonNull
  public final TextView tvText;

  @Bindable
  protected CalculatorViewModel mCalculatorViewModel;

  protected ActivityMainBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button btnClear, Button btnDivide, Button btnDot, Button btnEight,
      Button btnEqual, Button btnFive, Button btnFour, Button btnMinus, Button btnMultiplication,
      Button btnNine, Button btnOne, Button btnPlus, Button btnSeven, Button btnSix,
      Button btnThree, Button btnTwo, Button btnZero, Guideline guidelineHorizontal05,
      Guideline guidelineHorizontal35, Guideline guidelineHorizontal95,
      Guideline guidelineVertical05, Guideline guidelineVertical25, Guideline guidelineVertical50,
      Guideline guidelineVertical75, Guideline guidelineVertical95, TextView tvText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnClear = btnClear;
    this.btnDivide = btnDivide;
    this.btnDot = btnDot;
    this.btnEight = btnEight;
    this.btnEqual = btnEqual;
    this.btnFive = btnFive;
    this.btnFour = btnFour;
    this.btnMinus = btnMinus;
    this.btnMultiplication = btnMultiplication;
    this.btnNine = btnNine;
    this.btnOne = btnOne;
    this.btnPlus = btnPlus;
    this.btnSeven = btnSeven;
    this.btnSix = btnSix;
    this.btnThree = btnThree;
    this.btnTwo = btnTwo;
    this.btnZero = btnZero;
    this.guidelineHorizontal05 = guidelineHorizontal05;
    this.guidelineHorizontal35 = guidelineHorizontal35;
    this.guidelineHorizontal95 = guidelineHorizontal95;
    this.guidelineVertical05 = guidelineVertical05;
    this.guidelineVertical25 = guidelineVertical25;
    this.guidelineVertical50 = guidelineVertical50;
    this.guidelineVertical75 = guidelineVertical75;
    this.guidelineVertical95 = guidelineVertical95;
    this.tvText = tvText;
  }

  public abstract void setCalculatorViewModel(@Nullable CalculatorViewModel calculatorViewModel);

  @Nullable
  public CalculatorViewModel getCalculatorViewModel() {
    return mCalculatorViewModel;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.example.jamal.mvvmcalculator_sample.R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.example.jamal.mvvmcalculator_sample.R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityMainBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityMainBinding)bind(component, view, com.example.jamal.mvvmcalculator_sample.R.layout.activity_main);
  }
}
