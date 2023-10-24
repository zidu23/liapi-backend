package com.wlb.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wlb.liapicommon.model.entity.InterfaceInfo;

/**
* @author wlb
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-10-21 10:05:59
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    /**
     * xxx
     * @param interfaceInfo xxx
     * @param add xxx
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

}
