package com.crazyang.pojo;

import java.io.Serializable;

/**
 * @ClassName ResultPage
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/7/8 下午8:23.
 */

public class ResultPage  implements Serializable {

    private Integer rows;

    private Integer current;

    private Integer offset;

    private Integer pages;

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
}
