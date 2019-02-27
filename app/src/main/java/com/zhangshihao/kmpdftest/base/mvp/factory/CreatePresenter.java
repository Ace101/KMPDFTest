package com.zhangshihao.kmpdftest.base.mvp.factory;

import com.zhangshihao.kmpdftest.base.mvp.presenter.BasePresenter;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author:zhangshihao
 * @date:2019/2/26
 * @description:标注创建Presenter的注解
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface CreatePresenter {
    Class<? extends BasePresenter> value();
}
