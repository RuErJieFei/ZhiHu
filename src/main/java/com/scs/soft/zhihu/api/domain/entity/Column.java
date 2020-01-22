package com.scs.soft.zhihu.api.domain.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName Column
 * @Description 专栏
 * @Author xiaobinggan
 * @Date 2020/1/22 10:11 上午
 * @Version 1.0
 **/
@Data
@Builder
public class Column {
    private Integer id;
    private String title;
    private String description;
    private String url;
    private String image_url;
    private Integer followers;
    private Integer articles_count;
}
