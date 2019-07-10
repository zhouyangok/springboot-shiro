package com.crazyang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName Product
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/7/9 下午10:27.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Integer id;

    private String name;

    private String img;

    private String information;

    private Date createTime;
}
