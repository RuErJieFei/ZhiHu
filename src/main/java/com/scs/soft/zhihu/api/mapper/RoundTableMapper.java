package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.domain.entity.RoundTable;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName RoundTableMapper
 * @Description 圆桌
 * @Author xiaobinggan
 * @Date 2020/1/18 9.14 上午
 * @Version 1.0
 **/
public interface RoundTableMapper {
    /**
     * 获取所有圆桌
     *
     * @return
     */
    @Select("SELECT id , name , banner , url_token , visits_count , include_count FROM t_round_table ")
    List<RoundTable> selectAll();

    /**
     * 获取前四个圆桌
     *
     * @return
     */
    @Select("SELECT id , name , banner , url_token , visits_count , include_count FROM t_round_table  LIMIT 0,4")
    List<RoundTable> selectRecent();

    /**
     * 按页获取圆桌
     *
     * @param dealCount
     * @param count
     * @return
     */
    //分页语句的两个参数，分别表示当前页第一行记录的索引，每页的数据量
    //比如每页10条数据，第一页0-9，第二页10-19，从而可以推算一下关系
    @Select("SELECT id , name , banner , url_token , visits_count , include_count FROM t_round_table ORDER BY id LIMIT #{dealCount} , #{count}")
    List<RoundTable> selectByPage(int dealCount, int count);
}
