package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.domain.vo.ExploreVo;
import com.scs.soft.zhihu.api.mapper.ColumnMapper;
import com.scs.soft.zhihu.api.mapper.FavoriteMapper;
import com.scs.soft.zhihu.api.mapper.RoundTableMapper;
import com.scs.soft.zhihu.api.mapper.SpecialMapper;
import com.scs.soft.zhihu.api.service.ExploreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName ExploreServiceImpl
 * @Description 发现
 * @Author xiaobinggan
 * @Date 2020/1/22 10:46 上午
 * @Version 1.0
 **/
@Service
public class ExploreServiceImpl implements ExploreService {
    @Resource
    private SpecialMapper specialMapper;
    @Resource
    private RoundTableMapper roundTableMapper;
    @Resource
    private FavoriteMapper favoriteMapper;
    @Resource
    private ColumnMapper columnMapper;

    @Override
    public ExploreVo selectByPage(int currentPage, int count) {
        int dealCount = (currentPage - 1) * count;
        ExploreVo exploreVos = ExploreVo.builder().specials(specialMapper.selectByPage(dealCount, count))
                .roundTables(roundTableMapper.selectByPage(dealCount, count))
                .favorites(favoriteMapper.selectByPage(dealCount, count))
                .columns(columnMapper.selectByPage(dealCount, count)).build();
        return exploreVos;
    }
}
