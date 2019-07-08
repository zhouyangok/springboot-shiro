package com.crazyang.pojo;

import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ResultResponse
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/7/8 下午8:22.
 */

public class ResultResponse<T> implements Serializable {

    private int code;

    private String msg;

    private ResultBody body;

    Map map = new HashMap();

    public ResultResponse() {

    }

    public ResultResponse(int code, String message, ResultBody body) {
        this.code = code;
        this.msg = message;
        this.body = body;
    }

    public static ResultResponse success() {
        return new ResultResponse();
    }

    public static Map getData() {
        Map map = new HashMap();
        map.put("code", 200);
        map.put("msg", "success");
        //实体数据
        DataObject dataObject = new DataObject();
        dataObject.setId(1);
        dataObject.setAddress("shanghai");
        dataObject.setMsg("jintian");
        dataObject.setDate("2019");
        List list = new ArrayList<>();
        list.add(dataObject);
        list.add(dataObject);

        ResultBody resultBody = new ResultBody();
        ResultPage resultPage = new ResultPage();
        resultPage.setCurrent(1);
        resultPage.setOffset(10);
        resultPage.setRows(13);

        resultBody.setRows(list);
        resultBody.setPage(resultPage);
        map.put("body", resultBody);

        return map;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultBody getBody() {
        return body;
    }

    public void setBody(ResultBody body) {
        this.body = body;
    }
}
