package com.zy.mei_kotlin.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Simon on 2017/6/6.
 */

@Entity
public class Task {

    @Id(autoincrement = true)
    private long id;

    @Property
    private int state;

    @Generated(hash = 453676529)
    public Task(long id, int state) {
        this.id = id;
        this.state = state;
    }

    @Generated(hash = 733837707)
    public Task() {
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
