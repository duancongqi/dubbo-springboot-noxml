package com.nft.util;

public class ResultUtil {
    // 消息头meta 存放状态信息 code message
    private int code;
    private String msg;
    private long count;
    private Object data;
    public static final int STATUS_OK = 0;
    public static final int STATUS_STOP = 1;
    public static final int STATUS_FAIL = -1;
    public static final String STATUS_YZCG = "token验证成功";
    public static final String STATUS_YZSB = "token验证失败";

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResultUtil ok(String statusMsg, Object data) {
        this.setCode(STATUS_OK);
        this.setMsg(statusMsg);
        this.setData(data);
        return this;
    }

    public ResultUtil ok(int statusCode, String statusMsg, Object data) {
        this.setCode(statusCode);
        this.setMsg(statusMsg);
        this.setData(data);
        return this;
    }

    public ResultUtil ok(int statusCode, String statusMsg, long count, Object data) {
        this.setCode(statusCode);
        this.setMsg(statusMsg);
        this.setCount(count);
        this.setData(data);
        return this;
    }
}
