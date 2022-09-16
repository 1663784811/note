package com.cyyaw.car.driver;

import com.cyyaw.car.StatusChange;

/**
 * 在线状态
 */
public class DriverOffLineStatus implements StatusChange {

    /**
     * @param driver  司机
     * @param toDriverStatus 改变至状态
     * @return 是否改变成功
     */
    public Boolean changeStatus(Driver driver, DriverStatus toDriverStatus) {
        // 判断原状态与新状态

        return true;
    }


}
