package com.shuzhu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品规格表
 * </p>
 *
 * @author Poor
 * @since 2022-12-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ProductAmount对象", description="商品规格表")
public class ProductAmount implements Serializable {


    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "积分商品id")
    private Integer productId;

    @ApiModelProperty(value = "数量/份量")
    private String amount;


}
