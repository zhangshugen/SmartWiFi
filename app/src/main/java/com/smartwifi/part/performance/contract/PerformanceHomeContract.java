package com.smartwifi.part.performance.contract;

import android.databinding.ViewDataBinding;

import com.smartwifi.widget.mvvm.model.BaseModel;
import com.smartwifi.widget.mvvm.view.BaseMVVMView;
import com.smartwifi.widget.mvvm.viewmodel.BaseViewModel;

/**
 * @Author zhangshurong
 * @CreateTime 2018/7/9
 * @Describe
 */

public class PerformanceHomeContract {
    public abstract static class Model extends BaseModel {


    }

    public interface View extends BaseMVVMView {


    }

    public abstract static class ViewModel<V extends BaseMVVMView, D extends ViewDataBinding, M extends BaseModel> extends BaseViewModel<V, D, M> {


    }

}
