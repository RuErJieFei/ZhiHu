package com.scs.soft.zhihu.api.domain.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName Special
 * @Description 专题
 * @Author xiaobinggan
 * @Date 2020/1/15 12:17 下午
 * @Version 1.0
 **/

@Data
@Builder
public class Special {
    private String specialId;
    private String title;
    private String introduction;
    private String banner;
    private Integer viewCount;
    private Integer followersCount;
    private Date updated;
}
