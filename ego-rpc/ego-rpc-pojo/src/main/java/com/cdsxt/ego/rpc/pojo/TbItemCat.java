package com.cdsxt.ego.rpc.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class TbItemCat implements Serializable {
    /**
    * 类目ID
    */
    private Long id;

    /**
    * 父类目ID=0时，代表的是一级的类目
    */
    private Long parentId;

    /**
    * 类目名称
    */
    private String name;

    /**
    * 状态。可选值:1(正常),2(删除)
    */
    private Integer status;

    /**
    * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
    */
    private Integer sortOrder;

    /**
    * 该类目是否为父类目，1为true，0为false
    */
    private Boolean isParent;

    /**
    * 创建时间
    */
    private Date created;

    /**
    * 创建时间
    */
    private Date updated;

    private static final long serialVersionUID = 1L;
}