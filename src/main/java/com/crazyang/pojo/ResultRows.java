package com.crazyang.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName ResultRows
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/7/8 下午8:23.
 */

public class ResultRows <T> implements Serializable {

    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
