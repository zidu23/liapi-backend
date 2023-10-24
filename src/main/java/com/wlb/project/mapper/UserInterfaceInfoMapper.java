package com.wlb.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wlb.liapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}
