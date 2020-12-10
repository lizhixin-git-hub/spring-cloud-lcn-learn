package com.lzx.lcn.pay.vo;

import java.io.Serializable;

public class PayTable implements Serializable {

    private Integer id;

    private Byte isPay;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getIsPay() {
        return isPay;
    }

    public void setIsPay(Byte isPay) {
        this.isPay = isPay;
    }
}
