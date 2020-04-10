package com.cdsxt.ego.rpc.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class TbOrderItem implements Serializable {
    private String id;

    /**
    * 商品id
    */
    private String itemId;

    /**
    * 订单id
    */
    private String orderId;

    /**
    * 商品购买数量
    */
    private Integer num;

    /**
    * 商品标题
    */
    private String title;

    /**
    * 商品单价
    */
    private Long price;

    /**
    * 商品总金额
    */
    private Integer totalFee;

    /**
    * 商品图片地址
    */
    private String picPath;

    private static final long serialVersionUID = 1L;
}