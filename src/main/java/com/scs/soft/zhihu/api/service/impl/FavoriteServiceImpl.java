package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.domain.entity.Favorite;
import com.scs.soft.zhihu.api.mapper.FavoriteMapper;
import com.scs.soft.zhihu.api.service.FavoriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName FavoriteServiceImpl
 * @Description 收藏
 * @Author xiaobinggan
 * @Date 2020/1/20 6:29 下午
 * @Version 1.0
 **/
@Service
public class FavoriteServiceImpl implements FavoriteService {
    @Resource
    private FavoriteMapper favoriteMapper;

    @Override
    public List<Favorite> selectByPage(int currentPage, int count) {
        int dealCount = (currentPage - 1) * count;
        return favoriteMapper.selectByPage(dealCount, count);
    }
}
