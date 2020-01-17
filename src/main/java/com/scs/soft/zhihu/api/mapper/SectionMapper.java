package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.domain.entity.Section;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName SectionMapper
 * @Description 标签映射
 * @Author xiaobinggan
 * @Date 2020/1/15 2:47 下午
 * @Version 1.0
 **/
public interface SectionMapper {
    /**
     * 查询所有专题的标签
     *
     * @param specialId
     * @return
     */
    @Select("SELECT * FROM t_section WHERE special_id = #{specialId}")
    List<Section> getSectionsBySpecialId(String specialId);
}
