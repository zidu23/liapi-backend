package com.wlb.liapicommon.service;

/**
 * 内部用户接口信息服务
 *
 * @author wlb
 */
public interface InnerUserInterfaceInfoService {

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
