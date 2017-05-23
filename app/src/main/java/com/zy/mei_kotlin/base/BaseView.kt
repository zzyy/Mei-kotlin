package com.zy.mei_kotlin.base

/**
 * Created by Simon on 2017/5/22.
 */
interface BaseView <T:BasePresent>{

    val presentClass : Class<T>
    var present :T?


}