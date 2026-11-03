package com.kesiai.client.service.driver;

import com.kesiai.client.dto.ResponseDTO;
import com.kesiai.client.service.PlatformClient;
import com.kesiai.client.service.driver.dto.Command;

/**
 * 驱动管理客户端
 */
public interface DriverClient extends PlatformClient {

    /**
     * 发送指令
     *
     * @return 指令发送结果
     */
    ResponseDTO<String> sendCommand(Command command);

}
