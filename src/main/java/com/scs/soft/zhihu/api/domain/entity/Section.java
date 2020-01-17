package com.scs.soft.zhihu.api.domain.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName Section
 * @Description 标签
 * @Author xiaobinggan
 * @Date 2020/1/15 12:28 下午
 * @Version 1.0
 **/
@Data
@Builder
public class Section {
    private String sectionId;
    private String specialId;
    private String sectionTitle;
}
