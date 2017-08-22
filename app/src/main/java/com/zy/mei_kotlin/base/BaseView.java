package com.zy.mei_kotlin.base;

/**
 * Created by Simon on 2017/5/25.
 */

public interface BaseView<T extends BaseActivityPresenter> {

    T getPresenter();
}
