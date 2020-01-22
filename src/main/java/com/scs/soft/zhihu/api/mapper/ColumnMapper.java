package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.domain.entity.Column;
import com.scs.soft.zhihu.api.domain.vo.ExploreVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName ColumnMapper
 * @Description 专题映射
 * @Author xiaobinggan
 * @Date 2020/1/22 10:20 上午
 * @Version 1.0
 **/
public interface ColumnMapper {
    /**
     * 获取部分专栏数据
     *
     * @param dealCount
     * @param count
     * @return
     */
    @Select("SELECT id , title , description , url , image_url , " +
            "followers , articles_count FROM t_columns ORDER BY followers LIMIT #{dealCount} , #{count} ")
    List<Column> selectByPage(int dealCount, int count);
}
