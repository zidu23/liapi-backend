package com.wlb.liapicommon.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.wlb.liapicommon.model.entity.Post;

/**
 * 帖子视图
 * @author wlb
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PostVO extends Post {

    /**
     * 是否已点赞
     */
    private Boolean hasThumb;

    private static final long serialVersionUID = 1L;
}