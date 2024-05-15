package com.spirit.springbootinit.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * [tree] 
 */
@ApiModel(description = "")
@Data
public class Tree implements Serializable {

    /**
     * 标识码
     */
    @ApiModelProperty("标识码")
    private String bsm;

    /**
     * 名字
     */
    @ApiModelProperty("名字")
    private String name;

    /**
     * 值
     */
    @ApiModelProperty("值")
    private String value;

    /**
     * 单价
     */
    @ApiModelProperty("单价")
    private Double unitprice;


}
