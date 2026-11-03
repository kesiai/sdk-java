package com.kesiai.driver.event;

import com.kesiai.driver.config.BasicConfig;
import com.kesiai.driver.config.DriverSingleConfig;
import org.springframework.context.ApplicationEvent;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * 驱动重载事件
 */
public class DriverReloadApplicationEvent extends ApplicationEvent {

    private final DriverSingleConfig<BasicConfig<?>> driverConfig;

    public DriverSingleConfig<BasicConfig<?>> getDriverConfig() {
        return driverConfig;
    }

    public DriverReloadApplicationEvent(DriverSingleConfig<BasicConfig<?>> driverConfig) {
        super(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
        this.driverConfig = driverConfig;
    }

}
