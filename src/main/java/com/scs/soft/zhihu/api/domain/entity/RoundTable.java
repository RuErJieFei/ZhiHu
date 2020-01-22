package com.scs.soft.zhihu.api.domain.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName RoundTable
 * @Description 圆桌
 * @Author xiaobinggan
 * @Date 2020/1/18 9:08 上午
 * @Version 1.0
 **/
@Data
@Builder
public class RoundTable {
    private Integer id;
    private String name;
    private String banner;
    private String url_token;
    private Integer visits_count;
    private Integer include_count;
}
