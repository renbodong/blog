package com.zq.blogcommon.utils;


import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2019/11/14 23:41
 */

public class BaseRes<T> implements Serializable {

    private static final long serialVersionUID = 1242650709580044198L;
    private String RES_CODE = ResCodeAndMsg.CODE_SUCCESS;
    private String RES_MSG = ResCodeAndMsg.MSG_SUCCESS;
    private T data;
    private String extMsg;
    private int count;
    private Date sysDate = new Date();

    public BaseRes(String RES_CODE, String RES_MSG, T data, String extMsg,int count) {
        this.RES_CODE = RES_CODE;
        this.RES_MSG = RES_MSG;
        this.data = data;
        this.extMsg = extMsg;
        this.count = count;
    }

    public BaseRes(String RES_CODE, String RES_MSG, T data, String extMsg) {
        this.RES_CODE = RES_CODE;
        this.RES_MSG = RES_MSG;
        this.data = data;
        this.extMsg = extMsg;
    }

    public BaseRes(String RES_CODE, String RES_MSG, T data) {
        this.RES_CODE = RES_CODE;
        this.RES_MSG = RES_MSG;
        this.data = data;
    }

    public BaseRes(T data) {
        this.data = data;
    }

    public String getRES_CODE() {
        return RES_CODE;
    }

    public void setRES_CODE(String RES_CODE) {
        this.RES_CODE = RES_CODE;
    }

    public String getRES_MSG() {
        return RES_MSG;
    }

    public void setRES_MSG(String RES_MSG) {
        this.RES_MSG = RES_MSG;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getExtMsg() {
        return extMsg;
    }

    public void setExtMsg(String extMsg) {
        this.extMsg = extMsg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getSysDate() {
        return DateUtils.formatDate(sysDate,"yyyyMMddHHmmss");
    }

    public void setSysDate(Date sysDate) {
        this.sysDate = sysDate;
    }
}
