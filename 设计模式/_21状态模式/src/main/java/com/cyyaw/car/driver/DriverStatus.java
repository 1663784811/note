package com.cyyaw.car.driver;


/**
 * 司机状态
 */
public enum DriverStatus {

    OFFLINE("off_line", "离线"),
    ONLINE("on_line", "在线"),
    PREPARE("prepare", "准备")
    ;

    private String code;
    private String note;

    DriverStatus(String code, String note){
        this.code = code;
        this.note = note;
    }




}
