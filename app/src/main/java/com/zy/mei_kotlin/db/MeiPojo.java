package com.zy.mei_kotlin.db;

import android.util.Log;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import static com.zy.mei_kotlin.db.MeiDataProperty.TABLE_NAME;

/**
 * Created by Simon on 2017/6/6.
 */

@Entity(nameInDb = "mei")
public class MeiPojo implements MeiDataProperty{

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "Title")
    private String title;


    @Generated(hash = 1621369954)
    public MeiPojo(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    @Generated(hash = 1815116642)
    public MeiPojo() {
    }


    public Long getId() {
        return id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
