package com.zy.mei_kotlin.base;

/**
 * Created by yunzou on 17-8-22.
 */

public interface BasePresenter<T extends BaseView> {
    T getView();
}
