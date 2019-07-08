package com.crazyang.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName ResultBody
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/7/8 下午8:22.
 */

public class ResultBody  implements Serializable {

    private List rows;

    private ResultPage page;

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public ResultPage getPage() {
        return page;
    }

    public void setPage(ResultPage page) {
        this.page = page;
    }
}

