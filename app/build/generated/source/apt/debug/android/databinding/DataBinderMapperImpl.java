package android.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.example.jamal.mvvmcalculator_sample.DataBinderMapperImpl());
  }
}
