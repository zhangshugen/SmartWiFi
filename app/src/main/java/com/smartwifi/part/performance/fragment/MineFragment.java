package com.smartwifi.part.performance.fragment;

import com.smartwifi.R;
import com.smartwifi.databinding.FragmentMineBinding;
import com.smartwifi.part.performance.viewmodel.MineFragmentViewModel;
import com.smartwifi.widget.mvvm.factory.CreateViewModel;
import com.smartwifi.widget.mvvm.view.BaseMVVMFragment;

/**
 * @Author zhangshurong
 * @CreateTime 2018/7/30
 * @Describe
 */

@CreateViewModel(MineFragmentViewModel.class)
public class MineFragment extends BaseMVVMFragment<MineFragmentViewModel,FragmentMineBinding> {
    @Override
    public int getLayoutId() {
        return R.layout.fragment_mine;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void initEvent() {

    }
}
