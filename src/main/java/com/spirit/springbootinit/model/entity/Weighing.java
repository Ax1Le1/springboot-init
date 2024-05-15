package com.spirit.springbootinit.model.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


/**
 * [weighing]
 */
@ApiModel(description = "")
@Data
@TableName(value = "weighing")
public class Weighing implements Serializable {

    /**
     * 标识码
     */
    @ApiModelProperty("标识码")
    @NotNull(message = "[标识码]不能为空")
    @TableId
    private String bsm;

    /**
     * 第一次称重
     */
    @ApiModelProperty("第一次称重")
    private Double firstweighing;

    /**
     * 第一次称重类型
     */
    @ApiModelProperty("第一次称重类型")
    private String firsttype;

    /**
     * 第一次金额
     */
    @ApiModelProperty("第一次金额")
    private Double firstprice;

    /**
     * 第一次金额
     */
    @ApiModelProperty("第一次金额")
    private Double firstmonesy;

    /**
     * 第二次称重
     */
    @ApiModelProperty("第二次称重")
    private Double secondweighing;

    /**
     * 第二次称重类型
     */
    @ApiModelProperty("第二次称重类型")
    private String secondtype;

    /**
     * 第二次金额
     */
    @ApiModelProperty("第二次金额")
    private Double secondmonesy;
    /**
     * 第二次金额
     */
    @ApiModelProperty("第二次金额")
    private Double secondprice;
    /**
     * 第三次称重
     */
    @ApiModelProperty("第三次称重")
    private Double thirdweighing;

    /**
     * 第三次称重类型
     */
    @ApiModelProperty("第三次称重类型")
    private String thirdtype;

    /**
     * 第三次金额
     */
    @ApiModelProperty("第三次金额")
    private Double thirdmonesy;
    /**
     * 第三次金额
     */
    @ApiModelProperty("第三次金额")
    private Double thirdprice;

    /**
     * 总金额
     */
    @ApiModelProperty("总金额")
    private Double allmonesy;

    /**
     * 创建者
     */
    @ApiModelProperty("创建者")
    private String createBy;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * 更新者
     */
    @ApiModelProperty("更新者")
    private String editBy;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    private Date editTime;

    /**
     * 卖家
     */
    @ApiModelProperty("卖家")
    private String seller;

    /**
     * 卖家标识码
     */
    @ApiModelProperty("卖家标识码")
    private String sellerid;

    /**
     * 车重
     */
    @ApiModelProperty("车重")
    private Double carweight;


}
