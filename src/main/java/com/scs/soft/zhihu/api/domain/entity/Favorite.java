package com.scs.soft.zhihu.api.domain.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName Favorite
 * @Description 收藏
 * @Author xiaobinggan
 * @Date 2020/1/20 2:28 下午
 * @Version 1.0
 **/
@Data
@Builder
public class Favorite {
    private Integer id;
    private String title;
    private String creator_name;
    private String creator_avatar;
    private Integer followers;
    private String total_count;
    private String question_title;
    private String answer_author_name;
    private String answer_content;
    private Integer voteup_count;
    private Integer comment_count;
}
