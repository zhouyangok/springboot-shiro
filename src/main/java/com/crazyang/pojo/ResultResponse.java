package com.crazyang.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @ClassName ResultResponse
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/7/8 下午8:22.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultResponse {

    private int code;

    private String msg;

    private Map body;


}
