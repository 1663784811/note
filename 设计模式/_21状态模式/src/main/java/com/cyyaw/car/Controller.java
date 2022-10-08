package com.cyyaw.car;

import com.cyyaw.car.driver.Driver;
import com.cyyaw.car.driver.DriverOnLineStatus;
import com.cyyaw.car.driver.DriverStatus;

public class Controller {


    public void driverStatus(Driver driver) {

        DriverStatus newStatus = DriverStatus.ONLINE;
        DriverOnLineStatus driverOnlineStatus = new DriverOnLineStatus();
        // ====================
        // 司机 状态
        // 在线状态
        driver.setStatus(DriverStatus.ONLINE);
        // ==== 变化为接单状态
        Boolean aBoolean = driverOnlineStatus.changeStatus(driver, newStatus);
        // 状态改变成功

    }

    public void passengerStatus() {


    }


}
