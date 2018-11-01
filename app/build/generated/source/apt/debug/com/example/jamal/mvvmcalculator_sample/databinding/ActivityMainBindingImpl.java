package com.example.jamal.mvvmcalculator_sample.databinding;
import com.example.jamal.mvvmcalculator_sample.R;
import com.example.jamal.mvvmcalculator_sample.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements com.example.jamal.mvvmcalculator_sample.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guidelineVertical05, 19);
        sViewsWithIds.put(R.id.guidelineVertical25, 20);
        sViewsWithIds.put(R.id.guidelineVertical50, 21);
        sViewsWithIds.put(R.id.guidelineVertical75, 22);
        sViewsWithIds.put(R.id.guidelineVertical95, 23);
        sViewsWithIds.put(R.id.guidelineHorizontal05, 24);
        sViewsWithIds.put(R.id.guidelineHorizontal35, 25);
        sViewsWithIds.put(R.id.guidelineHorizontal95, 26);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener tvTextandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of calculatorViewModel.observableValue.get()
            //         is calculatorViewModel.observableValue.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(tvText);
            // localize variables for thread safety
            // calculatorViewModel.observableValue
            android.databinding.ObservableField<java.lang.String> calculatorViewModelObservableValue = null;
            // calculatorViewModel
            com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel calculatorViewModel = mCalculatorViewModel;
            // calculatorViewModel.observableValue != null
            boolean calculatorViewModelObservableValueJavaLangObjectNull = false;
            // calculatorViewModel.observableValue.get()
            java.lang.String calculatorViewModelObservableValueGet = null;
            // calculatorViewModel != null
            boolean calculatorViewModelJavaLangObjectNull = false;



            calculatorViewModelJavaLangObjectNull = (calculatorViewModel) != (null);
            if (calculatorViewModelJavaLangObjectNull) {


                calculatorViewModelObservableValue = calculatorViewModel.getObservableValue();

                calculatorViewModelObservableValueJavaLangObjectNull = (calculatorViewModelObservableValue) != (null);
                if (calculatorViewModelObservableValueJavaLangObjectNull) {




                    calculatorViewModelObservableValue.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityMainBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[17]
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[18]
            , (android.widget.Button) bindings[10]
            , (android.widget.Button) bindings[9]
            , (android.widget.Button) bindings[8]
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[7]
            , (android.widget.Button) bindings[13]
            , (android.widget.Button) bindings[12]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[11]
            , (android.widget.Button) bindings[15]
            , (android.widget.Button) bindings[14]
            , (android.widget.Button) bindings[16]
            , (android.support.constraint.Guideline) bindings[24]
            , (android.support.constraint.Guideline) bindings[25]
            , (android.support.constraint.Guideline) bindings[26]
            , (android.support.constraint.Guideline) bindings[19]
            , (android.support.constraint.Guideline) bindings[20]
            , (android.support.constraint.Guideline) bindings[21]
            , (android.support.constraint.Guideline) bindings[22]
            , (android.support.constraint.Guideline) bindings[23]
            , (android.widget.TextView) bindings[1]
            );
        this.btnClear.setTag(null);
        this.btnDivide.setTag(null);
        this.btnDot.setTag(null);
        this.btnEight.setTag(null);
        this.btnEqual.setTag(null);
        this.btnFive.setTag(null);
        this.btnFour.setTag(null);
        this.btnMinus.setTag(null);
        this.btnMultiplication.setTag(null);
        this.btnNine.setTag(null);
        this.btnOne.setTag(null);
        this.btnPlus.setTag(null);
        this.btnSeven.setTag(null);
        this.btnSix.setTag(null);
        this.btnThree.setTag(null);
        this.btnTwo.setTag(null);
        this.btnZero.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new com.example.jamal.mvvmcalculator_sample.generated.callback.OnClickListener(this, 15);
        mCallback2 = new com.example.jamal.mvvmcalculator_sample.generated.callback.OnClickListener(this, 2);
        mCallback16 = new com.example.jamal.mvvmcalculator_sample.generated.callback.OnClickListener(this, 16);
        mCallback9 = new com.example.jamal.mvvmcalculator_sample.generated.callback.OnClickListener(this, 9);
        mCallback1 = new com.example.jamal.mvvmcalculator_sample.generated.callback.OnClickListener(this, 1);
        mCallback13 = new com.example.jamal.mvvmcalculator_sample.generated.callback.OnClickListener(this, 13);
        mCallback8 = new com.example.jamal.mvvmcalculator_sample.generated.callback.OnClickListener(this, 8);
        mCallback14 = new com.example.jamal.mvvmcalculator_sample.generated.callback.OnClickListener(this, 14);
        mCallback7 = new com.example.jamal.mvvmcalculator_sample.generated.callback.OnClickListener(this, 7);
        mCallback11 = new com.example.jamal.mvvmcalculator_sample.generated.callback.OnClickListener(this, 11);
        mCallback6 = new com.example.jamal.mvvmcalculator_sample.generated.callback.OnClickListener(this, 6);
        mCallback12 = new com.example.jamal.mvvmcalculator_sample.generated.callback.OnClickListener(this, 12);
        mCallback5 = new com.example.jamal.mvvmcalculator_sample.generated.callback.OnClickListener(this, 5);
        mCallback17 = new com.example.jamal.mvvmcalculator_sample.generated.callback.OnClickListener(this, 17);
        mCallback4 = new com.example.jamal.mvvmcalculator_sample.generated.callback.OnClickListener(this, 4);
        mCallback10 = new com.example.jamal.mvvmcalculator_sample.generated.callback.OnClickListener(this, 10);
        mCallback3 = new com.example.jamal.mvvmcalculator_sample.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.calculatorViewModel == variableId) {
            setCalculatorViewModel((com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCalculatorViewModel(@Nullable com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel CalculatorViewModel) {
        this.mCalculatorViewModel = CalculatorViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.calculatorViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCalculatorViewModelObservableValue((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCalculatorViewModelObservableValue(android.databinding.ObservableField<java.lang.String> CalculatorViewModelObservableValue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.databinding.ObservableField<java.lang.String> calculatorViewModelObservableValue = null;
        com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel calculatorViewModel = mCalculatorViewModel;
        java.lang.String calculatorViewModelObservableValueGet = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (calculatorViewModel != null) {
                    // read calculatorViewModel.observableValue
                    calculatorViewModelObservableValue = calculatorViewModel.getObservableValue();
                }
                updateRegistration(0, calculatorViewModelObservableValue);


                if (calculatorViewModelObservableValue != null) {
                    // read calculatorViewModel.observableValue.get()
                    calculatorViewModelObservableValueGet = calculatorViewModelObservableValue.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnClear.setOnClickListener(mCallback1);
            this.btnDivide.setOnClickListener(mCallback2);
            this.btnDot.setOnClickListener(mCallback16);
            this.btnEight.setOnClickListener(mCallback5);
            this.btnEqual.setOnClickListener(mCallback17);
            this.btnFive.setOnClickListener(mCallback9);
            this.btnFour.setOnClickListener(mCallback8);
            this.btnMinus.setOnClickListener(mCallback7);
            this.btnMultiplication.setOnClickListener(mCallback3);
            this.btnNine.setOnClickListener(mCallback6);
            this.btnOne.setOnClickListener(mCallback12);
            this.btnPlus.setOnClickListener(mCallback11);
            this.btnSeven.setOnClickListener(mCallback4);
            this.btnSix.setOnClickListener(mCallback10);
            this.btnThree.setOnClickListener(mCallback14);
            this.btnTwo.setOnClickListener(mCallback13);
            this.btnZero.setOnClickListener(mCallback15);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvText, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvTextandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvText, calculatorViewModelObservableValueGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 15: {
                // localize variables for thread safety
                // calculatorViewModel
                com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel calculatorViewModel = mCalculatorViewModel;
                // calculatorViewModel != null
                boolean calculatorViewModelJavaLangObjectNull = false;



                calculatorViewModelJavaLangObjectNull = (calculatorViewModel) != (null);
                if (calculatorViewModelJavaLangObjectNull) {



                    calculatorViewModel.onClick('0');
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // calculatorViewModel
                com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel calculatorViewModel = mCalculatorViewModel;
                // calculatorViewModel != null
                boolean calculatorViewModelJavaLangObjectNull = false;



                calculatorViewModelJavaLangObjectNull = (calculatorViewModel) != (null);
                if (calculatorViewModelJavaLangObjectNull) {



                    calculatorViewModel.onClick('/');
                }
                break;
            }
            case 16: {
                // localize variables for thread safety
                // calculatorViewModel
                com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel calculatorViewModel = mCalculatorViewModel;
                // calculatorViewModel != null
                boolean calculatorViewModelJavaLangObjectNull = false;



                calculatorViewModelJavaLangObjectNull = (calculatorViewModel) != (null);
                if (calculatorViewModelJavaLangObjectNull) {



                    calculatorViewModel.onClick('.');
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // calculatorViewModel
                com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel calculatorViewModel = mCalculatorViewModel;
                // calculatorViewModel != null
                boolean calculatorViewModelJavaLangObjectNull = false;



                calculatorViewModelJavaLangObjectNull = (calculatorViewModel) != (null);
                if (calculatorViewModelJavaLangObjectNull) {



                    calculatorViewModel.onClick('5');
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // calculatorViewModel
                com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel calculatorViewModel = mCalculatorViewModel;
                // calculatorViewModel != null
                boolean calculatorViewModelJavaLangObjectNull = false;



                calculatorViewModelJavaLangObjectNull = (calculatorViewModel) != (null);
                if (calculatorViewModelJavaLangObjectNull) {



                    calculatorViewModel.onClick('c');
                }
                break;
            }
            case 13: {
                // localize variables for thread safety
                // calculatorViewModel
                com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel calculatorViewModel = mCalculatorViewModel;
                // calculatorViewModel != null
                boolean calculatorViewModelJavaLangObjectNull = false;



                calculatorViewModelJavaLangObjectNull = (calculatorViewModel) != (null);
                if (calculatorViewModelJavaLangObjectNull) {



                    calculatorViewModel.onClick('2');
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // calculatorViewModel
                com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel calculatorViewModel = mCalculatorViewModel;
                // calculatorViewModel != null
                boolean calculatorViewModelJavaLangObjectNull = false;



                calculatorViewModelJavaLangObjectNull = (calculatorViewModel) != (null);
                if (calculatorViewModelJavaLangObjectNull) {



                    calculatorViewModel.onClick('4');
                }
                break;
            }
            case 14: {
                // localize variables for thread safety
                // calculatorViewModel
                com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel calculatorViewModel = mCalculatorViewModel;
                // calculatorViewModel != null
                boolean calculatorViewModelJavaLangObjectNull = false;



                calculatorViewModelJavaLangObjectNull = (calculatorViewModel) != (null);
                if (calculatorViewModelJavaLangObjectNull) {



                    calculatorViewModel.onClick('3');
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // calculatorViewModel
                com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel calculatorViewModel = mCalculatorViewModel;
                // calculatorViewModel != null
                boolean calculatorViewModelJavaLangObjectNull = false;



                calculatorViewModelJavaLangObjectNull = (calculatorViewModel) != (null);
                if (calculatorViewModelJavaLangObjectNull) {



                    calculatorViewModel.onClick('-');
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // calculatorViewModel
                com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel calculatorViewModel = mCalculatorViewModel;
                // calculatorViewModel != null
                boolean calculatorViewModelJavaLangObjectNull = false;



                calculatorViewModelJavaLangObjectNull = (calculatorViewModel) != (null);
                if (calculatorViewModelJavaLangObjectNull) {



                    calculatorViewModel.onClick('+');
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // calculatorViewModel
                com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel calculatorViewModel = mCalculatorViewModel;
                // calculatorViewModel != null
                boolean calculatorViewModelJavaLangObjectNull = false;



                calculatorViewModelJavaLangObjectNull = (calculatorViewModel) != (null);
                if (calculatorViewModelJavaLangObjectNull) {



                    calculatorViewModel.onClick('9');
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // calculatorViewModel
                com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel calculatorViewModel = mCalculatorViewModel;
                // calculatorViewModel != null
                boolean calculatorViewModelJavaLangObjectNull = false;



                calculatorViewModelJavaLangObjectNull = (calculatorViewModel) != (null);
                if (calculatorViewModelJavaLangObjectNull) {



                    calculatorViewModel.onClick('1');
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // calculatorViewModel
                com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel calculatorViewModel = mCalculatorViewModel;
                // calculatorViewModel != null
                boolean calculatorViewModelJavaLangObjectNull = false;



                calculatorViewModelJavaLangObjectNull = (calculatorViewModel) != (null);
                if (calculatorViewModelJavaLangObjectNull) {



                    calculatorViewModel.onClick('8');
                }
                break;
            }
            case 17: {
                // localize variables for thread safety
                // calculatorViewModel
                com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel calculatorViewModel = mCalculatorViewModel;
                // calculatorViewModel != null
                boolean calculatorViewModelJavaLangObjectNull = false;



                calculatorViewModelJavaLangObjectNull = (calculatorViewModel) != (null);
                if (calculatorViewModelJavaLangObjectNull) {



                    calculatorViewModel.onClick('=');
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // calculatorViewModel
                com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel calculatorViewModel = mCalculatorViewModel;
                // calculatorViewModel != null
                boolean calculatorViewModelJavaLangObjectNull = false;



                calculatorViewModelJavaLangObjectNull = (calculatorViewModel) != (null);
                if (calculatorViewModelJavaLangObjectNull) {



                    calculatorViewModel.onClick('7');
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // calculatorViewModel
                com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel calculatorViewModel = mCalculatorViewModel;
                // calculatorViewModel != null
                boolean calculatorViewModelJavaLangObjectNull = false;



                calculatorViewModelJavaLangObjectNull = (calculatorViewModel) != (null);
                if (calculatorViewModelJavaLangObjectNull) {



                    calculatorViewModel.onClick('6');
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // calculatorViewModel
                com.example.jamal.mvvmcalculator_sample.mvvm.CalculatorViewModel calculatorViewModel = mCalculatorViewModel;
                // calculatorViewModel != null
                boolean calculatorViewModelJavaLangObjectNull = false;



                calculatorViewModelJavaLangObjectNull = (calculatorViewModel) != (null);
                if (calculatorViewModelJavaLangObjectNull) {



                    calculatorViewModel.onClick('*');
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): calculatorViewModel.observableValue
        flag 1 (0x2L): calculatorViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}