package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.domain.entity.Favorite;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName FavoriteMapper
 * @Description 收藏映射
 * @Author xiaobinggan
 * @Date 2020/1/20 6:18 下午
 * @Version 1.0
 **/
public interface FavoriteMapper {
    /**
     * 获取部分收藏数据
     *
     * @param dealCount
     * @param count
     * @return
     */
    @Select("SELECT id , title , creator_name , creator_avatar , followers , " +
            "total_count , question_title , answer_author_name , answer_content ," +
            "voteup_count , comment_count  FROM t_favorite ORDER BY id LIMIT #{dealCount} , #{count}")
    List<Favorite> selectByPage(int dealCount, int count);
}
