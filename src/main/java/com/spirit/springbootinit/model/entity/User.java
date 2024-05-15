package com.spirit.springbootinit.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 用户
 */
@TableName(value = "user")
@Data
public class User implements Serializable {

    /**
     * 标识码
     */
    @ApiModelProperty("标识码")
    @NotNull(message = "[标识码]不能为空")
    private String id;

    /**
     * 姓名
     */
    @ApiModelProperty("姓名")
    private String name;

    /**
     * 年龄
     */
    @ApiModelProperty("年龄")
    private Integer age;

    /**
     * 邮箱
     */
    @ApiModelProperty("邮箱")
    private String email;

    /**
     * 手机号
     */
    @ApiModelProperty("手机号")
    private String sjh;

    /**
     * 车重
     */
    @ApiModelProperty("车重")
    private Double carweight;

    /**
     * 账号
     */
    @ApiModelProperty("账号")
    private String userAccount;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    private String userPassword;
}