package com.example.demo;

public class WsResultBean {

//    {
//        createTime: 命令发送时间
//        data:{} 修改的命令
//        id: "7a"   websocket的id
//        returnMessage: "success"
//        status: "0"  0告诉前端需要根据data的命令修改  1无意义
//        type: 0：连接成功，1：发送给当前连接的用户，2：发送信息给其他用户，3：发送选区位置信息，999：用户连接断开
//        username: 用户名
//    }

    private String createTime;
    private String data;
    private String id;
    private String returnMessage;
    private int status;
    private int type;
    private String username;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
