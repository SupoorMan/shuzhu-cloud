package com.shuzhu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 小程序收货地址表
 * </p>
 *
 * @author Poor
 * @since 2022-12-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="AppletDeliveryAddress对象", description="小程序收货地址表")
public class AppletDeliveryAddress implements Serializable {


    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "小程序用户id")
    private Integer appletUserId;

    @ApiModelProperty(value = "收件人")
    private String receiver;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "省")
    private String province;

    @ApiModelProperty(value = "市")
    private String city;

    @ApiModelProperty(value = "区")
    private String area;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "默认地址: 0.否 1.是")
    private Integer defaults;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
