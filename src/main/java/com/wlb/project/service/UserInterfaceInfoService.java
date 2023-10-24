package com.wlb.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wlb.liapicommon.model.entity.UserInterfaceInfo;

/**
* @author wlb
* @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Service
* @createDate 2023-10-21 11:55:59
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
