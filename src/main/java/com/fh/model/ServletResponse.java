package com.fh.model;

public class ServletResponse {
    private int cdde;

    private String mm;

    private Object data;

    public static ServletResponse success(Object data){
        return new ServletResponse(200,"操作成功",data);
    }

    public static ServletResponse success(){
        return new ServletResponse(200,"操作成功");
    }

    public ServletResponse(int cdde, Object data) {
        this.cdde = cdde;
        this.data = data;
    }

    public ServletResponse() {
    }

    public ServletResponse(int cdde, String mm, Object data) {
        this.cdde = cdde;
        this.mm = mm;
        this.data = data;
    }

    public int getCdde() {
        return cdde;
    }

    public void setCdde(int cdde) {
        this.cdde = cdde;
    }

    public String getMm() {
        return mm;
    }

    public void setMm(String mm) {
        this.mm = mm;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
