package com.crazyang.pojo;

/**
 * @ClassName Result
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/7/8 下午11:20.
 */

public class Result {
    private Integer code;//状态码
    private String msg;//消息
    private Object result;//数据对象

    /**
     * 无参构造器
     */
    public Result(){
        super();
    }

    /**
     * 只返回状态，状态码，消息
     * @param
     * @param code
     * @param massege
     */
    public Result( Integer code, String massege){
        super();
        this.code=code;
        this.msg=massege;
    }

    /**
     * 只返回状态，状态码，数据对象
     * @param code
     */
    public Result(Integer code, Object result){
        super();
        this.code=code;
        this.result=result;
    }

    /**
     * 返回全部信息即状态，状态码，消息，数据对象
     *
     * @param code
     * @param massege
     * @param result
     */
    public Result(Integer code, String massege, Object result){
        super();
        this.code=code;
        this.msg=massege;
        this.result=result;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }



    public String getMassege() {
        return msg;
    }

    public void setMassege(String massege) {
        this.msg = massege;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
