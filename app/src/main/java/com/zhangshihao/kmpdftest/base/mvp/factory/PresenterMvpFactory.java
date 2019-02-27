package com.zhangshihao.kmpdftest.base.mvp.factory;

import com.zhangshihao.kmpdftest.base.mvp.presenter.BasePresenter;
import com.zhangshihao.kmpdftest.base.mvp.view.IBaseView;

/**
 * @author:zhangshihao
 * @date:2019/2/26
 * @description:
 */
public interface PresenterMvpFactory<V extends IBaseView, P extends BasePresenter<V>> {
    /**
     * 创建Presenter的接口方法
     *
     * @return 需要创建的Presenter
     */
    P createMvpPresenter();
}
