package com.crazyang.controller;

import com.crazyang.pojo.ResultResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @ClassName ResultController
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/7/8 下午8:25.
 */

@RestController
@RequestMapping("/result")
public class ResultController {


    @RequestMapping("/map")
    public ResultResponse getMap(){
        ResultResponse response = new ResultResponse();
        return response;
    }
}
