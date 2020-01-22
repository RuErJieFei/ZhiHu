package com.scs.soft.zhihu.api.domain.vo;

import com.scs.soft.zhihu.api.domain.entity.Column;
import com.scs.soft.zhihu.api.domain.entity.Favorite;
import com.scs.soft.zhihu.api.domain.entity.RoundTable;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ExploreVo
 * @Description 发现视图
 * @Author xiaobinggan
 * @Date 2020/1/22 10:01 上午
 * @Version 1.0
 **/
@Data
@Builder
public class ExploreVo {
    private List<Map> specials;
    private List<RoundTable> roundTables;
    private List<Favorite> favorites;
    private List<Column> columns;
}
